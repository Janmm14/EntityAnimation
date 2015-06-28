package de.janmm14.entityanimation;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class EntityAnimation extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String alias, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("entityanimation")) {
            return true;
        }
        if (!(cs instanceof Player)) {
            cs.sendMessage(ChatColor.DARK_RED + "Command just for players!");
            return true;
        }
        final Player plr = (Player) cs;
        //plr.getNearbyEntities()
        return true;
    }
}
