public class Find extends Query implements Comparator<JSONObject>{
    private String findData;
    private JSONArray data;
    private JOSNObject input;
    public Find(String fd,JSONObject object){
        findData=fd;
        input=object;
        
        // if statement to check the condition given as the
        // argument in the constructor and call the further methods given
    }
    public JSONArray satisfies(){
        //returns the JSONArray of JSONObjects in dat awhich specify the input conditions 
        //conditions=findData
        //use equals,greater and less 
    }
    private int compare(JSONObject a, JSONOBject b,String key)
    {
        //valA and valB could be any simple type, such as number, string, whatever
        String valA = a.get(key);
        String valB = b.get(key);

        if(valA > valB)
            return 1;
        if(valA < valB)
            return -1;
        return 0;    
    }
    private JSONArray greater(String key){
        // render the documents and store the required objects in an array
        JSONArray satisfies=new JSONArray();
        for each_jsonobject in data{
            if(compare(input,each_jsonobject,key)==1)
                satisfies(end+1)=each_jsonobject;
        }
        return satisfies;
    }
    private JSON less(String key){
        // render the documents and store the required objects in an array
        JSONArray satisfies=new JSONArray();
        for each_jsonobject in data{
            if(compare(input,each_jsonobject,key)==-1)
                satisfies(end+1)=each_jsonobject;
        }
        return satisfies;
    }
    private JSON equal(String key){
        // render the documents and store the required objects in an array
        JSONArray satisfies=new JSONArray();
        for each_jsonobject in data{
            if(compare(input,each_jsonobject,key)==0)
                satisfies(end+1)=each_jsonobject;
        }
        return satisfies; 
    }

}
