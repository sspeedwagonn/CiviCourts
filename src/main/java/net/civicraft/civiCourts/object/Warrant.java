package net.civicraft.civiCourts.object;

import net.civicraft.civiCourts.object.type.WarrantType;
import org.bukkit.entity.Player;

public class Warrant {
    private Player player;
    private Player issuer;
    private int warrantId;
    private WarrantType type;
    private String reason;

    public Warrant(Player player, Player issuer, WarrantType type, String reason) {
        this.player = player;
        this.issuer = issuer;
        this.type = type;
        this.reason = (reason.isBlank() | reason.isEmpty()) ? type.getReason() : reason;
        this.warrantId = 1; //add unique id gen
    }
}
