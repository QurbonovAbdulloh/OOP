fun main() {

    val user = User()
    val address = Address()
    val geo = Geo()
    val connection = Connection()
    val company = Company()

    println("""ID: ${user.id}
        |Name: ${user.name}
        |Username: ${user.username}
        |Email: ${user.email}
        |Street: ${address.street}
        |Suite: ${address.suite}
        |City: ${address.city}
        |Zipcode: ${address.zipcode}
        |Lat: ${geo.lat}
        |Lng: ${geo.lng}
        |Phone: ${connection.phone}
        |Website: ${connection.website}
    """.trimMargin())
}

class User(
    val id: Int = 1,
    val name: String = "Leane Graham",
    val username: String = "Bret",
    val email: String = "Sincere@april.biz",
)

class Address(
    val street: String = "Kulas Light",
    val suite: String = "Apt. 556",
    val city: String = "Gwenborough",
    val zipcode: String = "92998-3874"
)

class Geo(
    val lat: Double = -37.3159,
    val lng: Double = 81.1496
)

class Connection(
    val phone: String = "1-770-736-8021 x56442",
    val website: String = "hildegard.org"
)

class Company(
    val name: String = "Romaguera-Crona",
    val catchPhrase: String = "Multi-layered client-server neural-net",
    val bs: String = "harness real-time e-markets"
)