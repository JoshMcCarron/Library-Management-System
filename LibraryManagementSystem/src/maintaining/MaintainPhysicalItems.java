package maintaining;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import items.*;
import userTypes.Faculty;
import userTypes.NonFaculty;
import userTypes.Student;
import userTypes.User;
import userTypes.Visitor;

public class MaintainPhysicalItems {
	public ArrayList<PhysicalItem> items = new ArrayList<PhysicalItem>();
	public String path;

	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();

		while(reader.readRecord()){
			String itemType = reader.get("itemType");
			PhysicalItem item;

			switch(itemType) {
			case "Book":
				item = new Book(path, path, path,Integer.parseInt(reader.get("copies")));
				break;
			case "Magazine":
				item = new Magazine(path, path, path,Integer.parseInt(reader.get("copies")));
				break;
			case "CD":
				item = new CD(path, path, path,Integer.parseInt(reader.get("copies")));
				break;
			default:
				throw new IllegalArgumentException("Invalid item type: " + itemType);
			}

			item.setId(Integer.valueOf(reader.get("id")));
			item.setTitle(reader.get("title"));
			item.setNumOfCopies(Integer.valueOf(reader.get("copies")));
			item.setAuthor(reader.get("author"));
			item.setItemType(reader.get("itemType"));
			items.add(item);
		}
	}

	public void update(String path) throws Exception{
		try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			csvOutput.write("id");
			csvOutput.write("title");
			csvOutput.write("copies");
			csvOutput.write("author");
			csvOutput.write("itemType");
			csvOutput.endRecord();

			for(PhysicalItem i: items){
				csvOutput.write(String.valueOf(i.getId()));
				csvOutput.write(i.getTitle());
				csvOutput.write(String.valueOf(i.getNumOfCopies()));
				csvOutput.write(i.getAuthor());
				csvOutput.write(i.getItemType());
				csvOutput.endRecord();
			}
			csvOutput.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PhysicalItem request(String author, String title) {
		try {
			PhysicalItem item;
			if (simulateRequest() > 5) {
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

	public int simulateRequest() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;
		return randomNumber;		
	}
	
	public void decreaseCopies(int itemId) {
		for(PhysicalItem i: items){
			if (itemId == i.getId()) {
				i.decreaseCopies();
				System.out.println(i);
			}
		}

	
	}
}