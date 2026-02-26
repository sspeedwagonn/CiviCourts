package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

/*
/jury vote <decision>

When it's time for the jury -- if there is one -- to vote, they use this command to decide. The vote is handled based on method specified in config.
 */
@CommandAlias("jury")
public class JuryVote extends BaseCommand {
    @Subcommand("vote")
    public void onJuryVote(Player player, String decision) {

    }
}
