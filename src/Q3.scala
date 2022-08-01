

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
    println(formatNames("Niroshan")(toLower(_)));
    println(formatNames("Saman")(toLower(_)));
    println(formatNames("Kumara")(toUpper(_)));

  }

}