
package org.arpit.java2blog;  

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
        writeToFile(data);
    }
    //helper functions

    private void writeToFile(JSONObject data){

    	try {  
              
            // Writing to a file  
            FileWriter file=new FileWriter(super.tName,true);//name of the file  
            BufferedWriter bw = new BufferedWriter(file); 
            // System.out.println("Writing JSON object to file");  
            // System.out.println("-----------------------");  
            // System.out.print(data);  
  
            bw.write(data.toJSONString());  
            bw.flush();  
            bw.close();  
  
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
};
