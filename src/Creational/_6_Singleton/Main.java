package Creational._6_Singleton;

public class Main {
//## CREATIONAL - SINGLETON ## //

    public static void main(String[] args) {
    //CLIENT CODE USING THE SINGLETON

        //ACCESS THE SINGLE INSTANCE OF CONFIGURATION MANAGER
        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();

        //COMPARING OBJECTS
        System.out.println(configurationManager1 == configurationManager2);

        configurationManager1.setConfiguration("key2", "value2");
        System.out.println(configurationManager1.getConfiguration("key2"));

    }
}
