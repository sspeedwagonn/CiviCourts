package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

@CommandAlias("case")
public class CaseRecord extends BaseCommand {
    @Subcommand("record")
    @Description("View details about a case")
    public void onRecord(Player player, Case c, @Optional boolean gui) {
        if (!gui) {
            //send text details
        } else {
            // open gui
        }
    }
}
