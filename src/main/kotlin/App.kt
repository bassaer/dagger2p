class App {

    private lateinit var log: LogComponent

    fun start() {
        log = DaggerLogComponent.create()
        log.build().generate()
    }
}

