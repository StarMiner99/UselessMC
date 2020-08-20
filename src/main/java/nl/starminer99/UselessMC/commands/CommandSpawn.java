package nl.starminer99.UselessMC.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class CommandSpawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Location spawn = Objects.requireNonNull(commandSender.getServer().getWorld("world")).getSpawnLocation();
        Player player = (Player) commandSender;
        player.teleport(spawn);
        return true;
    }
}
