package maintaining;

import java.time.LocalDate;
import java.util.ArrayList;

import com.csvreader.CsvReader;

import actions.Rent;
import items.PhysicalItem;

public class MaintainRentals {
	public ArrayList<Rent> rentals = new ArrayList<Rent>();
	public String path;


	
	
	
	
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();

		while(reader.readRecord()){
			int param1 = Integer.parseInt(reader.get("userId")); 
			int param2 = Integer.parseInt(reader.get("itemId")); 
			LocalDate date1 = LocalDate.parse(reader.get("dateBorrowed")); 
			LocalDate date2 = LocalDate.parse(reader.get("dateDue"));
			LocalDate date3 = null; // initialize to null

			// Check if dateReturned field is empty before parsing
			if (!reader.get("dateReturned").isEmpty()) {
				date3 = LocalDate.parse(reader.get("dateReturned")); 
			}

			Rent rental = new Rent(param1, param2, date1, date2, date3);
			rentals.add(rental);
		}








	}

}
