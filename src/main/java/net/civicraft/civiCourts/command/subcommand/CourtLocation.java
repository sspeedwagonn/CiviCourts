package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Court;
import org.bukkit.entity.Player;

/*
/court location <list|set|teleport>

Calls a player to the stand to give a testimony. It teleports the player to the side of the judge as well as initiates the testimony being saved to the record's transcript.
 */

@CommandAlias("court")
public class CourtLocation extends BaseCommand {
    @Subcommand("location")
    public void onLocation() {
        /*
        subcommand menu
         */
    }

    @Subcommand("location list")
    public void onLocationList() {
        /*
        for every existing court location
        list the name and maybe other info
        i could even make it a GUI
        would it be worth making a GUI
         */
    }

    //TODO: manual location setting
    @Subcommand("location set")
    public void onLocationSet(Player player, Court court) {
        court.setLocation(player.getLocation());
    }

    @Subcommand("location tp")
    public void onLocationTP(Player player, Court court) {
        player.teleport(court.getLocation());
    }
}
