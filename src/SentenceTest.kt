import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SentenceTest {
    private val testSentence = Sentence("My favorite programming language is JavaScript");


    @Test
    fun testChangeEquidistantWordsInLine() {
        val expected = "JavaScript is language programming favorite My";
        assertEquals(expected, testSentence.changeEquidistantWordsInLine());
    }
}