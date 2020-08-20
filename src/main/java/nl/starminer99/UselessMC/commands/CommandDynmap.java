package nl.starminer99.UselessMC.commands;

import nl.starminer99.UselessMC.Var;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandDynmap implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage(Var.getPrefix() + "http://zeller.my-router.de:8123/index.html");

        return true;
    }
}
