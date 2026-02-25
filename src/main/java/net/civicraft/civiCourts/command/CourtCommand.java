package net.civicraft.civiCourts.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.HelpCommand;

public class CourtCommand extends BaseCommand {
    @Default
    @CommandAlias("court")
    public void onCase() {

    }

    @HelpCommand
    public void onHelp() {

    }
}
