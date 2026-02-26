package net.civicraft.civiCourts.gui;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.OutlinePane;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import com.github.stefvanschie.inventoryframework.pane.util.Slot;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WarrantCreationGUI {
    public static void openGUI(Player player, Player target) {
        ChestGui gui = new ChestGui(3, "Warrant Creation");

        StaticPane pane = new StaticPane(Slot.fromIndex(10), 7, 1, Pane.Priority.HIGHEST);

        OutlinePane outline = new OutlinePane(9, 3);
        outline.addItem(new GuiItem(ItemStack.of(Material.GRAY_STAINED_GLASS)));

        gui.addPane(pane);
        gui.addPane(outline);
        gui.show(player);
    }

    private GuiItem typeSelector() {
        ItemStack item = new ItemStack(Material.AIR);
        /*
        I want to make a GUIItem that when clicked, rotates the type instead of opening a new GUI item to select a type or including all types in one
         */

        return new GuiItem(item, e -> {
           if (e.isLeftClick()) {
               //confirm selection
           } else if (e.isRightClick()){
               //cycle right
           } else {
               //do nothing for shift clicks or anything else. might not even need this -- prolly dont
           }
        });
    }
}
