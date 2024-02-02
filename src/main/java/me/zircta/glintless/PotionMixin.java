package me.zircta.glintless;

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
        // This code is probably so bad 😭😭
        // Please forgive me, I'm a veryyy beginner dev
        if (potionID == 1) {
            liquidColor = 3402751;
        } else if (potionID == 2) {
            liquidColor = 9154528;
        } else if (potionID == 5) {
            liquidColor = 16762624;
        } else if (potionID == 7) {
            liquidColor = 11101546;
        } else if (potionID == 8) {
            liquidColor = 16646020;
        } else if (potionID == 12) {
            liquidColor = 16750848;
        } else if (potionID == 13) {
            liquidColor = 10017472;
        } else if (potionID == 14) {
            liquidColor = 16185078;
        } else if (potionID == 16) {
            liquidColor = 12779366;
        } else if (potionID == 19) {
            liquidColor = 8889187;
        }
    }
}
