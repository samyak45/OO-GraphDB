  import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

  public class FileControl extends Query {
	private String tname = super.tName;
    public static JSONArray readFromFile(String dname, String tname){  
    
      JSONParser parser = new JSONParser();  
      
      try {  
    	 
        Object obj = parser.parse(new FileReader(tname));// change to exact location of the file just written a prototype  

        JSONObject jsonObject = (JSONObject) obj; 
        String data = jsonObject.get(tname).toString(); 
        // TODO: send data via JSONArray instead of GSon
        /*
        Gson gson = new Gson();
        Map <String,Object> mapData = new HashMap < String,Object >();
        mapData = ( Map <String,Object> ) gson.fromJson(data,map.getClass());
        
        return mapData;
        */
        

        // the data is stored like this 
        /*

          tname:
            {
                [
                    {record1},{record2}, etc.........
                ]
            }
        */
        
      } 
      catch (FileNotFoundException e) {  
       e.printStackTrace();  
      } 
      catch (IOException e) {  
       e.printStackTrace();  
      } 
      catch (ParseException e) {  
       e.printStackTrace();  
      }
	return null;     
    }

    public static void writeToFile(String dname,String tname,JSONObject data,boolean isAppend){
    	BufferedWriter bw=null;
      try {  
        File file = new File(tname);
        // Writing to a file  
        // got to dname directory
        FileWriter writer = new FileWriter(file,isAppend);//name of the file 

        bw = new BufferedWriter(writer);   
        bw.write(data.toJSONString());  
        bw.flush();  
        //bw.close();  
  
      } 
      catch (IOException e) {  
          e.printStackTrace();  
      }  
      finally {                       // always close the file
        if (bw != null) try {
          bw.close();
        } catch (IOException ioe2) {
          // just ignore it
        }
      }
      
      
    }


  }
  