package actions;

//This class is to handle each purchase interaction

public class Purchase {
  private int purchaseId;
  private int userId;
  private int itemId;
  private static int lastId = 0;

//constructor for creating new purchases
  public Purchase(int userId, int itemId) {
	  this.purchaseId =  ++lastId;
	 this.userId = userId;
	 this.itemId = itemId;
	  
  }
  //constructor for creating purchases from the purchase csv file
  public Purchase(int purchaseId, int userId, int itemId) {
	 this.purchaseId = purchaseId;
	 this.userId = userId;
	 this.itemId = itemId;
	 lastId = purchaseId;
	  
  }


//getters and setters
public int getPurchaseId() {
	return purchaseId;
}


public void setPurchaseId(int purchaseId) {
	this.purchaseId = purchaseId;
}


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}


public int getItemId() {
	return itemId;
}


public void setItemId(int itemId) {
	this.itemId = itemId;
}
  
}