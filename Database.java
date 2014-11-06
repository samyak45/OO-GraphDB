import java.util.*;
import java.io.*;

public class Database {
	private String name;
	public static String baseDir="C://";
	//private HashMap tables;
	private int numTables;

	public Database(String name) {
		this.name = name;
		MetaData.update(name);
		this.initDB();
		// tables = new HashMap();
		// create folder having the name name
	}

	public String getName() {
		return name;
	}

	public int getNumTables() {
		return numTables;
	}

	public Table createTable(String tName) {
		// create a new file with the name tName in folder name
		Table table = new Table(tName);
		table.initTable();
		MetaData.update(false,dName,tName);
		return table;
	}

	public Table getTable(String tName) {
		// returns a table with name tName from metadata
		//return tables(tName);
		return null;
	}
	public void initDB(){
		File dir = new File(baseDir+name);
		
		boolean isDirectoryCreated = dir.mkdir();
	   
	     if(isDirectoryCreated)
	       System.out.println("Empty DB created successfully");
	     else
	       System.out.println("Empty DB was not created successfully");
	  }

	}


