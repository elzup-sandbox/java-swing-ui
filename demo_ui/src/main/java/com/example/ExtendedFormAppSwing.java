package com.example;

import javax.swing.*;
import java.awt.*;

public class ExtendedFormAppSwing extends JFrame {
    public ExtendedFormAppSwing() {
        setTitle("Extended Form Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Add padding

        // Create labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");

        // Create text fields
        JTextField nameField = new JTextField(20);
        JTextField ageField = new JTextField(5);

        // Create checkboxes
        JCheckBox subscribeCheckbox = new JCheckBox("Subscribe to newsletter");

        // Create radio buttons
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Create a submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Form submitted!"));

        // Add components to panel with layout constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(ageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(ageField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(subscribeCheckbox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(maleRadio, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(femaleRadio, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(submitButton, gbc);

        // Add panel to frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExtendedFormAppSwing app = new ExtendedFormAppSwing();
            app.setVisible(true);
        });
    }
}
