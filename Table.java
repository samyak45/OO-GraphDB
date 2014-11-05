import java.io.File;
import java.io.IOException;

public class Table {
	private String name;
	private int numDocs;

	public Table(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumDocs() {
		return numDocs;
	}

	// create doc need not be created as it is already presented in Query
	private void initTable() {
		File file = new File(Database.baseDir + name + ".json");
		boolean blnCreated = false;
		try {
			blnCreated = file.createNewFile();
		} catch (IOException ioe) {
			System.out.println("Error while creating a new empty file :" + ioe);
		}
	
	}

}
