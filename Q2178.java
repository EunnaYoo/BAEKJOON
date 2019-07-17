import java.util.*;

public class Q2178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		int maze[][] = new int[n][m];
		for(int i = 0; i < n; i++){
			String str = sc.next();
			char[] chars = str.toCharArray();
			for(int j = 0; j < m; j++) {
				maze[i][j] = chars[j] - '0';
			}
		}
		
		bfs(maze, n, m);
	}
	
	static void bfs(int maze[][], int n, int m){
		boolean visit[][] = new boolean[n][m];
		int distance[][] = new int[n][m];
		
		Queue<Pair> qu = new LinkedList<>();
		int x[] = {0, -1, 0, 1};
		int y[] = {1, 0, -1, 0};
		
		qu.add(new Pair(0, 0));
		distance[0][0] = 1;
		
		while(!qu.isEmpty()) {
			Pair point = qu.poll();
			int pointx = point.getx();
			int pointy = point.gety();
			
			if(pointx == n-1 && pointy == m-1) {
				break;
			}
			for(int i=0; i < 4; i++) {
				int tovisitx = pointx + x[i];
				int tovisity = pointy + y[i];
				if(tovisitx >= 0 && tovisitx < n && tovisity >= 0 && tovisity < m) {
					visit[tovisitx][tovisity] = true;
					qu.add(new Pair(tovisitx, tovisity));
					distance[tovisitx][tovisity] = distance[pointx][pointy] + 1;
				}
			}
		}
		System.out.println(distance[n-1][m-1]);
	}
	
	
	static class Pair{
		private int x;
		private int y;
		
		Pair(int x, int y){
			
			this.x = x;
			this.y = y;
			
		}
		
		int getx() {
			return this.x;
		}
		int gety() {
			return this.y;
		}

	}


}

