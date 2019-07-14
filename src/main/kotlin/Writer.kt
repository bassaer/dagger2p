import javax.inject.Inject

class Writer @Inject constructor() {
    fun write() {
        println("writing")
    }
}