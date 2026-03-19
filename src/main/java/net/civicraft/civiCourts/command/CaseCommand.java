package net.civicraft.civiCourts.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.CommandHelp;
import co.aikar.commands.annotation.*;
import net.civicraft.civiCourts.gui.ActionGUIs;
import net.civicraft.civiCourts.util.Messages;
import org.bukkit.entity.Player;

public class CaseCommand extends BaseCommand {
    @Default
    @CommandAlias("case")
    @Description("")
    @CommandPermission("civicourts.case")
    public void onCase(Player player) {
        ActionGUIs.caseActionGUI(player);
    }

    @HelpCommand
    public void onHelp(Player player, CommandHelp help) {
        player.sendMessage(Messages.HELP_HEADING("Case"));
        help.showHelp();
    }
}
