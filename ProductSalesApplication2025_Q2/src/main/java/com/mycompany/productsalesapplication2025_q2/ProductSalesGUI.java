/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesapplication2025_q2;

import java.awt.BorderLayout;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mazibuko
 */
public class ProductSalesGUI extends JFrame {
 // Create the GUI components.
    private JButton btnLoad;
    private JButton btnSave;
    private JTextArea txtReport;
    private JLabel lblYearsProcessed;

    // Create an object of the ProductSales class.
    private ProductSales sales = new ProductSales();

    public ProductSalesGUI() {

        // Set the window title.
        setTitle("Product Sales Report");

        // Set the window size.
        setSize(600, 450);

        // Close the application when the window closes.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Position the window in the centre.
        setLocationRelativeTo(null);

        // Create the main panel.
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // Create the buttons.
        btnLoad = new JButton("Load Products Data");
        btnSave = new JButton("Save Product Data");

        // Create a panel for the buttons.
        JPanel buttonPanel = new JPanel();

        buttonPanel.add(btnLoad);
        buttonPanel.add(btnSave);

        // Create the text area.
        txtReport = new JTextArea();
        txtReport.setEditable(false);

        // Add a scroll bar to the text area.
        JScrollPane scrollPane = new JScrollPane(txtReport);

        // Create the years processed label.
        lblYearsProcessed = new JLabel("Years Processed: ");

        // Add components to the main panel.
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(lblYearsProcessed, BorderLayout.SOUTH);

        // Add the main panel to the frame.
        add(mainPanel);

        // Create the menu system.
        createMenu();

        // Connect the buttons to their methods.
        btnLoad.addActionListener(e -> loadProductData());
        btnSave.addActionListener(e -> saveProductData());
    }

    // Create the menu system.
    private void createMenu() {

        JMenuBar menuBar = new JMenuBar();

        // Create the File menu.
        JMenu fileMenu = new JMenu("File");

        JMenuItem exitItem = new JMenuItem("Exit");

        // Close the application.
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);

        // Create the Tools menu.
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem saveItem = new JMenuItem("Save Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");

        // Use the same methods as the buttons.
        loadItem.addActionListener(e -> loadProductData());
        saveItem.addActionListener(e -> saveProductData());

        // Clear the report and years processed label.
        clearItem.addActionListener(e -> clearData());

        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        // Add menus to the menu bar.
        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);
    }

    // Load sales data and display the report.
    private void loadProductData() {

        int[][] productData = sales.GetProductSales();

        StringBuilder report = new StringBuilder();

        report.append("PRODUCT SALES REPORT\n");
        report.append("------------------------------\n\n");

        String[] products = {
            "Microphone", "Speakers", "Mixing Desk"
        };

        // Display the sales for each year.
        for (int year = 0; year < productData.length; year++) {

            report.append("Year ").append(year + 1).append("\n");

            for (int product = 0; product < productData[year].length; product++) {

                report.append(products[product])
                      .append(": ")
                      .append(productData[year][product])
                      .append("\n");
            }

            report.append("\n");
        }

        // Display the calculated sales information.
        report.append("SALES SUMMARY\n");
        report.append("------------------------------\n");

        report.append("Total Sales: ")
              .append(sales.GetTotalSales()).append("\n");

        report.append("Average Sales: ")
              .append(String.format("%.2f", sales.GetAverageSales()))
              .append("\n");

        report.append("Sales Over Limit: ")
              .append(sales.GetSalesOverLimit()).append("\n");

        report.append("Sales Under Limit: ")
              .append(sales.GetSalesUnderLimit()).append("\n");

        // Display the report in the text area.
        txtReport.setText(report.toString());

        // Display the number of years processed.
        lblYearsProcessed.setText(
            "Years Processed: " + sales.GetProductsProcessed()
        );
    }

    // Save the report to data.txt.
    private void saveProductData() {

        try {

            Files.write(
                Paths.get("data.txt"),
                txtReport.getText().getBytes(StandardCharsets.UTF_8)
            );

            JOptionPane.showMessageDialog(
                this,
                "Product data saved successfully!"
            );

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(
                this,
                "Error saving product data: " + ex.getMessage()
            );
        }
    }

    // Clear the text area and years processed label.
    private void clearData() {

        txtReport.setText("");
        lblYearsProcessed.setText("Years Processed: ");
    }

    // Main method to start the application.
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new ProductSalesGUI().setVisible(true);
        });
    }    
}
