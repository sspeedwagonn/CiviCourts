package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.*;
import net.civicraft.civiCourts.manager.JuryManager;
import net.civicraft.civiCourts.object.Case;
import org.bukkit.entity.Player;

/*
/jury select <case> <amount of players>

Used to randomly select a jury. At present, based on config, but most likely will end up being configurable by the judge themselves.

TODO: Add way for jury members to participate in async cases
 */
@CommandAlias("jury")
public class JurySelect {
    @Subcommand("select")
    @CommandPermission("civicourts.jury.select")
    @Description("Randomly select a jury")
    @Syntax("<case> <amount of players>")
    public void onJurySelect(Player player, Case c, int amount) {
        JuryManager.selectJury(c, amount);
    }
}
