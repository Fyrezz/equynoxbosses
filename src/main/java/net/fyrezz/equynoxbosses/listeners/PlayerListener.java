package net.fyrezz.equynoxbosses.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import net.fyrezz.equynoxbosses.P;

public class PlayerListener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGHEST)
	private void onPlayerDeath(PlayerDeathEvent event) {
		P.p.getConfig().set("players." + event.getEntity().getUniqueId() + "." + "head", true);
	}

}
