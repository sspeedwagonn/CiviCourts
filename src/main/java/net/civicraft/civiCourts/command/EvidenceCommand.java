package net.civicraft.civiCourts.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.CommandHelp;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.HelpCommand;
import net.civicraft.civiCourts.gui.ActionGUIs;
import net.civicraft.civiCourts.util.Messages;
import org.bukkit.entity.Player;

/*
Root command for managing evidence relating to a case
 */
public class EvidenceCommand extends BaseCommand {
    @CommandAlias("evidence")
    @Default
    @HelpCommand
    public void onEvidence(Player player) {
        ActionGUIs.evidenceActionGUI(player);
    }

    @HelpCommand
    public void onHelp(Player player, CommandHelp help) {
        player.sendMessage(Messages.HELP_HEADING("Evidence"));
        help.showHelp();
    }
}
