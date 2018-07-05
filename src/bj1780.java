import java.util.Scanner;

public class bj1780 {
	static int ai=0;
	static int bi=0;
	static int ci=0;

	static void div(int sq[][],int N,int a, int b) {
		int check =0;
		for(int i=0;i<N; i++) {
			for(int j=0;j<N; j++) {
				if(sq[a][b]!=sq[a+i][b+j]&&check==0&&N>1) {
					for(int k=0;k<3;k++) {
						for(int h=0; h<3; h++) {
						int p=N/3;
						int aa=a+p*k;
						int bb=b+p*h;
						div(sq,p,aa,bb);
						check++;
						}
					}
				}
			}
		}
				if(check==0) {
				if(sq[a][b]==-1) {
					ai++;
				}else if(sq[a][b]==0) {
					bi++;
				}else if(sq[a][b]==1) {
					ci++;
				}
			
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int arr[]=new int[3];//-1,0,1
		int a = 0;
		int b = 0;

		int sq[][]=new int[N][N];
		for(int i =0; i<N; i++) {
			for(int k=0; k<N;k++) {
				sq[i][k]=sc.nextInt();
			}
		}
		
		div(sq,N,a,b);

		System.out.println(ai);
		System.out.println(bi);
		System.out.println(ci);



		sc.close();
		/*
9
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
0 1 -1 0 1 -1 0 1 -1
0 -1 1 0 1 -1 0 1 -1
0 1 -1 1 0 -1 0 1 -1
*/
	}

}
