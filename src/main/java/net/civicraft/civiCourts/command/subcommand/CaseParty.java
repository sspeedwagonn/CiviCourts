package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import net.civicraft.civiCourts.object.type.RoleType;
import org.bukkit.entity.Player;

@CommandAlias("case")
public class CaseParty {
    @Subcommand("party")
    public void onParty() {

    }

    @Subcommand("party assign")
    public void onPartyAssign(Player player, Player target, RoleType type){
        /*
        Used by a judge to assign a player to a role
         */
    }

    @Subcommand("party join")
    public void onPartyJoin(Player player, Case c) {

    }
}
