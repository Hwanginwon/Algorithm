import java.util.Scanner;

public class bj11729 {
	
	static void Hanoi() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][]=new int[N+1][3];
		int K=N;
		int start=1;
		int p=2;
		for(int i=1; i<N+1; i++) {
			arr[i][0]=K;
			K--;
		}
		
		//Hanoi(arr,N,start,p);//start=지그재그  p=ring point
		
		
		
		
		sc.close();

	}

}
