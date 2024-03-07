package maintaining;

import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import items.OnlineResource;

public class MaintainOnlineResources {
	public ArrayList<OnlineResource> resources = new ArrayList<OnlineResource>();
	public String path;
	
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		
		while(reader.readRecord()){ 
			OnlineResource resource = new OnlineResource(path) {};
			resource.setTitle(reader.get("title"));
			resources.add(resource);
		}
	}
	
	public void update(String path) throws Exception{
		try {		
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		    	csvOutput.write("title");
				csvOutput.endRecord();

				for(OnlineResource r: resources){
					csvOutput.write(r.getTitle());
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}