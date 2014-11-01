public class Update extends Query{
    private JSONArray data;
    private String updateData;
    private String orig,updt;
    private String key1,key2;
    public Update(String ud,JSONObject object1,JSONObject object2){
        updateData=ud;
        key1=object1.keys().get(0);
        key2=object2.keys().get(0);
        orig=object1.get(key1);
        updt=object2.get(key2);
        data = FileControl.readFromFile(super.dName,super.tName).get('tName');
        update();
    }
    //Find find=new Find(updateData,orig);
    private boolean compare(String a,String b){
    	if(updateData=='gt')
    		return (a.compareTo(b) >0 );
    	else if(updateData=="lt")
    		return (a.compareTo(b) <0 );
    	else if(updateData=="eq")
    		return a.equals(b);
    	return false;
    }
    private void update(){
    	for(int i=0;i<data.length();i++){
    		if(compare(data[i].get(key1),orig)==true){
    			data[i].put(key2,updt);
       		}
    	}
    }


    //helper functions
}
