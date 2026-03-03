package net.civicraft.civiCourts.manager;

import net.civicraft.civiCourts.object.Case;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class JuryManager {
    public static void selectJury(Case c, int n) {
        // currently, by default, we're going off online players
        List<Player> onlinePlayers = new ArrayList<>(Bukkit.getOnlinePlayers());
        //potentially make this better. getting a list of online players and working through it may be too taxing for bigger servers. also, there's 100% a better way to select jury, potentially via a recursive call

        //getOnlinePlayers already returns a set. Do I need a list here? Or can I just make a single call to the player list every time for a random player? Can i have it already exclude involved players instead of checking every time?
        for (int i = 0; i < n; i++) {
            Player player = onlinePlayers.get(i);

            if (c.isInvolved(player)) {
                //reselect because the jury cant be made up of someone in the trial (this assumes that case involved is already filled with relevant parties, as it is IRL)
            } else {
                //add unless other things 2 check 4
            }
        }
    }

    public void chooseJuror(Case c, Player player, String decision) {
        /*
        Get a list of jurors selected as options

        If the player is in that list, continue

        If they can be removed, and that's what the attorney wants, then they'll be removed
         */
    }

    public void excuseJuror(Case c, Player player, String reason) {
        /*
        For use by judges

        Get a list of jurors selected as options

        If the player is in that list, remove them
         */
    }
}
