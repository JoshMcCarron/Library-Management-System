package search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import items.PhysicalItem;
import structure.Main;

public class Search extends JTextField{
	private ArrayList<PhysicalItem> items;
    private JTextField searchField;
    private String searchedItem;


	public Search(ArrayList<PhysicalItem> items) {
		this.items = items;
		this.searchField = new JTextField(20);

		this.searchField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				showRecs();
			}
			public void removeUpdate(DocumentEvent e) {
				showRecs();
			}
			public void insertUpdate(DocumentEvent e) {
				showRecs();
			}

			public void showRecs() {
                String searchText = searchField.getText();
                List<String> results = items.stream().filter(item -> item.getTitle().startsWith(searchText)).map(PhysicalItem::getTitle).collect(Collectors.toList());
                System.out.println("Search results: " + results);
            }
        });

        this.searchField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchedItem = searchField.getText();
                System.out.println("Searched item: " + searchedItem);
                searchField.setText(""); // Clear the text field
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                searchField.requestFocusInWindow();
            }
        });
    }

    public JTextField getSearchField() {
        return this.searchField;
    }

    public String getSearchedItem() {
        return this.searchedItem;
    }
}