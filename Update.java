import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Update extends Query {
	private JSONArray data;
	private String updateData;
	private String orig, updt;
	private String key1, key2;

	public Update(String ud,JSONObject object1,JSONObject object2){
        super();
		updateData=ud;
        key1=((ArrayList<String>)object1.keySet()).get(0);
        key2=((ArrayList<String>)object2.keySet()).get(0);
        orig=object1.get(key1).toString();
        updt=object2.get(key2).toString();
        data = FileControl.readFromFile(super.dName,super.tName);
        update();
    }

	// Find find=new Find(updateData,orig);
	private boolean compare(String a,String b){
    	if(updateData=="gt")
    		return (a.compareTo(b) >0 );
    	else if(updateData=="lt")
    		return (a.compareTo(b) <0 );
    	else if(updateData=="eq")
    		return a.equals(b);
    	return false;
    }

	private void update() {
		for (int i = 0; i < data.size(); i++) {
			if (compare((String)((JSONObject)data.get(i)).get(key1), orig) == true) {
				((JSONObject)data.get(i)).put(key2, updt);
			}
		}
	}

	// helper functions
}
