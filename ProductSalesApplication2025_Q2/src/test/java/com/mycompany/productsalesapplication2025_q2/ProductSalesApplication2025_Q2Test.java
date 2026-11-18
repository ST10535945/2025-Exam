/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productsalesapplication2025_q2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mazibuko
 */
public class ProductSalesApplication2025_Q2Test {
    
    // Test whether the correct number of sales over the limit is returned.
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {

        // Arrange: Create the ProductSales object.
        ProductSales sales = new ProductSales();

        // Act: Call the method.
        int actualResult = sales.GetSalesOverLimit();

        // Assert: There should be 2 sales over 500.
        assertEquals(2, actualResult);
    }

    // Test whether the correct number of sales under the limit is returned.
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {

        // Arrange: Create the ProductSales object.
        ProductSales sales = new ProductSales();

        // Act: Call the method.
        int actualResult = sales.GetSalesUnderLimit();

        // Assert: There should be 4 sales under 500.
        assertEquals(4, actualResult);
    }
}
