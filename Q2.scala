package Demo10

object Q2  {

  def main(args:Array[String]):Unit={
    val input = List("apple","banana", "cherry", "date")
    countLetterOccurrence(input)
  }

  def countLetterOccurrence(wordList:List[String]):Unit={
    val wordLength = wordList.map(word=>word.length)
    val totalCount = wordLength.reduce((x,y)=>x+y)
    println(s"Total count of letter occurrences: $totalCount")

  }
}
