package net.civicraft.civiCourts.object.type;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum WarrantType {
    ARREST(ItemStack.of(Material.IRON_CHAIN), "Arrest a player for a prior crime."),
    BENCH(ItemStack.of(Material.TRIAL_KEY), "Arrest a player for not complying with court rules."),
    SEARCH(ItemStack.of(Material.SPYGLASS), "Search a player or property."),
    NO_KNOCK(ItemStack.of(Material.OAK_DOOR), "Enter and search a property without permission restrictions.");

    private final ItemStack repItem;
    private final String description;

    WarrantType(ItemStack repItem, String description) {
        this.repItem = repItem;
        this.description = description;
    }

    public ItemStack getRepItem() {
        return repItem;
    }

    public String getDescription() {
        return description;
    }
}
