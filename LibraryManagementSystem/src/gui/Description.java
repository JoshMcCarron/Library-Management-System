package gui;

import javax.swing.*;

import actions.Rent;

import java.awt.*;
import java.util.ArrayList;

public class Description extends JFrame {

    public Description(String name, ArrayList<Rent> rentals) {
        setTitle(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
