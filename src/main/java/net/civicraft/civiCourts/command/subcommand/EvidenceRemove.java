package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

/*
/evidence remove <case> <evidence #>
Removes a piece of evidence from a case.

/evidence remove confirm
Confirm the removal of evidence from a case. Can only be used within a configurable amount of time since running /evidence remove.
 */
@CommandAlias("evidence")
public class EvidenceRemove extends BaseCommand {
    @Subcommand("remove")
    public void onEvidenceRemove(Player player, Case c, int evidenceId) {

    }

    @Subcommand("remove confirm")
    public void onEvidenceRemoveConfirm(Player player) {

    }
}
