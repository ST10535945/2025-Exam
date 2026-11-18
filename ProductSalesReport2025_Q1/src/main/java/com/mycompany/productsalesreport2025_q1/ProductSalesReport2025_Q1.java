/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport2025_q1;

/**
 *
 * @author Mazibuko
 */
public class ProductSalesReport2025_Q1 {

    public static void main(String[] args) {
        System.out.println("QUESTION 1.1-------");
     //Question 1.1)2025 exam 
    // Create a two-dimensional array to store sales.
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };
        
     // Create a single-dimensional array to store sales values 
         String []quarters= {
             "Quarter 1","Quater 2","Quater 3"
         };
         
           // Variables to calculate sales information.
        int totalSales = 0;
        int maxSale = productSales[0][0];
        int minSale = productSales[0][0];
        int count = 0;

        // Display the sales report heading.
        System.out.println("PRODUCT SALES REPORT");
        System.out.println("----------------------------");

        // Loop through the two years.
        for (int year = 0; year < productSales.length; year++) {

            System.out.println("Year " + (year + 1));

            // Loop through the three quarters.
            for (int quarter = 0; quarter < productSales[year].length; quarter++) {

                // Get the current sales value.
                int sale = productSales[year][quarter];

                // Display the quarter and its sales.
                System.out.println(quarters[quarter] + ": " + sale);

                // Calculate total sales.
                totalSales += sale;

                // Check for the highest sale.
                if (sale > maxSale) {
                    maxSale = sale;
                }

                // Check for the lowest sale.
                if (sale < minSale) {
                    minSale = sale;
                }

                // Count the number of sales values.
                count++;
            }

            System.out.println();
        }

        // Calculate average sales.
        double averageSales = (double) totalSales / count;

        // Display the final results.
        System.out.println("SALES SUMMARY");
        System.out.println("----------------------------");
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);
        System.out.println("Maximum Sale: " + maxSale);
        System.out.println("Minimum Sale: " + minSale);
         
        
        System.out.println("QUESTION 1.2-------");
        

        // Create an object of ProductSales.
        ProductSales sales = new ProductSales();

        // Display the calculated results.
        System.out.println("Total Sales: "
                + sales.TotalSales(productSales));

        System.out.println("Average Sales: "
                + sales.AverageSales(productSales));

        System.out.println("Maximum Sale: "
                + sales.MaxSale(productSales));

        System.out.println("Minimum Sale: "
                + sales.MinSale(productSales));
    }
    }
       

