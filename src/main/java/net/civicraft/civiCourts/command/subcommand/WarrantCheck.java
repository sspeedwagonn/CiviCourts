package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.manager.WarrantManager;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

/*
/warrant check <optional: player>

Check if there is an active warrant against a player
 */
@CommandAlias("warrant")
public class WarrantCheck {
    @Subcommand("check")
    public void onWarrantCheck(Player player, @Optional Player target) {
        if (target != null && WarrantManager.hasActiveWarrant(target)) {
            player.sendMessage(Component.text(target.displayName() + " has a warrant."));
        } else if (WarrantManager.hasActiveWarrant(player)) {
            player.sendMessage(Component.text("You have a warrant <info>."));
        }
    }
}
