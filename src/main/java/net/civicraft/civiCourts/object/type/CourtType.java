package net.civicraft.civiCourts.object.type;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum CourtType {
    DISTRICT(ItemStack.of(Material.IRON_BLOCK)),
    FEDERAL(ItemStack.of(Material.GOLD_BLOCK)),
    SUPREME(ItemStack.of(Material.DIAMOND_BLOCK));

    private ItemStack rep;
    CourtType(ItemStack rep) {
        this.rep = rep;
    }

    public ItemStack getBlock() {
        return rep;
    }
}


