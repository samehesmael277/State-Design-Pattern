fun main(args: Array<String>) {
    val worker = Worker()

    println(worker.currentBook)

    worker.getNextBook()
    worker.getNextBook()
    worker.getNextBook()
    worker.getNextBook()
    worker.getNextBook()
}