public class Query{
    protected String dName;
    protected String tName;
    protected JSONArray fileData;
    public Query(){}
    public Query(String d,String t){
        dName=d;
        tName=t;
        /*
            go to folder dName
            go to file tName
        */
    }
    public Insert insert(JSON object){
        /**/
        Insert insNew = new Insert(object);
        return insNew;
    }
    public Find find(String f,JSON object){
        /**/
        Find findNew = new Find(f,object);
        return findNew;
    }
    public Delete delete(String d,JSON object){
        /**/
        Delete delNew = new Insert(d,object);
        return delNew;
    }
    public Update update(String u,JSON object1,JSON object2){
        /**/
        Update updNew = new Insert(u,object1,object2);
        return updNew;
    }

}
