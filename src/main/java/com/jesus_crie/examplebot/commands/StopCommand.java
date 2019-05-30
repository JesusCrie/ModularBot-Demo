package com.jesus_crie.examplebot.commands;

import com.jesus_crie.modularbot.command.AccessLevel;
import com.jesus_crie.modularbot.command.Command;
import com.jesus_crie.modularbot.command.CommandEvent;
import com.jesus_crie.modularbot.command.annotations.CommandInfo;
import com.jesus_crie.modularbot.command.annotations.RegisterPattern;

@CommandInfo(
        name = "stop",
        description = "Stop the bot."
)
public class StopCommand extends Command {

    public StopCommand() {
        // Only the creator can use this command
        // The creator is deduced from the CREATOR_ID defined in the CommandModule
        // It is automatically loaded from the config (if the config module is present of course)
        super(AccessLevel.CREATOR);
    }

    @RegisterPattern
    public void onStop(final CommandEvent event) {
        event.fastReply("Shutting down...");
        event.getModule().getBot().shutdown();
    }
}
