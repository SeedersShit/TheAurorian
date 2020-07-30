package com.elseytd.theaurorian.Entities.Boss;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.MathHelper;

public class Spider_AILeap extends EntityAIBase {

	private Spider_Entity entity;
	private EntityLivingBase target;

	private float leapVelocity = 0.7f;
	private int minDistance = 20;

	public Spider_AILeap(Spider_Entity attacker) {
		this.entity = attacker;
		this.setMutexBits(5);
	}

	@Override
	public boolean shouldExecute() {
		this.target = this.entity.getAttackTarget();

		if (this.target == null) {
			return false;
		} else {
			double d0 = this.entity.getDistanceSq(this.target);
			if (d0 >= minDistance) {
				if (!this.entity.onGround) {
					return false;
				} else {
					return true;
				}
			} else {
				return false;
			}
		}
	}

	@Override
	public void updateTask() {
		this.entity.getLookHelper().setLookPositionWithEntity(target, (float) this.entity.getHorizontalFaceSpeed() * 2, (float) this.entity.getVerticalFaceSpeed() * 2);
	}

	@Override
	public boolean shouldContinueExecuting() {
		return !this.entity.onGround;
	}

	@Override
	public void startExecuting() {

		double d0 = this.target.posX - this.entity.posX;
		double d1 = this.target.posZ - this.entity.posZ;
		float f = MathHelper.sqrt(d0 * d0 + d1 * d1);

		double val1 = 2;
		double val2 = 4;

		if ((double) f >= 1.0E-4D) {
			this.entity.motionX += d0 / (double) f * 0.5D * val1 + this.entity.motionX * val2;
			this.entity.motionZ += d1 / (double) f * 0.5D * val1 + this.entity.motionZ * val2;
		}

		this.entity.motionY = (double) this.leapVelocity;
	}
}