package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

/*
/warrant revoke <id>

Revokes an active warrant by ID.
 */
@CommandAlias("warrant")
public class WarrantRevoke {
    @Subcommand("revoke")
    public void onWarrantRevoke(Player player, int warrantId) {

    }
}
