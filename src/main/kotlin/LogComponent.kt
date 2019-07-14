import dagger.Component

@Component
interface LogComponent {
    fun build(): Logger
}