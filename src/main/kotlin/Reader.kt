import javax.inject.Inject

class Reader @Inject constructor() {
    fun read() {
        println("reading")
    }
}