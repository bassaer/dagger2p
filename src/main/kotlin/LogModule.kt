import dagger.Module
import dagger.Provides

@Module
class LogModule {
    @Provides
    fun provideReader(): Reader {
        return Reader()
    }

    @Provides
    fun provideWriter(): Writer {
        return Writer()
    }
}