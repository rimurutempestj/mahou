package mc.anime.mahou;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Tapcomplete implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sd, Command cd, String lb, String[] ag) {

        if(ag.length == 1) {
            List<String> ps = new ArrayList<>();
            Player[] p = new Player[Bukkit.getServer().getOnlinePlayers().size()];
            Bukkit.getServer().getOnlinePlayers().toArray(p);
            for(int i = 0; i < p.length; i++) {
                ps.add(p[i].getName());

            }
            return ps;
        }
        return null;
    }
}
