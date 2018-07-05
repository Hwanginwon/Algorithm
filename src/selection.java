import java.util.Scanner;

public class selection {
	
	
	static void SEL(int select[], int left, int right, int k) {
		int mid = (left+right)/2;
		int pivot=select[mid];
		/*if(select[left]<select[right]) {
			if(select[left]<select[mid]) {
				pivot = select[mid];
			}else if(select[left]>select[mid]) {
				pivot = select[left];
				mid=left;
			}
		}else if(select[right]<select[left]) {
			if(select[right]>select[mid]) {
				pivot=select[right];
				mid=right;
			}else if(select[mid]>select[right]) {
				pivot=select[mid];
			}
		}*/
		
		int first = left;
		int end = right;
		
		if(left<right) {
			int tmp = select[mid];
			select[mid] = select[left];
			select[left]=tmp;//change pivot to left
			left++;
			while(true) {
				while(left!=right) {
				while(select[left]<pivot) {
					if(left!=(right-1)) {
						left++;
					}else if(left==(right-1)) {
						break;
					}
				}
				while(select[right]>pivot) {
					if(left!=right-1) {
						right--;
					}else if(right==(left+1)) {
						break;
					}
				}
				
				if(select[left]>pivot&&select[right]<pivot) {
					tmp = select[left];
					select[left]=select[right];
					select[right]=tmp;
				}
				if(left==(right-1)) {
					break;
				}
				}
				if(select[left]>pivot) {
					select[first]=select[left-1];
					select[left-1]=pivot;
					left--;
				}else if(select[right]<pivot) {
					select[first]=select[right];
					select[right]=pivot;
					left++;
				}else if(select[left]<pivot&&select[right]>pivot) {
					select[first]=select[left];
					select[left]=pivot;
				}
				
				int s = left-first;
				
				if (k<=s) {
					if(first==left-1) {return;}
					else{SEL(select,first,left-1,k);}
				}else if(k==s+1) {
					return;
				}else if(k>s+1) {
					if(left+1==end) {return;}
					else{SEL(select,left+1,end,k-s-1);}
				}
				
				
				
				
			break;
				
				
			}
			
		
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		//System.out.println(n);
		//System.out.println(k);
		
		int select[]= new int[n];
		
		for(int i =0 ; i< n; i++) {
			select[i]=sc.nextInt();
		}
		
		SEL(select, 0, n-1, k);
		
		System.out.println(select[k-1]);
		
		for(int i=0 ;i<n;i++) {
			System.out.print(select[i]+" ");
		}
		
		
		
		sc.close();

	}

}
