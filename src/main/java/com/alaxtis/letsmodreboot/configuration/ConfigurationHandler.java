package com.alaxtis.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create the configuration object
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            // load the configuration file
            configuration.load();

            // read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example Config Value").getBoolean(true);
        }
        catch (Exception e)
        {
            // log the exception
        }
        finally
        {
            // save the configuration file
            configuration.save();
        }

        System.out.println(configValue);
    }
}
