package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

public class CaseList extends BaseCommand {
    @Subcommand("list")
    public void onCaseList(Player player) {
        // returns a list of every case ever
    }

    @Subcommand("list active")
    public void onCaseListActive(Player player){
        // return a list of active cases
    }

    //add more filters
}
