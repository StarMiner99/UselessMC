package nl.starminer99.UselessMC.commands;

import nl.starminer99.UselessMC.Var;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandWebsite implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage(Var.getPrefix() + "https://server-homepage.gassb.repl.co/");

        return true;
    }
}
