package net.fyrezz.equynoxbosses;

import org.bukkit.entity.Player;

public class PlayerStatus {

	private Player player;

	PlayerStatus(Player player) {
		player = player;
	}

	public boolean hasPiece(String piece) {
		if ()
		return (P.p.getConfig().isSet("players." + player.getUniqueId() + "." + piece))
				? P.p.getConfig().getBoolean("players." + player.getUniqueId() + "." + piece)
				: false;
	}

}
