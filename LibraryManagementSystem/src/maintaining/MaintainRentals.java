package maintaining;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import actions.Rent;

//class for creating new rental objects and writing object entries to the itemsBorrowed csv file
public class MaintainRentals {
	public ArrayList<Rent> rentals = new ArrayList<Rent>();
	public String path;

	//method to create rental objects from the itemsBorrowed csv file
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();

		while(reader.readRecord()){
			int param0 = Integer.parseInt(reader.get("rentalId")); 
			int param1 = Integer.parseInt(reader.get("userId")); 
			int param2 = Integer.parseInt(reader.get("itemId")); 
			LocalDate date1 = LocalDate.parse(reader.get("dateBorrowed")); 
			LocalDate date2 = LocalDate.parse(reader.get("dateDue"));
			LocalDate date3 = null; // initialize to null
			//int param5 = Integer.parseInt(reader.get("rentalId")); 

			// Check if dateReturned field is empty before parsing
			if (!reader.get("dateReturned").isEmpty()) {
				date3 = LocalDate.parse(reader.get("dateReturned")); 
			}

			Rent rental = new Rent(param1, param2, date1, date2, date3, param0);
			rentals.add(rental);
		}

	}
	//method to write rental objects to the itemsBorrowed csv file
	public void update(String path) throws Exception{
		try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			csvOutput.write("rentalId");
			csvOutput.write("userId");
			csvOutput.write("itemId");
			csvOutput.write("dateBorrowed");
			csvOutput.write("dateDue");
			csvOutput.write("dateReturned");
			csvOutput.endRecord();

			for(Rent r: rentals){
				if (r.getRentalId() >= 0) { // Only write to CSV if rental was successfully created
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					csvOutput.write(Integer.toString(r.getRentalId()));
					csvOutput.write(Integer.toString(r.getUserId()));
					csvOutput.write(Integer.toString(r.getItemId()));
					csvOutput.write(r.getDateBorrowed().format(formatter));
					csvOutput.write(r.getDateDue().format(formatter));
					if (r.getDateReturned() != null) {
						csvOutput.write(r.getDateReturned().format(formatter));
					}
					csvOutput.endRecord();
				}
			}
			csvOutput.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void returnDate(int rentalId) {
		for(Rent r: rentals){
			if (rentalId == r.getRentalId()) {
				r.setDateReturned(LocalDate.now());	
			}
		}


	}












}