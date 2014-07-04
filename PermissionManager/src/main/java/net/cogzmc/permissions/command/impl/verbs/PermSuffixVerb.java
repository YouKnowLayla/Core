package net.cogzmc.permissions.command.impl.verbs;

import com.google.common.base.Joiner;
import lombok.Getter;
import net.cogzmc.core.modular.command.CommandException;
import net.cogzmc.core.player.CPermissible;
import net.cogzmc.permissions.command.Verb;
import org.bukkit.command.CommandSender;

@Getter
public final class PermSuffixVerb<T extends CPermissible> extends Verb<T> {
    private final String[] names = new String[]{"suffix"};
    private final Integer requiredArguments = 1;

    @Override
    protected void perform(CommandSender sender, T target, String[] args) throws CommandException {
        target.setChatSuffix(Joiner.on(' ').join(args));
    }
}