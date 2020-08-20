package nl.starminer99.UselessMC.commands;

import nl.starminer99.UselessMC.UselessMC;
import nl.starminer99.UselessMC.Var;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.jws.soap.SOAPBinding;

public class CommandDiscord implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage(Var.getPrefix() + "https://discord.gg/SA2yFD");

        return true;
    }
}
