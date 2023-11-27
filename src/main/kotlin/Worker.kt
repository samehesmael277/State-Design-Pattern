class Worker {
    var currentBook: Book = CleanCode(this)

    fun getNextBook() {
        currentBook.nextBook()
        println("getting $currentBook")
    }
}