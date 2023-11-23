import java.util.*;

class minimizesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++)
            numbers.add(sc.nextInt());
        
        while (k > 0) {
            int maxIndex = 0;
            int max = numbers.get(0);
            
            // Finding the maximum element's index
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) > max) {
                    max = numbers.get(i);
                    maxIndex = i;
                }
            }
            
            // Update the maximum element and decrement k
            numbers.set(maxIndex, max / 2);
            k--;
        }
        
        int sum = 0;
        for (int num : numbers)
            sum += num;
        
        System.out.println(sum);
    }
}
