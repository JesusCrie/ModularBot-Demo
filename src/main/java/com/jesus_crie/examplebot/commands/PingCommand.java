package com.jesus_crie.examplebot.commands;

import com.jesus_crie.modularbot.command.AccessLevel;
import com.jesus_crie.modularbot.command.Command;
import com.jesus_crie.modularbot.command.CommandEvent;
import com.jesus_crie.modularbot.command.annotations.CommandInfo;
import com.jesus_crie.modularbot.command.annotations.RegisterPattern;

import java.util.List;

// Metadata of the command
@CommandInfo(
        name = "ping",
        description = "Pong !"
)
public class PingCommand extends Command {

    public PingCommand() {
        // The command can be used by anyone
        super(AccessLevel.EVERYONE);

        // Add an alias to the command
        aliases.add("p");
    }

    @RegisterPattern
    public void onPing(final CommandEvent event) {
        // This method will be called when the command is called without arguments

        // Pong !
        event.fastReply("Pong !");
    }

    @RegisterPattern(arguments = {"STRING..."})
    public void onPingWithArgs(final CommandEvent event, final List<Object> args) {
        // This method will be called when the command is called with any amount of arguments

        event.fastReply("Pong but you're not alone !");
    }
}
