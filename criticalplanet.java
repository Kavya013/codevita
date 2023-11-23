import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class criticalplanet{
    static int v, t;
    static int[] Parent, Visited, Disc, Low, Ans;

    static void addEdges(int a, int b, List<Integer>[] Adj) {
        Adj[a].add(b);
        Adj[b].add(a);
    }

    static void bridge(int i, List<Integer>[] Adj) {
        Visited[i] = 1;
        Disc[i] = Low[i] = ++t;
        for (int j = 0; j < Adj[i].size(); j++) {
            int child = Adj[i].get(j);
            if (Visited[child] == 0) {
                Parent[child] = i;
                bridge(child, Adj);
                Low[i] = Math.min(Low[i], Low[child]);
                if (Low[child] > Disc[i]) {
                    Ans[i] = 1;
                    Ans[child] = 1;
                }
            } else if (child != Parent[i]) {
                Low[i] = Math.min(Low[i], Disc[child]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int e = scanner.nextInt();
        v = scanner.nextInt();

        int a, b;
        List<Integer>[] Adj = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            Adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            addEdges(a, b, Adj);
        }

        Ans = new int[v];
        Parent = new int[v];
        Visited = new int[v];
        for (int i = 0; i < v; i++) {
            Parent[i] = -1;
            Visited[i] = 0;
            Ans[i] = 0;
        }
        Disc = new int[v];
        Low = new int[v];

        for (int i = 0; i < v; i++) {
            if (Visited[i] == 0) {
                bridge(i, Adj);
            }
        }

        for (int i = 0; i < v; i++) {
            if (Ans[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
