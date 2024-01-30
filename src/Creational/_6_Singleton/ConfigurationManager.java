package Creational._6_Singleton;

public class ConfigurationManager {
//SINGLETON CLASS MANAGING SHARED RESOURCE OF CONFIGURATION

    //PRIVATE STATIC INSTANCE OF THE CLASS
    private static ConfigurationManager instance;

    //PRIVATE CONSTRUCTOR TO PREVENT DIRECT INSTANTIATION
    private ConfigurationManager() {
        System.out.println("Initializing Configuration Manager..");
    }

    //PUBLIC STATIC METHOD TO ACCESS THE SINGLE INSTANCE
    public static ConfigurationManager getInstance() {
        if(instance == null) {
            //ENSURE THREAD SAFETY USING SYNCHRONIZED BLOCK
            synchronized (ConfigurationManager.class) {
                if(instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    //METHOD TO MANAGE AND ACCESS THE SHARED RESOURCE OF CONFIGURATION
    public void setConfiguration(String key, String value) {
        System.out.println("Setting key and value: " + key + ":" + value);
    }

    public String getConfiguration(String key) {
        return "Retrieving value..";
    }
}
