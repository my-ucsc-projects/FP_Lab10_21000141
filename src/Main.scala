import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
    //    question01
    var input = readLine("Enter the number of temperatures in list :").split(",").toList
    println(input)
    var test = input.map(inpt => (((inpt.toInt*9.0)/5.0)+32)).reduce(_ + _)

    println(test/input.length)

//    question02

//    def calculateLetters(values: List[String]): Int = {
//
//      val WordLen = values.map(word => word.length)
//      WordLen.reduce(_ + _)
//
//    }
//
//     val values = List("apple", "banana", "cherry", "date")
//     println("Total count of letter occurrences: " + calculateLetters(values))
  }
}