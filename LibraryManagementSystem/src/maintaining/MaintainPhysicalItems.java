package maintaining;

import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import items.*;
import structure.Management;

//class for creating new item objects and writing object entries to the item csv file
public class MaintainPhysicalItems {
	public ArrayList<PhysicalItem> items = new ArrayList<PhysicalItem>();
	public String path;

	//method to create item objects from the item csv file
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();

		while(reader.readRecord()){
			String itemType = reader.get("itemType");
			PhysicalItem item;

			switch(itemType) {
			case "Book":
				item = new Book(Integer.parseInt(reader.get("id")),path, path, path,Integer.parseInt(reader.get("copies")), path, path);
				break;
			case "Magazine":
				item = new Magazine(Integer.parseInt(reader.get("id")),path, path, path,Integer.parseInt(reader.get("copies")), path,path);
				break;
			case "CD":
				item = new CD(Integer.parseInt(reader.get("id")),path, path, path,Integer.parseInt(reader.get("copies")), path,path);
				break;
			default:
				throw new IllegalArgumentException("Invalid item type: " + itemType);
			}

			item.setId(Integer.valueOf(reader.get("id")));
			item.setTitle(reader.get("title"));
			item.setNumOfCopies(Integer.valueOf(reader.get("copies")));
			item.setAuthor(reader.get("author"));
			item.setItemType(reader.get("itemType"));
			item.setLocation(reader.get("location"));
			item.setPurchasable(reader.get("purchasable"));
			items.add(item);
		}
	}
	//method to write item objects to the item csv file
	public void update(String path) throws Exception{
		try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			csvOutput.write("id");
			csvOutput.write("title");
			csvOutput.write("copies");
			csvOutput.write("author");
			csvOutput.write("itemType");
			csvOutput.write("location");
			csvOutput.write("purchasable");
			csvOutput.endRecord();

			for(PhysicalItem i: items){
				csvOutput.write(String.valueOf(i.getId()));
				csvOutput.write(i.getTitle());
				csvOutput.write(String.valueOf(i.getNumOfCopies()));
				csvOutput.write(i.getAuthor());
				csvOutput.write(i.getItemType());
				csvOutput.write(i.getLocation());
				if (i.getPurchasable()!= null) {
					csvOutput.write(i.getPurchasable());
				}
				csvOutput.endRecord();
			}
			csvOutput.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PhysicalItem request(String author, String title, Management manager) {
		try {
			PhysicalItem item;
			if (manager.simulateRequest() > 5) {
				item = new Book(title, author, "Book");
			}
			else {
				item = null; 
			}
			return item;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}



	public void decreaseCopies(int itemId) {
		for(PhysicalItem i: items){
			if (itemId == i.getId()) {
				i.decreaseCopies();
			}
		}
	}

	public void increaseCopies(int itemId) {
		for(PhysicalItem i: items){
			if (itemId == i.getId()) {
				i.increaseCopies();
			}
		}
	}


}