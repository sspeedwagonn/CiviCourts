package net.civicraft.civiCourts.manager;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import java.util.HashMap;
import java.util.Map;

public class CourtManager {
    public static Map<Component, Location> getCourtLocations() {
        //for all courts in the database, get them and their names, return as pair
        Map<Component, Location> courtLocations = new HashMap<>();
        //TODO: implement, currently returns not a single thing ever in its entire existence
        return courtLocations;
    }
}
