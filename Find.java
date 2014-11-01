public class Find extends Query implements Comparator<JSONObject>{
    private String findData;
    private JSONArray data;//result
    private JOSNObject input;
    public Find(String fd,JSONObject object){
        findData=fd;
        input=object;
        find();
        // if statement to check the condition given as the
        // argument in the constructor and call the further methods given
    }
    private void find(){
        if(findData=="gt") greater();
        else if(findData=="lt") less();
        else if(findData=="eq") equal();
        // extend functionality if time permits
    }
    public JSONArray sortBy(String key,boolean asc){
        //
    }
    public JSONArray getData(){
        //returns data
    }
    private void greater(){

    }
    private void less(){

    }
    private void equal(){
        
    }
    /*
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
    private int[] greater(String key){
        // render the documents and store the required objects in an array
        JSONArray satisfies=new JSONArray();
        for each_jsonobject in data{
            if(compare(input,each_jsonobject,key)==1)
                satisfies(end+1)=each_jsonobject;
        }
        return satisfies;
    }
    private int[] less(String key){
        // render the documents and store the required objects in an array
        JSONArray satisfies=new JSONArray();
        for each_jsonobject in data{
            if(compare(input,each_jsonobject,key)==-1)
                satisfies(end+1)=each_jsonobject;
        }
        return satisfies;
    }
    private int[] equal(String key){
        // render the documents and store the required objects in an array
        JSONArray satisfies=new JSONArray();
        for each_jsonobject in data{
            if(compare(input,each_jsonobject,key)==0)
                satisfies(end+1)=each_jsonobject;
        }
        return satisfies; 
    }
    */
}
