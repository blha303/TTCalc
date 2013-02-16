package me.blha303;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TTCalc extends JavaPlugin {

	public Logger log;

	@Override
	public void onEnable() {
		log = this.getLogger();
		log.info("Enabled.");
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		float x = 0;
		float y = 0;
		if (args.length == 2) {
			try {
				x = Float.parseFloat(args[0]);
				y = Float.parseFloat(args[1]);
			} catch (Exception e) {
				log.severe("Error: " + e.toString());
				return false;
			}
		} else {
			return false;
		}

		sender.sendMessage(String.valueOf((x - y) / 150));
		return true;
	}
}
