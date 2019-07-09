class Logger {
    val reader = Reader()
    val writer = Writer()

    fun generate() {
        reader.read()
        writer.write()
        println("Done")
    }
}