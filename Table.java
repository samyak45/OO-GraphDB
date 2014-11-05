public class Table{
    private String name;
    private int numDocs;

    public Table(String name){
        this.name=name;
        //MetaData.update(false,tName);
    }
    public String getName(){
        return name;
    }
    public int getNumDocs(){
        return numDocs;
    }
    //create doc need not be created as it is already presented in Query


}
