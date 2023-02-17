fun main() {

    val line = inputLine();
    val sentence = Sentence(line);
    println(sentence.changeEquidistantWordsInLine())
}

fun inputLine (): String {
    println("Enter a line:")
    return readLine().toString().trim();
};
