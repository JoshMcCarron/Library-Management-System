package gui;
import javax.swing.*;

import actions.Purchase;
import items.PhysicalItem;
import maintaining.MaintainPurchases;
import userTypes.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchaseDetails extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame();
	private JPanel cardPanel;
	private CardLayout cardLayout;
	private JButton debitButton;
	private JButton creditButton;
	//Items for book
	protected JLabel bookNameLabel;
	protected JLabel authorLabel;
	protected JLabel priceLabel;
	private JLabel paymentType = new JLabel();
	JPanel detailsPanel = new JPanel();
	JPanel confirmationPanel = new JPanel();
	private User user;
	private PhysicalItem item;
	private String purchasePath;
	private MaintainPurchases maintainPurchase;

	public PurchaseDetails(String bookName, String author, String price, User user, PhysicalItem item, String purchasePath, MaintainPurchases maintainPurchase) {
		this.user = user;
		this.item = item;
		this.purchasePath = purchasePath;
		this.maintainPurchase = maintainPurchase;
		
		
		
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(new BorderLayout());

		// Create panel for card layout
		cardPanel = new JPanel();
		cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);

		//Details panel
		detailsPanel.setLayout(new GridLayout(0, 1));
		bookNameLabel = new JLabel("Name of Book: " + bookName);
		authorLabel = new JLabel("Author: " + author);
		if(Double.parseDouble(price)<5) {
			priceLabel = new JLabel("**SALE!** Price: $" + price);
		}
		else {
			priceLabel = new JLabel("Price: $" + price);

		}
		
		debitButton = new JButton("Debit");
		debitButton.addActionListener(this);
		creditButton = new JButton("Credit");
		creditButton.addActionListener(this);
		JPanel paymentButtons = new JPanel();
		paymentButtons.setLayout(new FlowLayout(FlowLayout.CENTER));
		paymentButtons.add(debitButton);
		paymentButtons.add(creditButton);
		detailsPanel.add(bookNameLabel);
		detailsPanel.add(authorLabel);
		detailsPanel.add(priceLabel);
		detailsPanel.add(paymentButtons);
		bookNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		authorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		priceLabel.setHorizontalAlignment(SwingConstants.CENTER);


		//Confirmation Panel
		confirmationPanel.setLayout(new GridLayout(0, 1));
		JLabel confirmationLabel = new JLabel("PURCHASE CONFIRMED");
		confirmationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		confirmationPanel.add(confirmationLabel);
		paymentType.setHorizontalAlignment(SwingConstants.CENTER);
		confirmationPanel.add(paymentType);

		// Add panels to card panel
		cardPanel.add(detailsPanel, "details");
		cardPanel.add(confirmationPanel, "confirmation");

		// Add card panel to main panel
		panel.add(cardPanel, BorderLayout.CENTER);

		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Purchase newPurchase = new Purchase(user.getId(), item.getId());
		maintainPurchase.purchases.add(newPurchase);
		try {
			maintainPurchase.update(purchasePath);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		cardLayout.show(cardPanel, "confirmation");
		confirmationPanel.add(bookNameLabel);
		confirmationPanel.add(authorLabel);
		confirmationPanel.add(priceLabel);
		bookNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		authorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		priceLabel.setHorizontalAlignment(SwingConstants.CENTER);


		if (e.getSource() == debitButton) {
			paymentType.setText("Payment used: Debit");
		}
		else {
			paymentType.setText("Payment used: Credit");
		}

	}
}