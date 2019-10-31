package net.fyrezz.equynoxbosses;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdBosses implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return false;
		}
		
		Player player = (Player) sender;
		InventoryGUI inv = new InventoryGUI(player);
		
		player.openInventory(inv.getInventory());
		return true;
	}

}
