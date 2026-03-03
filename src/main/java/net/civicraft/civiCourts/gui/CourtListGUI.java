package net.civicraft.civiCourts.gui;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import com.github.stefvanschie.inventoryframework.pane.util.Slot;
import net.civicraft.civiCourts.manager.CourtManager;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class CourtListGUI {
    public static void openGUI(Player player) {
        ChestGui gui = new ChestGui(4, "Courts");

        StaticPane pane = new StaticPane(Slot.fromIndex(9), 9, 1);
        /*
        for every existing court
        get a court item
         */
        for (Map.Entry<Component, Location> entry : CourtManager.getCourtLocations().entrySet()) {
            pane.addItem(courtItem(entry.getKey(), entry.getValue()), Slot.fromIndex(9));
        }

        gui.show(player);
    }

    private static GuiItem courtItem(Component name, Location location) {
        ItemStack item = new ItemStack(Material.DIAMOND); //fix to get item based on court type
        return new GuiItem(item);//left click: teleport (check perms), right click: start GPS
    }
}
