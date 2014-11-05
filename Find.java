import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Find extends Query implements Comparator<JSONObject> {
	private String findData;
	private JSONArray data, res;// res=result
	private JSONObject input;
	private String key;

	public Find(String fd, JSONObject object) {
		findData = fd;
		input = object;
		key = ((ArrayList<String>) object.keySet()).get(0);
		data = FileControl.readFromFile(super.dName, super.tName);
		find();
		getData();
		// if statement to check the condition given as the
		// argument in the constructor and call the further methods given
	}

	private void find() {
		if (data.get(0).containsKey(key) != true)
			return;
		if (findData == "gt")
			greater();
		else if (findData == "lt")
			less();
		else if (findData == "eq")
			equal();
		// extend functionality if time permits
	}

	public JSONArray sortBy(String key, boolean asc) {
		Collections.sort(res, new MapComparator(key));
		return res;
	}

	private class MapComparator {
		String key;

		public MapComparator(String k) {
			key = k;
		}

		public int compare(JSONObject a, JSONOBject b) {
			// valA and valB could be any simple type, such as number, string,
			// whatever
			String valA = a.get(key);
			String valB = b.get(key);
			return valA.compareTo(valB);
		}
	}

	public JSONArray getData() {
		return res;
	}

	private void greater() {
		for (JSONObject i : data) {
			if (i.get(key).compareTo(input.get(key)) > 0) {
				res.add(i);
			}
		}
	}

	private void less() {
		for (JSONObject i : data) {
			if (i.get(key).compareTo(input.get(key)) < 0) {
				res.add(i);
			}
		}
	}

	private void equal() {
		for (JSONObject i : data) {
			if (i.get(key).compareTo(input.get(key)) == 0) {
				res.add(i);
			}
		}
	}
	
}
