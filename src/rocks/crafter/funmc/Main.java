package rocks.crafter.funmc;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("Hello").setExecutor(new Welcome());
        this.getCommand("Launch").setExecutor(new Launch());
    }

    @Override
    public void onDisable() {
        System.out.println("FunMC plugin is disabled");
    }
}
