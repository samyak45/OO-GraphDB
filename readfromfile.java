  import java.io.FileNotFoundException;  
  import java.io.FileReader;  
  import java.io.IOException;  
  import java.util.Iterator;  
  import org.json.simple.JSONArray;  
  import org.json.simple.JSONObject;  
  import org.json.simple.parser.JSONParser;  
  import org.json.simple.parser.ParseException; 

  import com.google.gson.Gson; 

  public Map readFromFile(){  
    
    JSONParser parser = new JSONParser();  
    
    try {  
    
      Object obj = parser.parse(new FileReader(tname));// change to exact location of the file just written a prototype  

      JSONObject jsonObject = (JSONObject) obj; 
      String data = jsonObject.get(tname).toString(); 

      Gson gson = new Gson();
      Map <String,Object> mapData = new HashMap<String,Object>();
      mapData = (Map <String,Object> ) gson.fromJson(data,map.getClass());
      
      return mapData;

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
    
  }