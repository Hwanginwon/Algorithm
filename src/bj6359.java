import java.util.Scanner;

public class bj6359 {

	static int sd(int N) {
		int arr[]=new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=1;//close-->1 open -->0
		}
		int count=0;
		int test =1;
		int p=1;
		while(p<=N) {
			for(int i=test; i<=N; i++) {
				if(i%test==0) {
					arr[i-1]=(arr[i-1]+1)%2;
				}
			}
			test++;
			p++;
		}

		for(int i=0; i<N; i++) {
			if(arr[i]==0) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int arrS[]=new int[T];

		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			arrS[i]= sd(N);
		}
		for(int i=0; i<T; i++) {
			System.out.println(arrS[i]);
		}
		sc.close();
	}

}
