package me.zircta.modernpotions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = ItemStack.class)
public class ItemStackMixin {
    @Redirect(method = "hasEffect", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item;hasEffect(Lnet/minecraft/item/ItemStack;)Z"))
    public boolean hasEffect(Item instance, ItemStack stack) {
        return stack.isItemEnchanted() && !(stack.getItem() instanceof ItemPotion);
    }
}