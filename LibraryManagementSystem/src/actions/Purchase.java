package actions;

import items.Newsletter;
import items.PhysicalItem;
import userTypes.User;

public class Purchase {
    private PhysicalItem item;
    private double price;
    private Newsletter resource;
    private double discount;
    private String paymentOption;
    private User user;

    public void makePurchase(User user, String paymentOption, double itemPrice, PhysicalItem item) {
        // implementation here
    }

    public void makeSubscription(User user, String paymentOption, double price, Newsletter resource) {
        // implementation here
    }

    public void offerDiscount(User user, PhysicalItem item, double discount) {
        // implementation here
    }
}