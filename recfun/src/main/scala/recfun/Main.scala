package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else pascal(c -1 , r-1) + pascal(c, r -1)
  }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      @tailrec
      def loop(acc: Int, list: List[Char]): Int =
        if (list.isEmpty) acc
        else if (list.head == '(') loop(acc + 1, list.tail)
        else if (list.head == ')' && acc > 0) loop(acc - 1, list.tail)
        else if (list.head == ')' && acc <= 0) -1
        else loop(acc, list.tail)
      loop(0, chars) == 0
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
    if ((money < 0) || coins.isEmpty) 0
    else {
      if (money == 0) 1
      else {
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      }
    }
  }
}
