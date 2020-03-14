import com.knoldus.SubString

object AppDriver {
  def main(args: Array[String]): Unit = {
    val obj = new SubString()
    print("Input string to be checked    ")
    val input = scala.io.StdIn.readLine()
    print(obj.vowel(input))
  }
}
