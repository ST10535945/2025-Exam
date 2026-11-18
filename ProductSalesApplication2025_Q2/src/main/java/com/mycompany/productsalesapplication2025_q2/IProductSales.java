/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productsalesapplication2025_q2;

/**
 *
 * @author Mazibuko
 */
public interface IProductSales {
    // Interface containing the required product sales method 
    
 // Return the product sales data.
    int[][] GetProductSales();

    // Calculate the total sales.
    int GetTotalSales();

    // Calculate the number of sales over the limit.
    int GetSalesOverLimit();

    // Calculate the number of sales under the limit.
    int GetSalesUnderLimit();

    // Return the number of years processed.
    int GetProductsProcessed();

    // Calculate the average sales.
    double GetAverageSales();
}
