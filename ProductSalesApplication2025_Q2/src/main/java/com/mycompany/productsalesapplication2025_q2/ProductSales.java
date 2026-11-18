/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesapplication2025_q2;

/**
 *
 * @author Mazibuko
 */
public class ProductSales implements IProductSales {
  // Set the sales limit.
    private final int SALES_LIMIT = 500;

    // Store the product sales data for two years.
    private final int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // Return the product sales array.
    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    // Calculate the total sales.
    @Override
    public int GetTotalSales() {

        int total = 0;

        // Loop through all years and products.
        for (int year = 0; year < productSales.length; year++) {
            for (int product = 0; product < productSales[year].length; product++) {

                total += productSales[year][product];
            }
        }

        return total;
    }

    // Count the sales above 500.
    @Override
    public int GetSalesOverLimit() {

        int count = 0;

        for (int year = 0; year < productSales.length; year++) {
            for (int product = 0; product < productSales[year].length; product++) {

                if (productSales[year][product] > SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Count the sales below 500.
    @Override
    public int GetSalesUnderLimit() {

        int count = 0;

        for (int year = 0; year < productSales.length; year++) {
            for (int product = 0; product < productSales[year].length; product++) {

                if (productSales[year][product] < SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Return the number of years processed.
    @Override
    public int GetProductsProcessed() {

        return productSales.length;
    }

    // Calculate the average sales.
    @Override
    public double GetAverageSales() {

        int total = GetTotalSales();
        int count = 0;

        // Count all sales values.
        for (int year = 0; year < productSales.length; year++) {
            count += productSales[year].length;
        }

        return (double) total / count;
    }
   
    
}
