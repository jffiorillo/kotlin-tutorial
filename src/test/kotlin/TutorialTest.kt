import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class TutorialTest {

    @Test
    fun `1 plus 1 equals 2`() {
        assertEquals(2, 1 + 1)
    }

    @Test
    fun `list are equals`() {
        val listOfNumbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val rangeOfNumbers = 1..9

        assertNotEquals(rangeOfNumbers,listOfNumbers)
        assertEquals(rangeOfNumbers.toList(),listOfNumbers)
    }

    @Test
    internal fun `map are equals`() {
        val immutableMap = mapOf(1 to "one", 2 to "two", 3 to "three")

        val mutableMap = mutableMapOf<Int, String>().apply {
            this[1] = "one"
            this[2] = "two"
            this[3] = "three"
        }

        assertEquals(mutableMap,immutableMap)
        @Suppress("ReplaceGetOrSet")
        assertEquals(immutableMap[2],mutableMap.get(2))
    }
}