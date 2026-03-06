package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import net.civicraft.civiCourts.object.type.RoleType;
import net.civicraft.civiCourts.util.Messages;
import org.bukkit.entity.Player;

@CommandAlias("case")
public class CaseParty {
    @Subcommand("party")
    public void onParty() {

    }

    @Subcommand("party assign")
    public void onPartyAssign(Player player, Case c, RoleType type, Player target){
        /*
        Used by a judge to assign a player to a role
         */
        if (player == target) {
            player.sendMessage(Messages.FAILED_ASSIGNMENT);
            return;
        }

        c.addToInvolved(target, type);
    }

    @Subcommand("party join")
    public void onPartyJoin(Player player, Case c) {

    }

    @Subcommand("party invite")
    public void onPartyInvite(Player player, Case c, RoleType type, Player target) {
        //invite a player, maybe start some timer? Or have the invite last a configurable time? yeah maybe just config it
    }
}
