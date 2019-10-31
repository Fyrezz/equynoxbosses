package net.fyrezz.equynoxbosses;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryGUI {
	
	private static ItemStack fill1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)0);
	
	private Inventory inventory;
	private Player player;
	
	InventoryGUI(Player player) {
		player = player;
		createInventory();
	}
	
	private void createInventory() {
		PlayerStatus playerStatus = new PlayerStatus(player);
		inventory = Bukkit.createInventory(player, 54);
		for (int i = 0; i < 25; i++) {
			if (i != 10 && i != 12 && i != 14 && i != 16) {
				inventory.setItem(i, fill1);
			}
		}
		if (playerStatus.hasPiece("head")) {
			inventory.setItem(10, new ItemStack(Material.GOLD_INGOT, 1));
		}
	}
	
	public Inventory getInventory() {
		return inventory;
	}

}
