import scala.annotation.tailrec

def factorial(n: Int): Int = {
  @tailrec
  def loop(n: Int, acc: Int): Int =
    if (n <= 0) acc
    else loop(n-1, n *acc)

  loop(n, 1)
}

factorial(13)
factorial(5)

/*
def curry[A, B, C](f: (A, B) => C): A => (B => C)

  //(a, A) => ???
  (a: A, b: B) => f(a, b)
 */