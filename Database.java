import java.util.*;
import java.io.*;

public class Database {
	private String name;
	//private HashMap tables;
	private int numTables;

	public Database(String name) {
		this.name = name;
		MetaData.update();
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
		// TODO : insert the name of the table to metadata
		Table table = new Table(tName);
		MetaData.update(false,dName,tName);
		return table;
	}

	public Table getTable(String tName) {
		// returns a table with name tName from metadata
		// TODO : access to metadata
		//return tables(tName);
		return null;
	}

}
