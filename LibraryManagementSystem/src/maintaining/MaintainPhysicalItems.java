package maintaining;

import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import items.PhysicalItem;

public class MaintainPhysicalItems {
	public ArrayList<PhysicalItem> items = new ArrayList<PhysicalItem>();
	public String path;
	
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		
		while(reader.readRecord()){ 
			PhysicalItem item = new PhysicalItem(0, path) {};
			item.setNumOfCopies(Integer.valueOf(reader.get("copies")));
			item.setTitle(reader.get("title"));
			items.add(item);
		}
	}
	
	public void update(String path) throws Exception{
		try {		
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		    	csvOutput.write("copies");
				csvOutput.write("title");
				csvOutput.endRecord();

				for(PhysicalItem i: items){
					csvOutput.write(String.valueOf(i.getNumOfCopies()));
					csvOutput.write(i.getTitle());
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}