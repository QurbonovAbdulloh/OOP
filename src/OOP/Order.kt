package OOP

//Order class
class Order (val orderId: Int, val productName: String, val quantity: Int) {

    // Class method for displaying order details
    fun displayOrderDetails() {
        println("Order ID: $orderId, Product: $productName, Quantity: $quantity")
    }
}

fun main() {

    //create object
    val order1 = Order(1, "Laptop", 2)
    val order2 = Order(2, "Phone", 4)
    val order3 = Order(3, "Headphone", 10)
    val order4 = Order(4, "Monitor", 3)
    val order5 = Order(5, "Keyboard", 3)

    //Display objects information
    order1.displayOrderDetails()
    order2.displayOrderDetails()
    order3.displayOrderDetails()
    order4.displayOrderDetails()
    order5.displayOrderDetails()
}