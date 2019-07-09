import javax.inject.Inject

class Logger @Inject constructor() {

    @Inject lateinit var reader: Reader
    @Inject lateinit var writer: Writer

    fun generate() {
        reader.read()
        writer.write()
        println("Done")
    }
}