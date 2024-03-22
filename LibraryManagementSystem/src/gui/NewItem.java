package gui;

import javax.swing.*;

import actions.Rent;
import items.Book;
import items.CD;
import items.ItemKeeper;
import items.Magazine;
import items.PhysicalItem;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainRentals;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class NewItem extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MaintainPhysicalItems maintainItem;
	private String itemsPath;
	private MaintainRentals maintainRental;
	private String rentalsPath;

	public NewItem(MaintainPhysicalItems maintainItem, String itemsPath, MaintainRentals maintainRental, String rentalsPath) {
		this.maintainItem = maintainItem;
		this.itemsPath = itemsPath;
		this.maintainRental = maintainRental;
		this.rentalsPath = rentalsPath;
		
		
		
		
		setTitle("Add/Remove Item");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1, 5, 0));
        
        JPanel authorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel authorLabel = new JLabel("Enter Author Name: ");
        authorPanel.add(authorLabel);
        
        JPanel bookPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel bookLabel = new JLabel("Enter Book Name: ");
        bookPanel.add(bookLabel);
        
        JPanel typePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel typeLabel = new JLabel("Enter item type (For adding): ");
        typePanel.add(typeLabel);
        
        //getting author
        JTextArea authorField = new JTextArea(1, 20);
		authorPanel.add(authorField);
		authorField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		authorField.setEditable(true);
        //getting title
		JTextArea bookField = new JTextArea(1, 20);
		bookPanel.add(bookField);
		bookField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		bookField.setEditable(true);
		
        //getting item type
        JTextArea typeField = new JTextArea(1, 20);
		typePanel.add(typeField);
		typeField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		typeField.setEditable(true);

		

        JButton addButton = new JButton("Add Item");
        mainPanel.add(addButton);
        addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String manageType = typeField.getText();
				String manageTitle = bookField.getText();
				String manageAuthor = authorField.getText();
				//Place the code for the button here
				if (!manageType.equals("Book")&&!manageType.equals("CD")&&!manageType.equals("Magazine")) {
	    			JOptionPane.showMessageDialog(null, "INVALID ITEM TYPE");
	    			typeField.setText("");
				}
				//if everything is valid, add item to items list and write to csv file
				else {
	    			JOptionPane.showMessageDialog(null, "Item successfully added!", "Success", JOptionPane.INFORMATION_MESSAGE);
					ItemKeeper ik = new ItemKeeper();
					//acts as a client for the facade pattern
					switch(manageType) {
					case "Book":
						Book book = ik.createBook(manageTitle, manageAuthor);
						maintainItem.items.add(book);
						try {
							maintainItem.update(itemsPath);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					case "Magazine":
						Magazine magazine = ik.createMagazine(manageTitle, manageAuthor);
						maintainItem.items.add(magazine);
						try {
							maintainItem.update(itemsPath);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					case "CD":
						CD cd = ik.createCD(manageTitle, manageAuthor);
						maintainItem.items.add(cd);
						try {
							maintainItem.update(itemsPath);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					default:
						throw new IllegalArgumentException("Invalid item type: " + manageType);
					}

				}
			}
		});
		
		JButton removeButton = new JButton("Remove Item");
        mainPanel.add(removeButton);
        removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String manageTitle = bookField.getText();

				//Place the code for the button here
		        PhysicalItem itemToRemove = null;
		        //list of rentals to remove as if an item does not exist, users cannot rent it
		        List<Rent> rentalsToRemove = new ArrayList<>();
		        //iterate through items to see if item user wishes to remove exists
		        Iterator<PhysicalItem> itemIterator = maintainItem.items.iterator();
		        while(itemIterator.hasNext()){
		        	//item is set to the next item in the iteration
		            PhysicalItem i = itemIterator.next();
		            if(manageTitle.equals(i.getTitle())) {
		                itemToRemove = i; //sets item to remove
		                //iterate through rentals and add each rental that matches the item that is removed to the remove list
		                Iterator<Rent> rentalIterator = maintainRental.rentals.iterator();
		                while(rentalIterator.hasNext()){
		                    Rent r = rentalIterator.next();
		                    if (r.getItemId()==itemToRemove.getId()) {
		                        rentalsToRemove.add(r);
		                    }
		                }
		            }
		        }
		        //if user is removing an item
		        if(itemToRemove!= null) {
		            //iterate through rentals and remove each rental that includes item
		            Iterator<Rent> rentalToRemoveIterator = rentalsToRemove.iterator();
		            while(rentalToRemoveIterator.hasNext()){
		                Rent r = rentalToRemoveIterator.next();
		                maintainRental.rentals.remove(r);
		            }
		            //update the rentals csv, remove the item from the items list, and finally update the item csv
		            try {
						maintainRental.update(rentalsPath);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            maintainItem.items.remove(itemToRemove);
		            try {
						maintainItem.update(itemsPath);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    			JOptionPane.showMessageDialog(null, "Item successfully removed!", "Success", JOptionPane.INFORMATION_MESSAGE);

		        }
		        //if user tries to remove item that doesn't exist
		        else {
	    			JOptionPane.showMessageDialog(null, "An item with that title is not in our database");
		        }
		    }
			
		});
        

		
		mainPanel.add(authorPanel);
		mainPanel.add(bookPanel);
		mainPanel.add(typePanel);
		mainPanel.add(addButton);
		mainPanel.add(removeButton);

		
		getContentPane().add(mainPanel);
		
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
	}
}