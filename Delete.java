public class Delete extends Query{
    private JSONObject input;
    private JSONAray data;
    public Delete(String dl,JSON object){
        input=object;
        
    };
    //helper functions
    
    public void deleteSpecific(){
        int position=getPosition(input);
        if(position==-1) return;
        JSONArray list=new JSONArray();
        if (data != null) { 
            for (int i=0;i<data.length();i++){ 
            //Excluding the item at position
                if (i != position) list.put(data.get(i));
            }
        }
        data=list;
    }
    public void deleteConditional(String conditions){
        
        Find find=new Find(conditions,input);
        int[] indices=Find.satisfies();
        //sort(indices);
        for(int i=0;i<indices.length();i++)
            deleteSpecific(data.get(indices[i]);
        return;
    }
    private int getPosition(JSONObject object){
        //int pos=-1;
        if(object==null) return -1;
        String valA,valB;
        for(int i=0;i<data.length();i++) 
            for each_key in object {
                valA=object.get(each_key);
                valB=data.get(i).get(each_key);
                if(valA==valB) return i;
            }
                
    }
}
