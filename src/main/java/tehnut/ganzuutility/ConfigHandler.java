package tehnut.ganzuutility;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

	public static Configuration config;

	public static String general = "general";

	public static int chance;

	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
		config.load();
	}

	public static void syncConfig() {

		chance = config.get(general, "chance", 2, "Chance out of 100 for a stick to drop from leaves.").getInt();

		config.save();
	}
}
