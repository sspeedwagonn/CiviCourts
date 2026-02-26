package net.civicraft.civiCourts.command.subcommand;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.civiCourts.gui.WarrantCreationGUI;
import net.civicraft.civiCourts.manager.WarrantManager;
import net.civicraft.civiCourts.object.Warrant;
import net.civicraft.civiCourts.object.type.WarrantType;
import org.bukkit.entity.Player;

/*
/warrant create

Creates a warrant. Player either opens the GUI or does it entirely via command.
 */
@CommandAlias("warrant")
public class WarrantCreate {
    @Subcommand("create")
    public void onWarrantCreate(Player player, Player target, @Optional WarrantType type, @Optional String reason) {
        if (type == null) {
            WarrantCreationGUI.openGUI(player, target);
        } else {
            if (reason == null) {

                return;
            }

            Warrant warrant = new Warrant(target, player, type, reason);
            WarrantManager.registerWarrant(warrant);
        }
    }
}
