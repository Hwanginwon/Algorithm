import java.util.Scanner;

public class re_mergeSort {

	static void mergeSort(int tmp[], int arr[], int first, int last) {
		int mid = (first+last)/2;

		if(last>first) {
			mergeSort(tmp, arr, first, mid);
			mergeSort(tmp, arr, mid+1, last);
		}
		//int f=first;
		int m=mid;
		int m2=mid;
		int l=last;
		int ex =1;
		int t=first;
		for(int f= first; f<=m2;f++) {
			ex=1;
			while(ex==1) {
				if(m+1<=l) {
					if(arr[f]<arr[m+1]) {
						tmp[t]=arr[f];
						t++;
						ex=ex*-1;
					}else if(arr[f]>arr[m+1]) {
						tmp[t]=arr[m+1];
						t++;
						m++;
					}
				}
				if(m+1>l&&l>=f) {
					tmp[t]=arr[f];
					ex=ex*-1;
					t++;
					//m=l-1;

				}
			}
		}
		for(int i=0; i<l+1; i++) {
			arr[i]=tmp[i];
		}


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int last = sc.nextInt();
		//int total= sc.nextInt();

		int arr[] = new int[last];
		int tmp[]= new int[last];

		for(int i=0; i<last; i++) {
			arr[i]=sc.nextInt();
		}

		mergeSort(tmp,arr,first, last-1);

		for(int i=0 ; i<last; i++) {
			System.out.print(arr[i]+" ");
		}

		sc.close();
	}

}
