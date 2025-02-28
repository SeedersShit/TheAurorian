package com.shiroroku.theaurorian.Misc;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

import javax.annotation.Nonnull;

public class TPTATeleport extends Teleporter {

	public TPTATeleport(WorldServer world, double x, double y, double z) {
		super(world);
		this.worldServer = world;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	private final WorldServer worldServer;
	private final double x;
	private final double y;
	private final double z;

	@Override
	public void placeInPortal(@Nonnull Entity entity, float rotationYaw) {
		// The main purpose of this function is to *not* create a nether portal
		this.worldServer.getBlockState(new BlockPos((int) this.x, (int) this.y, (int) this.z));

		entity.setPosition(this.x, this.y, this.z);
		entity.motionX = 0.0f;
		entity.motionY = 0.0f;
		entity.motionZ = 0.0f;
	}

	public static void teleportToDimension(EntityPlayer player, int dimension, double x, double y, double z) {
		int oldDimension = player.getEntityWorld().provider.getDimension();
		EntityPlayerMP entityPlayerMP = (EntityPlayerMP) player;
		MinecraftServer server = player.getEntityWorld().getMinecraftServer();
		WorldServer worldServer = server.getWorld(dimension);
		player.addExperienceLevel(0);

		if (worldServer == null || worldServer.getMinecraftServer() == null) { //Dimension doesn't exist
			throw new IllegalArgumentException("Dimension: " + dimension + " doesn't exist!");
		}

		worldServer.getMinecraftServer().getPlayerList().transferPlayerToDimension(entityPlayerMP, dimension, new TPTATeleport(worldServer, x, y, z));
		player.setPositionAndUpdate(x, y, z);
		if (oldDimension == 1) {
			player.setPositionAndUpdate(x, y, z);
			worldServer.spawnEntity(player);
			worldServer.updateEntityWithOptionalForce(player, false);
		}
	}

}