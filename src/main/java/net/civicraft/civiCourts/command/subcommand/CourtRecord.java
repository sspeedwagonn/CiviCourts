package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

@CommandAlias("court")
public class CourtRecord extends BaseCommand {
    @Subcommand("record")
    public void onRecord(Player player, @Optional Player target) {

    }
}
