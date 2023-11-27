class CleanCode(private val worker: Worker): Book() {

    override fun nextBook() {
        worker.currentBook = English(worker)
    }

    override fun toString(): String {
        return "Clean Code"
    }
}

class English(private val worker: Worker): Book() {

    override fun nextBook() {
        worker.currentBook = German(worker)
    }

    override fun toString(): String {
        return "English"
    }
}

class German(private val worker: Worker): Book() {

    override fun nextBook() {
        worker.currentBook = DataStructure(worker)
    }

    override fun toString(): String {
        return "German"
    }
}

class DataStructure(private val worker: Worker): Book() {

    override fun nextBook() {
        worker.currentBook = CleanCode(worker)
    }

    override fun toString(): String {
        return "Data Structure"
    }
}