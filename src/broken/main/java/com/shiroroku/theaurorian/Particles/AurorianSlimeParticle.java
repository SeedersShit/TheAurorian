package com.shiroroku.theaurorian.Particles;

import com.shiroroku.theaurorian.Registry.ItemRegistry;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleBreaking;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class AurorianSlimeParticle extends ParticleBreaking {
	public AurorianSlimeParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, ItemRegistry.Registry.AURORIANSLIMEBALL.getItem());
	}

	@SideOnly(Side.CLIENT)
	public static class Factory implements IParticleFactory {
		@Override
		public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... p_178902_15_) {
			return new AurorianSlimeParticle(worldIn, xCoordIn, yCoordIn, zCoordIn);
		}
	}
}
