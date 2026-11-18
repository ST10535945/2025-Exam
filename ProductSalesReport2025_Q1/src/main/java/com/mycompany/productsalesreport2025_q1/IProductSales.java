/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productsalesreport2025_q1;

/**
 *
 * @author Mazibuko
 */
public interface IProductSales {
    //Q.1.2)2025 Exam 
    
    // Method to calculate total sales.
    int TotalSales(int[][] productSales);

    // Method to calculate average sales.
    double AverageSales(int[][] productSales);

    // Method to calculate maximum sales.
    int MaxSale(int[][] productSales);

    // Method to calculate minimum sales.
    int MinSale(int[][] productSales);
}
