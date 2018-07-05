import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class selection2{

	static void SEL(int select[], int left, int right, int k) {
		int mid = (left+right)/2;
		int pivot = select[mid];
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
					while(select[left]<=pivot) {
						if(left!=(right-1)) {
							left++;
						}else if(left==(right-1)) {
							break;
						}
					}
					while(select[right]>=pivot) {
						if(left!=right-1) {
							right--;
						}else if(right==(left+1)) {
							break;
						}
					}

					if(select[left]>=pivot&&select[right]<=pivot) {
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
				}else if(select[right]<=pivot) {
					select[first]=select[right];
					select[right]=pivot;
					left++;
				}else if(select[left]<=pivot&&select[right]>=pivot) {
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

	public static void main(String[] args) throws Exception{
		Scanner sc2 =new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		//Scanner sc2 = new Scanner(System.in);
		//sc.readLine();

		//StringTokenizer st2 = new StringTokenizer(sc.readLine()," ");
		//while(st2.hasMoreTokens()) {
		int n = sc2.nextInt();
		int k = sc2.nextInt();
		//}

		//int n = sc2.nextInt();
		//int k = sc2.nextInt();
		//System.out.println(n);
		//System.out.println(k);

		int select[]= new int[n];
		//String select2[]= sc.readLine().split(" ");


		//int a = Integer.parseInt(read);

		//String arr[] = read.split(" ");
		StringTokenizer st = new StringTokenizer(sc.readLine()," ");
		//String read = st.nextToken();
		int p=0;
		while(st.hasMoreTokens()) {

			//for(int i =0 ; i< n; i++) {
			//int j=Integer.parseInt(sc.readLine());
			//select[i]=j;
			//select[i]=Integer.parseInt(st.nextToken());
			//select[i]=Integer.parseInt(read);

			//}
			select[p++]=Integer.parseInt(st.nextToken());
		}
		/*for(int i=0 ;i<n;i++) {
			System.out.print(select[i]+" ");
		}*/

		SEL(select, 0, n-1, k);

		System.out.println(select[k-1]);

		/*for(int i=0 ;i<n;i++) {
			System.out.print(select[i]+" ");
		}*/



		sc.close();
		sc2.close();

	}

}