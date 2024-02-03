package me.zircta.modernpotions;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Potion.class)
public class PotionMixin {
    @Mutable @Shadow @Final public int liquidColor;

    @Inject(method = "<init>", at = @At("TAIL"))
    public void changeColor(int potionID, ResourceLocation location, boolean badEffect, int potionColor, CallbackInfo ci) {
        switch (potionID) {
            case 1:
                liquidColor = 0x33EBFF;
                break;
            case 2:
                liquidColor = 0x8BAFE0;
                break;
            case 5:
                liquidColor = 0xFFC700;
                break;
            case 7:
                liquidColor = 0xA9656A;
                break;
            case 8:
                liquidColor = 0xFDFF84;
                break;
            case 12:
                liquidColor = 0xFF9900;
                break;
            case 13:
                liquidColor = 0x98DAC0;
                break;
            case 14:
                liquidColor = 0xF6F6F6;
                break;
            case 16:
                liquidColor = 0xC2FF66;
                break;
            case 19:
                liquidColor = 0x87A363;
                break;
        }
    }
}
