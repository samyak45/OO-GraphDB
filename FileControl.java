  import java.io.FileNotFoundException;  
  import java.io.FileReader;  
  import java.io.IOException;  
  import java.util.Iterator;  
  import org.json.simple.JSONArray;  
  import org.json.simple.JSONObject;  
  import org.json.simple.parser.JSONParser;  
  import org.json.simple.parser.ParseException; 

  import com.google.gson.Gson; 

  public class FileControl {

    public static Map readFromFile(String dname, String tname,JSONObject data){  
    
      JSONParser parser = new JSONParser();  
      
      try {  
      
        Object obj = parser.parse(new FileReader(query.tname));// change to exact location of the file just written a prototype  

        JSONObject jsonObject = (JSONObject) obj; 
        String data = jsonObject.get(tname).toString(); 

        Gson gson = new Gson();
        Map <String,Object> mapData = new HashMap < String,Object >();
        mapData = ( Map <String,Object> ) gson.fromJson(data,map.getClass());
        
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

    public static void writeToFile(String dname,String tname,JSONObject data,boolean isAppend){

      try {  
        File file = new File(tname);
        // Writing to a file  
        // got to dname directory
        if(!isAppend){
          boolean success = file.delete();
          if(success){
            file = new File(tname);
          }
        }
        FileWriter writer=new FileWriter(file,true);//name of the file  
        BufferedWriter bw = new BufferedWriter(writer);   
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
  