package net.fyrezz.equynoxbosses;

import org.bukkit.plugin.java.JavaPlugin;

public class P extends JavaPlugin {
	
	public static P p;
	
	public P() {
		p = this;
	}
	
	public void onEnable() {
		reloadConfig();
		saveDefaultConfig();
		getServer().getPluginCommand("bosses").setExecutor(new CmdBosses());
		
	}
	
	public void onDisable() {
		saveConfig();
	}

}
