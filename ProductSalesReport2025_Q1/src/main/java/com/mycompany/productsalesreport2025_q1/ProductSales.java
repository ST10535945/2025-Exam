/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport2025_q1;

/**
 *
 * @author Mazibuko
 */
public class ProductSales implements IProductSales{

    @Override
    public int TotalSales(int[][] productSales) {
     
        int total = 0;

        // Loop through all rows and columns.
        for (int i = 0; i < productSales.length; i++) {

            for (int j = 0; j < productSales[i].length; j++) {

                total += productSales[i][j];
            }
        }

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
     int total = TotalSales(productSales);

        int count = 0;

        // Count the number of sales values.
        for (int i = 0; i < productSales.length; i++) {

            count += productSales[i].length;
        }

        // Return the average.
        return (double) total / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {

        int maximum = productSales[0][0];

        // Loop through all sales values.
        for (int i = 0; i < productSales.length; i++) {

            for (int j = 0; j < productSales[i].length; j++) {

                if (productSales[i][j] > maximum) {

                    maximum = productSales[i][j];
                }
            }
        }

        return maximum;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int minimum = productSales[0][0];

        // Loop through all sales values.
        for (int i = 0; i < productSales.length; i++) {

            for (int j = 0; j < productSales[i].length; j++) {

                if (productSales[i][j] < minimum) {

                    minimum = productSales[i][j];
                }
            }
        }

        return minimum;
    }
    
}
