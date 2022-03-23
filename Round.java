import java.util.*;

public class Round {

	static int minTime(int n,int m,int k,int startX,int startY,int []x,int []y) {
		int count =0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
					for(int l=1;l<=k;l++) {
						if(x[l]>startX) {
							i++;
							count++;
						}
						if(x[l]<startX) {
							i--;
							count++;
						}
						if(y[l]>startY) {
							j++;
							count++;
						}
						if(y[l]<startY) {
							j--;
							count++;
						}
						
						
						if(i==x[l] && j==y[l]) {
							if(x[l]>startX) {
								i++;
								count++;
							}
							if(x[l]<startX) {
								i--;
								count++;
							}
							if(y[l]>startY) {
								j++;
								count++;
							}
							if(y[l]<startY) {
								j--;
								count++;
							}
							if(i==1 || j==1 || i==n || j==n ) {
								continue;
							}
						}
					}
			}
		}
		return count;
	}
	
	
	
	
	public static void main(String [] s) {
		int n,m,k,startX,startY;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("n");
			n = sc.nextInt();
			System.out.println("m ");
			m = sc.nextInt();
			int [] x=new int[n];
			int []y=new int[m];
			System.out.println("k ");
			k = sc.nextInt();
			System.out.println("startX ");
			startX = sc.nextInt();
			System.out.println("startY ");
			startY = sc.nextInt();

			for(int i=1;i<=k;i++) {
				x[i]=sc.nextInt();
			}
			for(int i=1;i<=k;i++) {
				y[i]=sc.nextInt();
			}
			int result;
			result = minTime(n,m,k,startX,startY,x,y);
			System.out.println(result);
		}
	}
}
