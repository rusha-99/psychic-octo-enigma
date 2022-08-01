

object Q2 {

  def function(num: Int): String = {
    num match {
      case x if x > 0 && x % 2 == 0 => "Even number is given.";
      case x if x % 2 == 1          => "Odd number is given.";
      case x if x == 0 || x < 0     => "Negative number or Zero  is given.";

    }
  }

  def main(args: Array[String]) {

    print("Enter a number: ");
    var number = scala.io.StdIn.readInt();
    println(function(number));

  }
}