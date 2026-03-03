package net.civicraft.civiCourts.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.CommandHelp;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.HelpCommand;
import net.civicraft.civiCourts.gui.ActionGUIs;
import net.civicraft.civiCourts.util.Messages;
import org.bukkit.entity.Player;

public class WarrantCommand extends BaseCommand {
    @CommandAlias("warrant")
    @Default
    @Description("Warrant")
    public void onWarrant(Player player) {
        ActionGUIs.warrantActionGUI(player);
    }

    @HelpCommand
    public void onHelp(Player player, CommandHelp help) {
        player.sendMessage(Messages.HELP_HEADING("Warrant"));
        help.showHelp();
    }
}
