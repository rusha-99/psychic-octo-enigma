

object Q3 {

  def toUpper(s: String): String = {
    s.toUpperCase();
  }

  def toLower(s: String): String = {
    s.toLowerCase();
  }

  def formatNames(name: String)(function: String => String): String = {
    function(name);
  }

  def main(args: Array[String]) {

    println(formatNames("Benny")(toUpper(_)));
    println("N"+formatNames("i")(toUpper(_)) + "roshan");
    println(formatNames("Saman")(toLower(_)));
    println("Kumar"+formatNames("a")(toUpper(_)));

  }

}