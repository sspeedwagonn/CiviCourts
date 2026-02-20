package net.civicraft.civiCourts.object;

import net.civicraft.civiCourts.object.type.CaseType;
import net.civicraft.civiCourts.object.type.RoleType;
import org.bukkit.entity.Player;

import java.util.Date;
import java.util.Map;

public class Case {
    private boolean isActive;
    private Map<Player, RoleType> involved;
    private String caseName;
    private CaseType caseType;
    // better way to handle these dates? i'll think on it
    private Date caseInit;
    private Date caseCalled;
    private Date caseClosed;

    public Case(boolean isActive, Map<Player, RoleType> involved, String caseName) {

    }
}
