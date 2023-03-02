import Line.Line

fun main() {

    val line = readStringFromConsole();
    val sentence = Line(line);
    println(sentence.changeEquidistantWordsInLine())
}

    fun readStringFromConsole(): String {
        print("Enter line: ")
        val input = readLine()
        if (input.isNullOrEmpty()) {
            println("Please repeat it again")
            return readStringFromConsole()
        }
        return input.trim();
    }

