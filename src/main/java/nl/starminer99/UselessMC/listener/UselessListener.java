package nl.starminer99.UselessMC.listener;

import nl.starminer99.UselessMC.Var;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Date;
import java.util.Random;

public class UselessListener implements Listener {
    //welcome and leave messages
    Random generator = new Random();
    @EventHandler
    public void onPlayerJoinedEvent(PlayerJoinEvent playerJoinEvent) {
        playerJoinEvent.setJoinMessage(null);

        //customized messages
        Date now = new Date();
        String[] welcomeMsgs;
        //morning
        if (now.getHours() > 5 && now.getHours() < 12) {
            welcomeMsgs = new String[Var.getWelcome("alltime").length + Var.getWelcome("morning").length];
            int i = 0;
            for (i = 0; i < Var.getWelcome("alltime").length; i++) {
                welcomeMsgs[i] = Var.getWelcome("alltime")[i];
            }
            System.arraycopy(Var.getWelcome("morning"), 0, welcomeMsgs, i, Var.getWelcome("morning").length);
        }
        //noon
        else if (now.getHours() > 11 && now.getHours() < 18) {
            welcomeMsgs = new String[Var.getWelcome("alltime").length + Var.getWelcome("noon").length];
            int i = 0;
            for (i = 0; i < Var.getWelcome("alltime").length; i++) {
                welcomeMsgs[i] = Var.getWelcome("alltime")[i];
            }
            System.arraycopy(Var.getWelcome("noon"), 0, welcomeMsgs, i, Var.getWelcome("noon").length);
        }
        //evening
        else {
            welcomeMsgs = new String[Var.getWelcome("alltime").length + Var.getWelcome("evening").length];
            int i = 0;
            for (i = 0; i < Var.getWelcome("alltime").length; i++) {
                welcomeMsgs[i] = Var.getWelcome("alltime")[i];
            }
            System.arraycopy(Var.getWelcome("evening"), 0, welcomeMsgs, i, Var.getWelcome("evening").length);
        }

        String welcomeMessage = String.format(randomArrayElement(welcomeMsgs), playerJoinEvent.getPlayer().getPlayerListName());
        Bukkit.broadcastMessage(Var.getPrefix() + welcomeMessage);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent playerQuitEvent) {
        playerQuitEvent.setQuitMessage(null);
        
        //customized messages
        Date now = new Date();
        String[] leaveMsgs;
        //morning
        if (now.getHours() > 5 && now.getHours() < 12) {
            leaveMsgs = new String[Var.getLeave("alltime").length + Var.getLeave("morning").length];
            int i = 0;
            for (i = 0; i < Var.getLeave("alltime").length; i++) {
                leaveMsgs[i] = Var.getLeave("alltime")[i];
            }
            System.arraycopy(Var.getLeave("morning"), 0, leaveMsgs, i, Var.getLeave("morning").length);
        }
        //noon
        else if (now.getHours() > 11 && now.getHours() < 18) {
            leaveMsgs = new String[Var.getLeave("alltime").length + Var.getLeave("noon").length];
            int i = 0;
            for (i = 0; i < Var.getLeave("alltime").length; i++) {
                leaveMsgs[i] = Var.getLeave("alltime")[i];
            }
            System.arraycopy(Var.getLeave("noon"), 0, leaveMsgs, i, Var.getLeave("noon").length);
        }
        //evening
        else {
            leaveMsgs = new String[Var.getLeave("alltime").length + Var.getLeave("evening").length];
            int i = 0;
            for (i = 0; i < Var.getLeave("alltime").length; i++) {
                leaveMsgs[i] = Var.getLeave("alltime")[i];
            }
            System.arraycopy(Var.getLeave("evening"), 0, leaveMsgs, i, Var.getLeave("evening").length);
        }
        
        
        String leaveMessage = String.format(randomArrayElement(leaveMsgs), playerQuitEvent.getPlayer().getPlayerListName());
        Bukkit.broadcastMessage(Var.getPrefix() + leaveMessage);
    }

    private String randomArrayElement(String[] stringArray) {
        int randomIndex = generator.nextInt(stringArray.length);
        return stringArray[randomIndex];
    }


    //chat color
    @EventHandler
    public void onChatMessageEvent(AsyncPlayerChatEvent asyncPlayerChatEvent) {
        String message = asyncPlayerChatEvent.getMessage();
        boolean perms = asyncPlayerChatEvent.getPlayer().hasPermission("useless.perm.chatcolor");
        if (perms) message = message.replace("&", "§");
        asyncPlayerChatEvent.setMessage(message);

    }

}
