import java.util.Scanner;

public class seatarrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String seats = scanner.next();
        int[] result = minMovesTogether(seats);
        System.out.println(result[0] + " " + result[1]);
    }
    
    public static int[] minMovesTogether(String seats) {
        int occupied = 0;
        for (char seat : seats.toCharArray()) {
            if (seat == 'O') {
                occupied++;
            }
        }
        
        if (occupied == 0 || occupied == seats.length()) {
            return new int[]{0, 0};
        }
        
        int[] emptyCounts = new int[seats.length()];
        int currentAvailable = 0;
        int index = 0;
        for (char seat : seats.toCharArray()) {
            if (seat == 'E') {
                currentAvailable++;
            } else {
                if (currentAvailable > 0) {
                    emptyCounts[index++] = currentAvailable;
                }
                currentAvailable = 0;
            }
        }
        
        int minEmptySeats = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            minEmptySeats = Math.min(minEmptySeats, emptyCounts[i]);
        }
        
        int minMoves = minEmptySeats - 1;
        int ways = 0;
        for (int i = 0; i < index; i++) {
            if (emptyCounts[i] == minEmptySeats) {
                ways++;
            }
        }
        
        return new int[]{minMoves * occupied+1, ways};
    }
}
