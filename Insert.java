import java.io.*  
import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
  
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;


public class Insert extends Query{
	
    private JSONObject data;

    public Insert(JSONObject object){
        data=object;

        FileControl.writeToFile(super.dname,super.tname,data,true);
    }
    //helper functions
}

// TODO : just touchups required