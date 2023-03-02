package Line;

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LineTest {
    private val testLine = Line("My favorite programming language is JavaScript");


    @Test
    fun testChangeEquidistantWordsInLine() {
        val expected = "JavaScript is language programming favorite My";
        assertEquals(expected, testLine.changeEquidistantWordsInLine());
    }
}