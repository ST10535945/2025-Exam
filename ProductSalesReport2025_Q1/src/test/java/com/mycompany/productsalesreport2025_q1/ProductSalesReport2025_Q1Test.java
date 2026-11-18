/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productsalesreport2025_q1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mazibuko
 */
public class ProductSalesReport2025_Q1Test {
    
    // Test whether the TotalSales method returns the correct total.
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        // Arrange: Create the sales data.
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create an object of the ProductSales class.
        ProductSales sales = new ProductSales();

        // Act: Call the TotalSales method.
        int actualTotal = sales.TotalSales(productSales);

        // Assert: Check whether the returned total is correct.
        assertEquals(2200, actualTotal);
    }

    // Test whether the AverageSales method returns the correct average.
    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        // Arrange: Create the sales data.
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create an object of the ProductSales class.
        ProductSales sales = new ProductSales();

        // Act: Call the AverageSales method.
        double actualAverage = sales.AverageSales(productSales);

        // Assert: Check whether the returned average is correct.
        assertEquals(366.6667, actualAverage, 0.01);
    }
}
