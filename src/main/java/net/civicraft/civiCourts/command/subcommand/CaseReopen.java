package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Single;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

/*
/case reopen <case> <appeal: Y|N> <optional: reason>

Reopens a case, option to provide a reason for reopening. I might make it required.

Used by judges if they accept an appeal. Can also be used if they preemptively or incorrectly close a case.
 */
@CommandAlias("case")
public class CaseReopen {
    @Subcommand("reopen")
    public void onCaseReopen(Player player, Case c, @Single String appeal, @Optional String reason) {
        /*
        Check if case is actually closed
        Check if the re-opening is related to an appeal -> case.appealAccept or something
        If not, just re-open normally and note the reason (if provided)
         */
    }
}
