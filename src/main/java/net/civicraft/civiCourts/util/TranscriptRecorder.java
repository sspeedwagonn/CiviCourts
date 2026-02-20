package net.civicraft.civiCourts.util;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TranscriptRecorder implements Listener {
    @EventHandler
    public void onTranscriptRecorder(AsyncChatEvent e) {
        /*
        i'm leaving this in utils for now but it probably won't stay

        if a player has any role that matters in the case, their chat and court-relevant commands will be added to the case's transcript


         */
    }
}
