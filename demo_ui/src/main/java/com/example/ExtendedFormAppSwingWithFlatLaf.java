package com.example;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;


public class ExtendedFormAppSwingWithFlatLaf extends ExtendedFormAppSwing {
    public ExtendedFormAppSwingWithFlatLaf() {
        super();
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            SwingUtilities.updateComponentTreeUI(this.getContentPane());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExtendedFormAppSwingWithFlatLaf app = new ExtendedFormAppSwingWithFlatLaf();
            app.setVisible(true);
        });
    }
}
