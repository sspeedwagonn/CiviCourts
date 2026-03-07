package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.manager.WarrantManager;
import org.bukkit.entity.Player;

/*
/warrant revoke <id>

Revokes an active warrant by ID.
 */
@CommandAlias("warrant")
public class WarrantRevoke {
    @Subcommand("revoke")
    public void onWarrantRevoke(Player player, Player target, @Optional boolean all) {
        if (all) {
            WarrantManager.removeAllWarrants(target);
        } else {
            WarrantManager.removeWarrant(warrant);
        }
        //i need to think more about what im doing here
    }
}
