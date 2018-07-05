import java.util.Scanner;

public class primMst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int start= sc.nextInt();
		int st=start-1;
		
		int D[][]=new int[4][e];
		int dist[]=new int[v];
		for(int i=0;i<v;i++) {
			dist[i]=(1/0);
		}
		
		for(int i=0; i<e; i++) {
			int i1=sc.nextInt();
			int i2=sc.nextInt();
			int i3=sc.nextInt();
			D[0][i]=i1;
			D[1][i]=i2;
			D[2][i]=i3;
			D[3][i]=0;
		}
		
		dist[st]=0;
		D[3][st]=1;
		for(int k=0;k<e;k++) {
			if(D[0][k]==st) {
				if(dist[D[1][k]-1]>D[2][k]) {
					dist[D[1][k]-1]=D[2][k];
				}
				//D[2][k]=1;
			}/*else if(D[1][k]==st) {
				if(dist[D[0][k]-1]>D[2][k]) {
					dist[D[0][k]-1]=D[2][k];
				}
				//D[2][k]=1;
			}*/
		}
		int tmp=0;
		for(int i = 0 ; i<v; i++) {
			if(dist[i]!=(1/0)) {
				
				tmp=i;
			}
		}
		
		
		
		
		sc.close();

	}

}
