package net.civicraft.civiCourts.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class CourtMemberLeaveEvent implements Listener {
    //potentially only check if there is an active case
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {
        /*
        if player part of important court members, check how important they are
        if the case can go on without them, continue
        if the case can't go on, *potentially* (heavy POTENTIALLY) check CiviAPI for a discord connection and send a message to encourage them to rejoin

        but if the case can't go on, leave it to the judge to dismiss or make alterations

        and put it to the record
         */
    }
}
