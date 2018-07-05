import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class selection3 {
	
	public static void SL(int select[], int left, int right, int k){
		int first = left;
		int end = right;
		int mid = (left+right)/2;
		int pivot=select[mid];
		/*if(select[left]<=select[right]) {
			if(select[left]<=select[mid]) {
				pivot = select[mid];
			}else if(select[left]>select[mid]) {
				pivot = select[left];
				mid=left;
			}
		}else if(select[right]<select[left]) {
			if(select[right]>=select[mid]) {
				pivot=select[right];
				mid=right;
			}else if(select[mid]>select[right]) {
				pivot=select[mid];
			}
		}*/
		
		if(right>left) {
			
			/*for(int l =0; l<end; l++ ) {
				System.out.print(select[l]+" b ");
				}System.out.println();*/
			
			select[mid]=select[first];
			select[first]=pivot;
			left++;
			while(left<right) {
				while(select[left]<pivot) {
					if((right-1)==left) {
						break;
					}else if((right-1)>left) {
						left++;
					}
				}
				while(select[right]>pivot) {
					if((right-1)==left) {
						break;
					}else if((right-1)>left) {
						right--;
					}
				}
				
				if(select[left]>pivot && select[right]<pivot) {
					int tmp = select[left];
					select[left]=select[right];
					select[right]=tmp;
				}else if(select[left]==pivot&&select[right]==pivot) {
					right--;
				}else if(select[left]==pivot&&select[right]!=pivot) {
					if(select[right]<select[left]) {
						int tmp = select[left];
						select[left]=select[right];
						select[right]=tmp;
						left++;
						right--;
					}
				}else if(select[left]!=pivot&&select[right]==pivot) {
					if(select[right]<select[left]) {
						int tmp = select[left];
						select[left]=select[right];
						select[right]=tmp;
						left++;
						right--;
					}
				}
			}
			
			/*for(int l =0; l<end; l++ ) {
				System.out.print(select[l]+" c ");
				}System.out.println();*/
			
			if(pivot<=select[left]) {
				select[first]=select[left-1];
				select[left-1]=pivot;
				left--;
			}else if(pivot>select[right]) {
				select[first]=select[right];
				select[right]=pivot;
				left++;
			}else if(pivot<=select[right]&&pivot>select[left]) {
				select[first]=select[left];
				select[left]=pivot;
			}
			
			/*for(int l =0; l<end; l++ ) {
				System.out.print(select[l]+" d ");
				}System.out.println();*/
			
			if((k-1)<left) {
				SL(select,first,left-1,k);
			}else if((k-1)==left) {
				return;
			}else if((k-1)>left) {
				SL(select,left+1,end,k-(left-first+1));
			}
			
			/*for(int l =0; l<end; l++ ) {
				System.out.print(select[l]+" e ");
				}System.out.println();*/
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		Scanner sc2 =new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int n = sc2.nextInt();
		int k = sc2.nextInt();
		
		int select[]= new int[n];
		
		StringTokenizer st = new StringTokenizer(sc.readLine()," ");
		
		int p=0;
		while(st.hasMoreTokens()) {
			select[p++]=Integer.parseInt(st.nextToken());
		}
		
		SL(select, 0, n-1, k);
		/*for(int l =0; l<n; l++ ) {
			System.out.print(select[l]+" a ");
			}System.out.println();*/
		
		System.out.println(select[k-1]);
		sc2.close();
		
	}

}
