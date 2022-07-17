package me.alexdev.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StreetCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            //O cara que digitou aqui é um Player
            sender.sendMessage("§6Melhor Servidor street-zone.net");
        } else {
            //O cara que digitou não é um Player (Console)
            sender.sendMessage("§4Erro Mensagem só pode ser digitada pelo usuário dentro do servidor.");
        }

        return true;
    }

}
