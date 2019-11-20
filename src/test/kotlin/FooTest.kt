import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

internal class FooTest {

    @Mock
    private lateinit var dataSource: DataSource

    private lateinit var repository: FooRepository

    @BeforeEach
    internal fun setUp() {
        MockitoAnnotations.initMocks(this)
        repository = FooRepository(dataSource)
    }

    @Test
    internal fun `should fetch by id when if is valid`() {
        val mockedModel = FooModel("id", 23)
        whenever(dataSource.getById(any())).thenReturn(mockedModel)

        val fooModel = repository.fetchById("id")

        assertEquals(mockedModel, fooModel)
        verify(dataSource).getById("id")
    }
}