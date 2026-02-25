package net.civicraft.civiCourts.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.HelpCommand;
import org.bukkit.entity.Player;

/*
Root command for managing evidence relating to a case
 */
public class EvidenceCommand extends BaseCommand {
    @CommandAlias("evidence")
    @Default
    @HelpCommand
    public void onEvidence(Player player) {

    }
}
