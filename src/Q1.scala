

object Q1 {
  def interest(amount: Int): Double = {
    if (amount > 0 && amount <= 20000) {
      amount * 0.02;
    } else if (amount > 20000 && amount <= 200000) {
      amount * 0.04;
    } else if (amount > 200000 && amount <= 2000000) {
      amount * 0.35;
    } else {
      amount * 0.65;
    }
  }

  def main(args: Array[String]) {
    println(interest(15000));
    println(interest(150000));
    println(interest(1500000));
    println(interest(15000000));
  }
}