package net.civicraft.civiCourts.manager;

import net.civicraft.civiCourts.object.Warrant;
import net.civicraft.civiCourts.object.type.WarrantType;
import org.bukkit.entity.Player;

public class WarrantManager {
    public static void registerWarrant(Warrant warrant) {

    }

    public static boolean hasActiveWarrant(Player player) {
        //check if a player has an active warrant
        return true;
    }

    public static Warrant findWarrantByPlayer(Player player) {
        return new Warrant(player, player, WarrantType.ARREST, "Filler");
    }

    public static boolean updateWarrant(Warrant warrant, boolean active) {
        // update warrant status, reactivate or deactivate
        return true;
    }

    public static void removeWarrant(Warrant warrant) {
        // remove warrant entirely
    }

    public static void removeAllWarrants(Player player) {
        //remove all warrants for a player
    }
}
