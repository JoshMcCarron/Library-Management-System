package actions;

import items.Newsletter;
import items.PhysicalItem;
import userTypes.User;

public class Purchase {
  private int purchaseId;
  private int userId;
  private int itemId;
  private static int lastId = 0;


  public Purchase(int userId, int itemId) {
	  this.purchaseId =  ++lastId;
	 this.userId = userId;
	 this.itemId = itemId;
	  
  }
  public Purchase(int purchaseId, int userId, int itemId) {
	 this.purchaseId = purchaseId;
	 this.userId = userId;
	 this.itemId = itemId;
	 lastId = purchaseId;
	  
  }



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