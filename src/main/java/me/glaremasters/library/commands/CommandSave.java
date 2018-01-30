package me.glaremasters.library.commands;

import me.glaremasters.library.commands.base.CommandBase;
import org.bukkit.entity.Player;

public class CommandSave extends CommandBase {

    public CommandSave() {
        super("save", "Book", "library.book", false, null, "<name>", 1, 1);
    }

    public void execute(Player player, String[] args) {

        /*

        ItemStack heldItem = player.getInventory().getItemInMainHand();


        if (heldItem.getType() == Material.WRITTEN_BOOK) {

            BookMeta bookMeta = (BookMeta) heldItem.getItemMeta();

            File book = new File(Library.getI().getDataFolder(), "books/" + args[0] + ".yml");

            if (book.exists()) {
                player.sendMessage("A book by that name already exist!");
                return;
            }
            YamlConfiguration bookHandler = YamlConfiguration.loadConfiguration(book);
            bookHandler.set("title", bookMeta.getTitle());
            try {
                bookHandler.save(book);
            } catch (IOException e) {
                e.printStackTrace();
            }

            player.sendMessage("Ayy, you're holding a written book");
        }
        */
    }


}
