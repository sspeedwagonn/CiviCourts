package net.civicraft.civiCourts.object;

import org.bukkit.Location;

public class Court {
    private Location location;

    public Court(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
