package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

/*
/court record <optional: target>

Returns the court record of a player, detailing all cases they were involved in.
 */

@CommandAlias("court")
public class CourtRecord extends BaseCommand {
    @Subcommand("record")
    public void onRecord(Player player, @Optional Player target) {
        /*
        if target is blank, the player will receive their own record
        if target is provided, the player will receive the target's record
        add a way for only court staff to view records
        how can the record be presented? -- gui, text, link
        potentially be able to print a record to a book (if a book is being held)
         */
    }
}
