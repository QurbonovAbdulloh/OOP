package OOP

class Worker (val surname: String = "", val name: String = "", val age: Int = 0, val place: String = "", val workYear: Int) {
    fun filterOlderAgeWorkers(workers: List<Worker>, givenAge: Int) {
        println("Yoshi $givenAge dan katta bo'lgan ishchilar:")
        workers.filter { it.age > givenAge }.forEach {
            println("${it.surname}, ${it.name}, ${it.age}, ${it.place}, ${it.workYear}")
        }
    }
}

fun main() {

    val worker1 = Worker("Abdullayev", "Aziz", 30, "Dasturchi", 2015)
    val worker2 = Worker("Karimov", "Jasur", 40, "Menejer", 2010)
    val worker3 = Worker("Aliyev", "Shoxrux", 28, "Muhandis", 2018)

    val workers = listOf(worker1, worker2, worker3)

    worker1.filterOlderAgeWorkers(workers, 29)
}