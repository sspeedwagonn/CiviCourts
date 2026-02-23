package net.civicraft.civiCourts;

import co.aikar.commands.PaperCommandManager;
import net.civicraft.civiCourts.command.CaseCommand;
import net.civicraft.civiCourts.command.CourtCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CiviCourts extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();

    }

    public void registerCommands() {
        PaperCommandManager pcm = new PaperCommandManager(this);
        pcm.registerCommand(new CaseCommand());
        pcm.registerCommand(new CourtCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
