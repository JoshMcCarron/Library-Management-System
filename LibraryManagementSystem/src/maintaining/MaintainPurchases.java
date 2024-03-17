package maintaining;

import java.io.FileWriter;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import actions.Purchase;


public class MaintainPurchases {
	public ArrayList<Purchase> purchases = new ArrayList<Purchase>();
	public String path;

	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();

		while(reader.readRecord()){
			int param0 = Integer.parseInt(reader.get("purchaseId")); 
			int param1 = Integer.parseInt(reader.get("userId")); 
			int param2 = Integer.parseInt(reader.get("itemId")); 



			Purchase purchase = new Purchase(param0, param1, param2);
			purchases.add(purchase);
		}

	}

	public void update(String path) throws Exception{
		try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			csvOutput.write("purchaseId");
			csvOutput.write("userId");
			csvOutput.write("itemId");
			csvOutput.endRecord();

			for(Purchase p: purchases){
				if (p.getPurchaseId() >= 0) { // Only write to CSV if rental was successfully created
					csvOutput.write(Integer.toString(p.getPurchaseId()));
					csvOutput.write(Integer.toString(p.getUserId()));
					csvOutput.write(Integer.toString(p.getItemId()));
					csvOutput.endRecord();
				}
			}
			csvOutput.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


}
