import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FooWithMockkTest {
    private val dataSource = mockk<DataSource>()

    private val repository = FooRepository(dataSource)

    @Test
    fun `should fetch by id when if is valid`() {
        val mockedModel = FooModel("id", 23)
        every { dataSource.getById(any()) } returns (mockedModel)

        val fooModel = repository.fetchById("id")

        assertEquals(mockedModel, fooModel)
        verify {
            dataSource.getById("id")
        }
    }
}
