package practise.interview;

public class MakePattern {
  public static void main(String[] args) {
      int n=4;
      int m=5;
      System.out.println("First one --> \n");
      MakePattern.makeSquare(n,m);
      System.out.println("\nSecond one --> \n");
      MakePattern.makeMiddleEmptySquare(n,m);
      System.out.println("\nThird one --> \n");
      MakePattern.makeHalfPyramid(n,m);
      System.out.println("\nForth one --> \n");
      MakePattern.makeHalfPyramidReverse(n,m);
  }

  /*
  *  Make pattern 4*5 matrix  *
  * */
  private static void makeSquare(int n, int m){
      for (int row = 1; row<=n; row++){
          for (int col=1; col<=m; col++){
              System.out.print("*");
          }
          System.out.println();
      }
  }

    /*
     *  Make pattern 4*5 matrix
     *  *****
     *  *   *
     *  *   *
     *  *****
     *
     * */
    private static void makeMiddleEmptySquare(int n, int m){
        for (int row = 1; row<=n; row++){
            for (int col=1; col<=m; col++){
                //cell ->(row,col)
                if(row==1 || col ==1 || row==n || col==5){
                  System.out.print("*");
                }else{
                  System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
     *  Make pattern Half Pyramid
     *  *
     *  **
     *  ***
     *  ****
     * */

    private static void makeHalfPyramid(int n, int m){
        for (int row = 1; row <= n; row++) {
          for (int col = 1; col <= row; col++) {
              System.out.print("*");
          }
          System.out.println();
        }
    }


    /*
     *  Make pattern Half Pyramid Reverse
     *  ****
     *  ***
     *  **
     *  *
     * */

    private static void makeHalfPyramidReverse(int n, int m){
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

