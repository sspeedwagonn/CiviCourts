package net.civicraft.civiCourts.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;

public class Messages {
    public static TextColor PRIMARY = TextColor.color(255, 179, 0);
    public static TextColor SECONDARY = TextColor.color(255, 237, 203);

    public static Component HELP_HEADING(String heading) {
        return Component.text(heading + " Help", PRIMARY);//prolly chnage this
    }
}
