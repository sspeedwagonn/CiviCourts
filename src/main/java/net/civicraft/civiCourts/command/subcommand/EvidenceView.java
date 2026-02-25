package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

/*
/evidence view <case> <evidence #>

View evidence related to a case.
 */
@CommandAlias("evidence")
public class EvidenceView extends BaseCommand {
    @Subcommand("view")
    public void onEvidenceView(Player player, Case c, int evidenceId) {

    }
}
