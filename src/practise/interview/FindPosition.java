package practise.interview;

public class FindPosition
{
  public static void main(String[] args) {
    int[] coordinates = solve("U", 1, 1, 3, 4);
    System.out.println(coordinates.length);
    for (int i = 0; i < coordinates.length; i++)
    {
        System.out.print(coordinates[i]);
    }
  }

  public static int[] solve(String direction, int x, int y, int width, int height) {
    int[] position;
    switch (direction) {
      case "U":
        position= new int[]{y - 1, x};
        return position;
      case "UR":
        position= new int[]{(y - 1),(x + 1)};
        return position;
      case "R":
        position= new int[]{(y),(x + 1)};
        return position;
      case "DR":
        return new int[]{(y+1),(x + 1)};
      case "D":
        return new int[]{(y+1),(x)};
      case "DL":
        return new int[]{(y+1),(x - 1)};
      case "L":
        return new int[]{(y),(x - 1)};
      case "UL":
        return new int[]{(y - 1),(x - 1)};
        // Default case statement*/
      default:
        System.out.println("default...");
        return new int[2];
    }
   }

  }
