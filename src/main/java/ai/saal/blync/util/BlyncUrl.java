package ai.saal.blync.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BlyncUrl {
   private static String URL = null;
   public static String getUrl(){
       if(BlyncUrl.URL == null){
           try {
               InputStream input = new FileInputStream("/etc/jitsi/jicofo/blync-manager.properties");
               Properties prop = new Properties();
               prop.load(input);
               BlyncUrl.URL =prop.getProperty("conference.manager.url");
               return BlyncUrl.URL;
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       return BlyncUrl.URL;
   }

}
