package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

@CommandAlias("case")
public class CaseStart {
    @Subcommand("start")
    public void onCaseStart(Player player, Case case) {

    }
}
