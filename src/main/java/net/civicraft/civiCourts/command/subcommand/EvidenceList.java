package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.manager.EvidenceManager;
import net.civicraft.civiCourts.object.Case;
import net.civicraft.civiCourts.object.Evidence;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/*
/evidence list <case>

Lists evidence in a case with information about the evidence.
 */
@CommandAlias("evidence")
public class EvidenceList extends BaseCommand {
    @Subcommand("list")
    public void onEvidenceList(Player player, Case c) {
        ArrayList<Evidence> evidence = EvidenceManager.getEvidenceByCase(c);
    }
}
