package OOP

class Price(val productName: String, val storeName: String, val price: Double)

fun main() {

    val product1 = Price("Phone", "TechShop", 100.0)
    val product2 = Price("Laptop", "HP store", 500.0)
    val product3 = Price("Monitor", "CompShop", 150.0)
    val product4 = Price("Headphone", "GadgetHub", 50.0)
    val product5 = Price("Keyboard", "CompShop", 70.0)


    val products = listOf(product1, product2, product3, product4, product5)

    val mostExpensiveProduct = products.maxByOrNull { it.price }

    if (mostExpensiveProduct != null) {
        println("""The most expensive product:
            |Product name: ${mostExpensiveProduct.productName}
            |Store name: ${mostExpensiveProduct.storeName}
            |Price: ${mostExpensiveProduct.price}$
        """.trimMargin())
    }
}