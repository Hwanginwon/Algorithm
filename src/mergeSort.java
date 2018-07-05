import java.util.Scanner;

public class mergeSort {

	static void MS(int bae[], int start, int end){
		int j=(start+end)/2; //middle number
		if(end>start) {
			int left[]=new int[j+1];
			int right[]=new int[end-j];
			for(int p=0; p<j+1; p++) {
				left[p]=bae[p];
			}
			for(int p=0; p<end-j; p++) {
				right[p]=bae[j+p];
			}
			if(left.length!=1) {
				MS(left,start,j);
			}
			if(right.length!=1) {
				MS(right,j+1,end);
			}
			int a=0;
			int b=0;
			while(a+b<end) {
				if(a<j+1 && b<end-j) {
					if(left[a]>right[b]) {
						bae[a+b]=right[b];
						b++;
					}
					else {
						bae[a+b]=left[a];
						a++;
					}

				}
				else if(a>=j+1 && b<end-j) {
					bae[a+b]=right[b];
					b++;
				}
				else if(b>=end-j && a<j+1) {
					bae[a+b]=left[a];
					a++;
				}else if (b>=end-j && a>=j+1) {
					break;
				}

			}
		}
		for(int z=0; z< end+1; z++) {
			System.out.println(bae[start]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//배열 입력
		int ba = sc.nextInt();
		int bae[]= new int[ba];
		for(int i = 0 ; i<ba; i++) {
			int k= sc.nextInt();
			bae[i]=k;
		}

		MS(bae,0,ba-1);



		sc.close();
	}

}
