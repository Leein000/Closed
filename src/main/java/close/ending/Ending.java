package close.ending;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Ending extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        System.out.println("아무거나");
    }

    @Override
    public void onDisable() {
        System.out.println("아무거나");
    }

    @EventHandler
    public void onClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        Action a = e.getAction();

        if(a == Action.LEFT_CLICK_AIR)  {
            //행동
        }   else if(a == Action.RIGHT_CLICK_BLOCK) {
            //행동
        }
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(label.equalsIgnoreCase("test")) {
            //실행한 내용
            Player player = (Player) sender;
            player.sendMessage("보낼 내용");
        }
        return true;
    }
}
