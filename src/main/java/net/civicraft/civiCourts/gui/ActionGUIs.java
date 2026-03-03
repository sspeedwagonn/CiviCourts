package net.civicraft.civiCourts.gui;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import org.bukkit.entity.Player;

//there will end up being a better way to do this once guis r more worked out
public class ActionGUIs {
    public static void courtActionGUI(Player player) {
        ChestGui gui = new ChestGui(3, "Court");

        gui.show(player);
    }

    public static void caseActionGUI(Player player) {
        ChestGui gui = new ChestGui(3, "Case");

        gui.show(player);
    }

    public static void warrantActionGUI(Player player) {
        ChestGui gui = new ChestGui(3, "Warrant");

        gui.show(player);
    }

    public static void evidenceActionGUI(Player player) {
        ChestGui gui = new ChestGui(3, "Evidence");

        gui.show(player);
    }

    public static void juryActionGUI(Player player) {
        ChestGui gui = new ChestGui(3, "Jury");

        gui.show(player);
    }
}
