import java.util.*;

public class Q10817 {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		int tmp = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 3; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i < 3; i++){
			for(int j=1; j < 3; j++) {
				if(a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
							
				}
			}
		}
		System.out.println(a[1]);
	}

}
