package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

/*
/warrant check <optional: player>

Check if there is an active warrant against a player
 */
@CommandAlias("warrant")
public class WarrantCheck {
    @Subcommand("check")
    public void onWarrantCheck(Player player, @Optional Player target) {

    }
}
