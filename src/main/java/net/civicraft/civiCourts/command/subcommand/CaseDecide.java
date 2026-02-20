package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

/*
/case decide <decision>

Used by a judge to make a decision on the case. The decision is paired with some consequence.

The decision is sent to involved parties, an announcement is made, and the case is closed. It may be open for appeal, but this may potentially be a manual process -- depends on practical use.
 */

@CommandAlias("case")
public class CaseDecide extends BaseCommand {
    @Subcommand("decide")
    public void onCaseDecide(Player player, Case c, String decision){
        /*
        make a decide method in case that checks if the decision is valid
        or a decision enum?
        not sure. just add autocomplete for decision

        potentially make decision more open-ended for civil cases where it isn't guilty/not
         */
    }
}
