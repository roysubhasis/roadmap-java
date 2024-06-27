package practise.interview;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class GoArrayDirection {
    public static void main(String[] args) {
        int[] coordinates = solve("U", 4, 5, 100, 100);
        for (int i = 0; i < 2; i++) {
            System.out.println(coordinates[i]);
        }
    }

    public static int[] solve(String direction, int x, int y, int width, int height) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        return Direction.getPosition(direction, x, y);
    }

    private enum Direction implements UnaryOperator<int[]> {
        U(cord -> new int[] {cord[0] - 1, cord[1]}),
        UR(cord -> new int[] {cord[0] - 1, cord[1] + 1}),
        R(cord -> new int[] {cord[0], cord[1] + 1}),
        DR(cord -> new int[] {cord[0] + 1, cord[1] + 1}),
        D(cord -> new int[] {cord[0] + 1, cord[1]}),
        DL(cord -> new int[] {cord[0] + 1, cord[1] - 1}),
        L(cord -> new int[] {cord[0], cord[1] - 1}),
        UL(cord -> new int[] {cord[0] - 1, cord[1] - 1});

        Direction(UnaryOperator<int[]> pos) {
            this.movement = pos;
        }

        private final UnaryOperator<int[]> movement;

        public static int[] getPosition(String direction, int x, int y) {
            return Arrays.stream(values())
                    .filter(dir -> dir.name().equalsIgnoreCase(direction))
                    .findFirst()
                    .get()
                    .apply(new int[] {x, y});
        }

        @Override
        public int[] apply(int[] pos) {
            return movement.apply(pos);
        }
    }


}
