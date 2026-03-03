package net.civicraft.civiCourts.object;

import net.civicraft.civiCourts.object.type.CourtType;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;

public class Court {
    private Location location;
    private Component courtName;
    private CourtType type;

    public Court(Location location, CourtType type) {
        this.location = location;
        this.type = type;
        this.courtName = Component.text("Type # Court");
    }

    public Court(Location location, CourtType type, Component courtName) {
        this.location = location;
        this.type = type;
        this.courtName = courtName;
    }

    public Location getLocation() {
        return location;
    }
    public CourtType getType() {
        return type;
    }
    public Component getCourtName() {
        return courtName;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
