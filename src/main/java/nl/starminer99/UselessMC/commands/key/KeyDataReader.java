package nl.starminer99.UselessMC.commands.key;

import nl.starminer99.UselessMC.UselessMC;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;


public class KeyDataReader {
    public KeyDataReader() {

    }

    public void writeToKeyConf(Player player, String keyID, Item keyItem) {
        File file = new File(UselessMC.getPlugin(UselessMC.class).getDataFolder()+File.separator+"keys.yml");
        FileConfiguration config = YamlConfiguration.loadConfiguration(file);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                Logger log = UselessMC.getPlugin(UselessMC.class).getLogger();
                log.info("Error creating keys.yml.");
            }
        }


    }

    public String[] getKeyIDs(Player player) {
        return null;
    }

    public Item getKeyByID(String keyID) {
        return null;
    }
}
