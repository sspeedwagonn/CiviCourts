package net.civicraft.civiCourts.gui;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import com.github.stefvanschie.inventoryframework.pane.util.Slot;
import org.bukkit.entity.Player;

public class CaseCreationGUI {
    public void openGUI(Player player) {
        ChestGui gui = new ChestGui(4, "Create a Case");

        StaticPane pane = new StaticPane(Slot.fromIndex(9), 9, 2);

        gui.addPane(pane);

        gui.show(player);
    }
}
