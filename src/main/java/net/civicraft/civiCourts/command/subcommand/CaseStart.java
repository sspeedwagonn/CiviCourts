package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

/*
/case start <case> <live: true|false>

Begins the review of a case. If it's live, those involved in the case will have x minutes to join so it may begin. If it's not live, then the judge themselves will review the information on the case independently and make a decision.
 */

@CommandAlias("case")
public class CaseStart extends BaseCommand {
    @Subcommand("start")
    public void onCaseStart(Player player, Case c, boolean live) {
        /*
        start a case
        requires everyone to be on
        autosend an announcement to discord, tag relevant role
         */
    }
}
