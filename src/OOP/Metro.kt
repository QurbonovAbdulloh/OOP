package OOP

data class Metro(val start: String, val end: String, val time: Int, val lineNumber: Int) {


    fun isLessTimeOnline(maxTimes: Int): Boolean {
        return time <= maxTimes
    }
}

fun main() {

    val metros = arrayOf(
        Metro("A station", "B station", 30, 1),
        Metro("C station", "D station", 35, 2),
        Metro("E station", "F station", 40, 3),
        Metro("G station", "H station", 45, 4),
        Metro("I station", "J station", 50, 5)
    )

    val maxTimes = 40

    for (metro in metros) {
        if (metro.isLessTimeOnline(maxTimes)) {
            println(metro)
        }
    }

}