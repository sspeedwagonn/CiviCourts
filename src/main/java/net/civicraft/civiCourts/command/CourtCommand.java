package net.civicraft.civiCourts.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.CommandHelp;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.HelpCommand;
import net.civicraft.civiCourts.gui.ActionGUIs;
import net.civicraft.civiCourts.util.Messages;
import org.bukkit.entity.Player;

public class CourtCommand extends BaseCommand {
    @Default
    @CommandAlias("court")
    public void onCourt(Player player) {
        ActionGUIs.courtActionGUI(player);
    }

    @HelpCommand
    public void onHelp(Player player, CommandHelp help) {
        player.sendMessage(Messages.HELP_HEADING("Court"));
        help.showHelp();
    }
}
