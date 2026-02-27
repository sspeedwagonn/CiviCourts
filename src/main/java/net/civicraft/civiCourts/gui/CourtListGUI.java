package net.civicraft.civiCourts.gui;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CourtListGUI {
    public static void openGUI(Player player) {
        ChestGui gui = new ChestGui(4, "Courts");

        /*
        for every existing court
        get a court item
         */
        gui.show(player);
    }

    private GuiItem courtItem() {
        ItemStack item = new ItemStack(Material.DIAMOND); //fix to get item based on court type
        return new GuiItem(item);//left click: teleport (check perms), right click: start GPS
    }
}
