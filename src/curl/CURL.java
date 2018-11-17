package curl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CURL {
    public String url;
    
    public CURL(String url){
        this.url = url;
    }
    
    public String getResponse() throws MalformedURLException, IOException{
        String response = "";
        String l;
        BufferedReader r;
        URL link = new URL(this.url);
        
        r = new BufferedReader(new InputStreamReader(link.openStream(), "UTF-8"));
        
        while((l = r.readLine()) != null){
            response += l;
        }
        
        return response;
    }
}
