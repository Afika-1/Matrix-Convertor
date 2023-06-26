// */
//
//package com.mycompany.unit_conversion;
//
///**
// *
// * @author Afika.Shwashwa
// */
//import java.util.Scanner;
//public class Unit_Conversion {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("\n\nConvertable units: 'Feet' <-> 'Meters', 'Fahrenheit' <-> 'Celsius', 'Pounds' <-> 'Kilograms'\n\n");
//   
//        
//        // Get the unit to convert from.
//        System.out.print("Enter the unit you want to CONVERT FROM: ");
//        String fromUnit = scanner.nextLine();
//
//        // Get the unit to convert to.
//        System.out.print("Enter the unit you want to CONVERT TO: ");
//        String toUnit = scanner.nextLine();
//
//        // Get the quantity to be converted.
//        System.out.print("Enter the quantity you want to converted: ");
//        double quantity = scanner.nextDouble();
//
//        // Convert the quantity from the fromUnit to the toUnit.
//        double convertedQuantity;
//        if ((fromUnit.equals("feet")|| fromUnit.equals("Feet"))  && 
//                (toUnit.equals("meters")|| toUnit.equals("Meters"))) {
//            convertedQuantity = quantity * 0.3048;  
//        } 
//        else if ((fromUnit.equals("meters")|| fromUnit.equals("Meters")) && 
//                ((toUnit.equals("feet")|| toUnit.equals("Feet")))) 
//                {
//            convertedQuantity = quantity * 3.281;  
//                }
//        else if ((fromUnit.equals("pounds")||fromUnit.equals("Pounds")) && 
//                ((toUnit.equals("kilograms")||toUnit.equals("Kilograms")))){
// 
//            convertedQuantity = quantity / 2.205;
//            } 
//        
//        else if ((fromUnit.equals("Kilograms")||fromUnit.equals("kilograms")) && 
//                ((toUnit.equals("Pounds")||toUnit.equals("pounds")))){
// 
//            convertedQuantity = quantity * 2.205;
//            } 
//        
//        
//        else if ((fromUnit.equals("fahrenheit")|| fromUnit.equals("Fahrenheit") )&& 
//                (toUnit.equals("Celsius")|| toUnit.equals("celsius"))) {
//            convertedQuantity = (quantity - 32) * 5 / 9;
//            }
//        else if ((fromUnit.equals("Celsius")|| fromUnit.equals("celsius") )&& 
//                (toUnit.equals("Fahrenheit")|| toUnit.equals("fahrenheit"))) {
//            convertedQuantity = (quantity * 9/5)+ 32;
//            }
//        
//        else {
//            System.out.println("Invalid units.");
//            return;
//        }
//
//        // Print the result of the conversion to the user.
//        System.out.println(quantity + " " + fromUnit + " = " + convertedQuantity + " " + toUnit);
//    }
//}
//    
//

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Unit_Conversion extends JFrame implements ActionListener {
//    private final JComboBox<String> fromUnitComboBox;
//    private final JComboBox<String> toUnitComboBox;
//    private final JTextField quantityField;
//    private final JButton convertButton;
//    private final JLabel resultLabel;
//
//    public Unit_Conversion() {
//        setTitle("Unit Conversion");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(500, 300);
//        setLayout(new GridLayout(4, 2));
//
//        String[] units = {"Feet", "Meters", "Fahrenheit", "Celsius", "Pounds", "Kilograms"};
//
//        JLabel fromUnitLabel = new JLabel("Convert from:");
//        add(fromUnitLabel);
//
//        fromUnitComboBox = new JComboBox<>(units);
//        add(fromUnitComboBox);
//
//        JLabel toUnitLabel = new JLabel("Convert to:");
//        add(toUnitLabel);
//
//        toUnitComboBox = new JComboBox<>(units);
//        add(toUnitComboBox);
//
//        JLabel quantityLabel = new JLabel("Quantity:");
//        add(quantityLabel);
//
//        quantityField = new JTextField();
//        add(quantityField);
//
//        convertButton = new JButton("Convert");
//        convertButton.addActionListener(this);
//        add(convertButton);
//
//        resultLabel = new JLabel("");
//        add(resultLabel);
//
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == convertButton) {
//            String fromUnit = fromUnitComboBox.getSelectedItem().toString();
//            String toUnit = toUnitComboBox.getSelectedItem().toString();
//            double quantity = Double.parseDouble(quantityField.getText());
//
//            double convertedQuantity;
//            if ((fromUnit.equalsIgnoreCase("Feet") || fromUnit.equalsIgnoreCase("Meters")) &&
//                    (toUnit.equalsIgnoreCase("Meters") || toUnit.equalsIgnoreCase("Feet")))
//            {
//                convertedQuantity = fromUnit.equalsIgnoreCase("Feet") ? quantity * 0.305: quantity * 3.28;
//            } 
//            
//            else if ((fromUnit.equalsIgnoreCase("Pounds") || fromUnit.equalsIgnoreCase("Kilograms")) &&
//                    (toUnit.equalsIgnoreCase("Kilograms") || toUnit.equalsIgnoreCase("Pounds"))) 
//            {
//                convertedQuantity = fromUnit.equalsIgnoreCase("Pounds") ? quantity *0.454 : quantity * 2.205;
//            } 
//            
//            else if ((fromUnit.equalsIgnoreCase("Fahrenheit") || fromUnit.equalsIgnoreCase("Celsius")) &&
//                    (toUnit.equalsIgnoreCase("Celsius") || toUnit.equalsIgnoreCase("Fahrenheit"))) 
//            {
//                convertedQuantity = fromUnit.equalsIgnoreCase("Fahrenheit") ?
//                        (quantity - 32) / 1.8: (quantity * 9 / 5) + 32;
//            }
//            else {
//                resultLabel.setText("Invalid units.");
//                return;
//            }
//
//            resultLabel.setText(quantity + " " + fromUnit + " = " + convertedQuantity + " " + toUnit);
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(Unit_Conversion::new);
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Unit_Conversion extends JFrame implements ActionListener {
    private final JComboBox<String> fromUnitComboBox;
    private final JComboBox<String> toUnitComboBox;
    private final JTextField quantityField;
    private final JButton convertButton;
    private final JLabel resultLabel;

    public Unit_Conversion() {
        setTitle("Unit Conversion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setLayout(new BorderLayout());
        setResizable(true);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2,2));

        String[] units = {"Feet", "Meters", "Fahrenheit", "Celsius", "Pounds", "Kilograms"};

        JLabel fromUnitLabel = new JLabel("Convert from:");
        inputPanel.add(fromUnitLabel);

        fromUnitComboBox = new JComboBox<>(units);
        inputPanel.add(fromUnitComboBox);

        JLabel toUnitLabel = new JLabel("Convert to:");
        inputPanel.add(toUnitLabel);

        toUnitComboBox = new JComboBox<>(units);
        inputPanel.add(toUnitComboBox);

        JLabel quantityLabel = new JLabel("Quantity:");
        inputPanel.add(quantityLabel);

        quantityField = new JTextField(10);
        inputPanel.add(quantityField);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        inputPanel.add(convertButton);

        add(inputPanel, BorderLayout.NORTH);

        resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(resultLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            String fromUnit = fromUnitComboBox.getSelectedItem().toString();
            String toUnit = toUnitComboBox.getSelectedItem().toString();
            double quantity = Double.parseDouble(quantityField.getText());

            double convertedQuantity;
            if ((fromUnit.equalsIgnoreCase("Feet") || fromUnit.equalsIgnoreCase("Meters")) &&
                    (toUnit.equalsIgnoreCase("Meters") || toUnit.equalsIgnoreCase("Feet"))) {
                convertedQuantity = fromUnit.equalsIgnoreCase("Feet") ? quantity * 0.3048 : quantity * 3.281;
            } else if ((fromUnit.equalsIgnoreCase("Pounds") || fromUnit.equalsIgnoreCase("Kilograms")) &&
                    (toUnit.equalsIgnoreCase("Kilograms") || toUnit.equalsIgnoreCase("Pounds"))) {
                convertedQuantity = fromUnit.equalsIgnoreCase("Pounds") ? quantity / 2.205 : quantity * 2.205;
            } else if ((fromUnit.equalsIgnoreCase("Fahrenheit") || fromUnit.equalsIgnoreCase("Celsius")) &&
                    (toUnit.equalsIgnoreCase("Celsius") || toUnit.equalsIgnoreCase("Fahrenheit"))) {
                convertedQuantity = fromUnit.equalsIgnoreCase("Fahrenheit") ?
                        (quantity - 32) * 5 / 9 : (quantity * 9 / 5) + 32;
            } else {
                resultLabel.setText("Invalid units.");
                return;
            }

            resultLabel.setText(quantity + " " + fromUnit + " = " + convertedQuantity + " " + toUnit);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Unit_Conversion::new);
    }
}
