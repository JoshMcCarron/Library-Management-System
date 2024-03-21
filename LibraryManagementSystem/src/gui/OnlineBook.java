package gui;

import javax.swing.*;
import java.awt.*;

public class OnlineBook extends JFrame {
    private String name;
    private String text;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public OnlineBook(String name, String text) {
        this.name = name;
        this.text = text;

        setTitle(name);
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(800,600));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setAlignmentX(CENTER_ALIGNMENT);
        textArea.setText(text);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
