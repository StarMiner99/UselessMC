package nl.starminer99.UselessMC;

import org.bukkit.ChatColor;

public class Var {
    public static String prefix = "[" + ChatColor.GOLD + "Useless"+ChatColor.RED+"MC" + ChatColor.RESET + "] ";

    public static String[] welcomeMessages = {"Welcome %s§r to UselessMC!", "Hello %s§r!", "What's up %s§r!", "%s§r has arrived!", "Yay %s§r is here!"};
    public static String[] leaveMessages = {"Good Bye %s§r!", "Have a nice day %s§r!", "%s§r is gone!", "Bye Bye %s§r have a nice day!"};

    public static String[] morningJoinMessages = {"Good morning %s§r!"};
    public static String[] morningLeaveMessages = {};
    public static String[] noonJoinMessages = {};
    public static String[] noonLeaveMessages = {};
    public static String[] eveningJoinMessages = {"good evening %s§r!"};
    public static String[] eveningLeaveMessages = {"good night %s§r!"};

    public static String getPrefix() {
        return UselessMC.getPlugin(UselessMC.class).getConfig().getString("chatPrefix");
    }
    public static String[] getWelcome(String msgType) {
        return UselessMC.getPlugin(UselessMC.class).getConfig().getStringList("welcomeMsgs."+ msgType).toArray(new String[0]);
    }
    public static String[] getLeave(String msgType) {
        return UselessMC.getPlugin(UselessMC.class).getConfig().getStringList("leaveMsgs."+ msgType).toArray(new String[0]);
    }

}
