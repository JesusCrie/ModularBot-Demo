package com.jesus_crie.examplebot;

import com.jesus_crie.examplebot.commands.CommandRegistryModule;
import com.jesus_crie.examplebot.tsmodule.MyTSModule;
import com.jesus_crie.modularbot.core.ModularBot;
import com.jesus_crie.modularbot.core.ModularBotBuilder;
import com.jesus_crie.modularbot.logger.ConsoleLoggerModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;

public class ExampleBot {

    private static final Logger LOG = LoggerFactory.getLogger("ExampleBot");

    public static void main(String[] args) {
        // The token is stored in an environment variable named BOT_TOKEN
        final ModularBot bot = new ModularBotBuilder(System.getenv("BOT_TOKEN"))
                // Providing the logger module here allow its usage during the build process
                .provideBuiltModules(new ConsoleLoggerModule())
                .requestModules(
                        // Explicitly request our modules
                        CommandRegistryModule.class,
                        MyTSModule.class
                )
                // Request the base modules of the framework
                .requestBaseModules()
                // Resolve the modules and build the bot
                .resolveAndBuild();

        // Try to login to discord
        try {
            bot.login();
        } catch (LoginException e) {
            LOG.error("Failed to login !", e);
        }
    }
}
