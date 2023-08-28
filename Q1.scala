package Demo10

object Q1 {

  def main(args: Array[String]):Unit={
    val input = Array(0,10,20,30,40)
    val average = calculateAverage(input,5)


  }

  def calculateAverage(arrC: Array[Int],n: Int): Unit={
    val convertToF: Array[Double] = arrC.map(x => ((x * 9 / 5) + 32))
    val sum = convertToF.reduce((x,y)=>x+y)
    val avg = sum/n
    println(s"The average temperature in Fahrenheit is: $avg F")

  }

}
