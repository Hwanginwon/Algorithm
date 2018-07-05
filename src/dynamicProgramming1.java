import java.util.Scanner;

public class dynamicProgramming1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int com[][]=new int[N][M+1];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M+1;j++) {
				com[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M+1;j++) {
				System.out.print(com[i][j]);
			}
			System.out.println();
		}
		
		int check[]=new int[M];
		int excheck[]=new int[M];
		for(int i=0; i<M; i++) {
			check[i]=0;
			excheck[i]=0;
		}
		
		int dp[][]=new int[N+1][M];
		for(int i=0;i<M;i++) {
			dp[0][i]=0;
			dp[1][i]=com[i][0];
		}
		
		
		
		
		
		
		///////////
		
		/*for(int j=2;j<N+1;j++) {
			int MAX=dp[j][0];
		
		for(int i=1; i<M;i++) {
			if(dp[j][i]>MAX) {
				MAX=dp[j][i];
				for(int k=0; k<M; k++) {
					check[i]=0;
				}
				check[i]=j;
			}
		}
		int max2=0;
		for(int i=0;i<M;i++) {
			//j-1
			for(int i2=i;i2<M;i2++) {
				if()
			}
		}
		
		
		
		
		
		}
		
		
		
		
		
		for(int i=0;i<N;i++) {
			dp[1][i]=com[i][0];
		}*/
		
		
		
		
		
		
		sc.close();
	}

}
