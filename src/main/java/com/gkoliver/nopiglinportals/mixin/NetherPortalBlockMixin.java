package com.gkoliver.nopiglinportals.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(NetherPortalBlock.class)
public class NetherPortalBlockMixin {
    @Inject(method = "randomTick", at=@At("HEAD"), cancellable = true)
    private void cancel(BlockState p_54937_, ServerLevel p_54938_, BlockPos p_54939_, Random p_54940_, CallbackInfo ci) {
        ci.cancel();
    }
}
