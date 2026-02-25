package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

/*
/evidence add <case>

Case could potentially be switched with case ID instead.

It'll check the evidence being added (item in main hand), and if it's fine, it'll be added to the case's evidence collection. It'll log what party added it & when. It'll also check the config to see if evidence can be introduced past a certain point in the case cycle. Also, assign the evidence a #.
 */
@CommandAlias("evidence")
public class EvidenceAdd extends BaseCommand {
    @Subcommand("add")
    public void onEvidenceAdd(Player player, Case c) {

    }
}
