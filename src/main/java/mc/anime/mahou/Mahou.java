package mc.anime.mahou;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Mahou extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Mahou 0.0.2 Loaded");
    }

    @Override
    public boolean onCommand(CommandSender sd, Command cd, String lb, String[] ag) {
        if (lb.equalsIgnoreCase("wingarudiumrebiousa")) { //fly another player
            if (sd instanceof Player) {
                Player p = (Player) sd;

                if (ag.length == 1) {
                    Player tg = Bukkit.getPlayer(ag[0]);

                    tg.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 60,
                            false, false));
                }
            }
        } else if(lb.equalsIgnoreCase("heal")) { //heal self or another player
            if (sd instanceof Player) {
                Player p = (Player) sd;

                if (ag.length == 1) {
                    Player tg = Bukkit.getPlayer(ag[0]);

                    tg.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 2, false, false));
                } else if (ag.length == 0) {
                    Player pl = (Player) sd;

                    pl.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 2, false, false));
                }
            }
        }
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Mahou Plugin Disabled");
    }
}
