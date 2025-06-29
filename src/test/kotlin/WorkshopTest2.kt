package org.example

import org.example.Product
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Workshop2Test {

    private val sampleProducts = listOf(
        Product("Laptop", 35000.0, "Electronics"),
        Product("Smartphone", 25000.0, "Electronics"),
        Product("T-shirt", 450.0, "Apparel"),
        Product("Monitor", 7500.0, "Electronics"),
        Product("Keyboard", 499.0, "Electronics"), // ❌ ต่ำกว่า 500
        Product("Jeans", 1200.0, "Apparel"),
        Product("Headphones", 1800.0, "Electronics")
    )

    @Test
    fun `test total price of electronics over 500`() {
        val expectedTotal = 35000.0 + 25000.0 + 7500.0 + 1800.0 // = 69300.0
        val actualTotal = calculateTotalElectronicsPriceOver500(sampleProducts)
        assertEquals(expectedTotal, actualTotal, 0.001, "รวมราคาควรเป็น 69300.0")
    }

    @Test
    fun `test count of electronics over 500`() {
        val expectedCount = 4 // จากสินค้า 7 ชิ้น มี 4 ชิ้นที่ตรงหมวดและราคา
        val actualCount = countElectronicsOver500(sampleProducts)
        assertEquals(expectedCount, actualCount, "ควรมีสินค้า 4 ชิ้นที่ตรงเงื่อนไข")
    }
}

