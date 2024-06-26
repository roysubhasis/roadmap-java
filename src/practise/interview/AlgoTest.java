package practise.interview;

public class AlgoTest {
  public static void main(String[] args) {
    //
    new AlgoTest().findSum(5);
    new AlgoTest().getSum(5);
  }

  public void findSum(int n) {
    System.out.println("Sum of 1 to " + n + " prime number : " + (n * (n + 1) / 2));
  }

  public void getSum(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println("brute force -->" + sum);
  }
}
