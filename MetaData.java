import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MetaData{
	private String fileName;
	private int count;
	private ArrayList<String> contents;
	public MetaData(String fn){
		fileName=fn;
		count=0;
		contents=new ArrayList<>;
	}
	public void update(String name){
		contents.add(name);
		count++;
		dumpToFile();
	}
	private void dumpToFile(){
		BufferedWriter bw = new BufferedWriter(new FileWriter);
		bw.write(count.toString()+'\n'+contents.toString());
		bw.close();
	}
}