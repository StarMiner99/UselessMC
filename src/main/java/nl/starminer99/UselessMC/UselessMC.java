package nl.starminer99.UselessMC;

import nl.starminer99.UselessMC.commands.CommandDiscord;
import nl.starminer99.UselessMC.commands.CommandDynmap;
import nl.starminer99.UselessMC.commands.CommandSpawn;
import nl.starminer99.UselessMC.commands.CommandWebsite;
import nl.starminer99.UselessMC.listener.UselessListener;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class UselessMC extends JavaPlugin {
    @Override
    public void onEnable() {
        //config
        FileConfiguration config = this.getConfig();
        // chat prefix
        config.addDefault("chatPrefix", Var.prefix);

        //welcome messages
        config.addDefault("welcomeMsgs", "");
        config.addDefault("welcomeMsgs.alltime", Var.welcomeMessages);
        config.addDefault("welcomeMsgs.morning", Var.morningJoinMessages);
        config.addDefault("welcomeMsgs.noon", Var.noonJoinMessages);
        config.addDefault("welcomeMsgs.evening", Var.eveningJoinMessages);
        //quit messages
        config.addDefault("leaveMsgs", "");
        config.addDefault("leaveMsgs.alltime", Var.leaveMessages);
        config.addDefault("leaveMsgs.morning", Var.morningLeaveMessages);
        config.addDefault("leaveMsgs.noon", Var.noonLeaveMessages);
        config.addDefault("leaveMsgs.evening", Var.eveningLeaveMessages);

        //save config
        config.options().copyDefaults(true);
        saveConfig();


        getLogger().info("Enabling "+ getPlugin(this.getClass())+" Plugin");

        Objects.requireNonNull(this.getCommand("discord")).setExecutor(new CommandDiscord());
        Objects.requireNonNull(this.getCommand("website")).setExecutor(new CommandWebsite());
        Objects.requireNonNull(this.getCommand("dynmapweb")).setExecutor(new CommandDynmap());
        Objects.requireNonNull(this.getCommand("spawn")).setExecutor(new CommandSpawn());

        getServer().getPluginManager().registerEvents(new UselessListener(), this);



    }
    @Override
    public void onDisable() {
        getLogger().info("Disabling UselessMC Plugin");
    }
}
