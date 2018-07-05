import java.util.Scanner;

public class re_quickSort {
	
	static void quick(int arr[], int first, int last) {
		int pivot = (first+last)/2;
		int s = first;
		int f = last;
		int tmp[]=new int[1];
		
		tmp[0] = arr[s];
		arr[s] = arr[pivot];
		arr[pivot]=tmp[0];
		
		s++;
		
		
		if(f>s) {
			int x=1;
			int y=1;
			while(x==1) {
			if(arr[0]>=arr[s]&&f>s) {
				s++;
			}else {
			x*=-1;
			}
			}
			while(y==1) {
			if(arr[0]<arr[f]&&f>s) {
				f--;
			}else {
				y*=-1;
			}
			
			}
			
			if(f>s&&arr[s]>arr[0]&&arr[f]<arr[0]) {
				tmp[0]=arr[f];
				arr[f]=arr[s];
				arr[s]=arr[0];
			}
			
			
		}
		
		if(f==s) {
			if(arr[s]<arr[0]&&f<last) {
				f++;
			}
			if(arr[f]>arr[0]&&s>first) {
				s--;
			}
		}
		
		tmp[0]=arr[s];
		arr[s]=arr[0];
		arr[0]=tmp[0];
		
		

		
		
		
		quick(arr,first,s-1);
		quick(arr,s+1,last);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int first = 0;
		int last = total-1;
		int arr[]=new int[total];
		
		for(int i=0;i<total; i++) {
			arr[i]=sc.nextInt();
		}
		
		quick(arr, first, last);
		
		for(int i=0; i<total; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
