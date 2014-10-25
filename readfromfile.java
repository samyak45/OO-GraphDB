import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.Iterator;  
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;  
import org.json.simple.parser.JSONParser;  
import org.json.simple.parser.ParseException; 

import com.google.gson.Gson; 

public void readFromFile() {  
  
  JSONParser parser = new JSONParser();  
  
  try {  
  
    Object obj = parser.parse(new FileReader(tname));// change to exact location of the file just written a prototype  

    JSONObject jsonObject = (JSONObject) obj; 
    String data = jsonObject.get(tname).toString(); 

    // the data is stored like this 
    /*

      tname:{
        [
          {record1},{record2}, etc.........
        ]
      }

    /*String nameOfCountry = (String) jsonObject.get("Name");  
    System.out.println("Name Of Country: "+nameOfCountry);  

    long population = (long) jsonObject.get("Population");  
    System.out.println("Population: "+population);  

    System.out.println("States are :");  
    JSONArray listOfStates = (JSONArray) jsonObject.get("States");  
    Iterator<String> iterator = listOfStates.iterator();  
    while (iterator.hasNext()) {  
      System.out.println(iterator.next());  
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