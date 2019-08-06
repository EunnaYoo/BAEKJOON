import java.util.*;

public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
         
        int[] counts = new int[10];
        String input = String.valueOf(A * B * C);
        for (int i = 0; i < input.length(); i++) {        	
            counts[input.charAt(i) - '0']++;
        }
         
        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
	}

}
