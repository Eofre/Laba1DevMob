class Sentence (val line: String = "Hello world!") {

    private fun reverse(list: List<String>): MutableList<String>  {
        val result: MutableList<String> = mutableListOf();
        for (index in list.lastIndex downTo 0) {
            result.add(list[index]);
        }

        return result;
    }

    fun changeEquidistantWordsInLine(): String  = reverse(line.split(" ")).joinToString(" ");
}