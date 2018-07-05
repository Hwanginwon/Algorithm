import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class quickSort {

	static void QS(int quick[], int left , int right) {
		int first=left;
		int end=right;
		if(left<right) {
			int mid=(left+right)/2;
			int pivot=quick[mid];
			int tmp=quick[first];
			quick[first]=quick[mid];
			quick[mid]=tmp;
			left++;
			while(left<right) {
				//System.out.println(left);
				while(pivot>quick[left]) {
					if(left!=right-1) {
						left++;
					}else if(left==right-1) {
						break;
					}
				}
				while(pivot<quick[right]) {
					if(right!=left+1) {
						right--;
					}else if(right==left+1) {
						break;
					}
				}


				if(quick[left]>pivot && quick[right]<pivot) {
					int tmp2=quick[left];
					quick[left]=quick[right];
					quick[right]=tmp2;
				}

				if(left+1==right) {
					break;
				}
				//System.out.println("초음:"+ left);
			}
			if(quick[first]>=quick[left]&&quick[first]<quick[right]) {
				int tmp3=quick[first];
				quick[first]=quick[left];
				quick[left]=tmp3;
			}else if(quick[first]>=quick[left]&&quick[first]>=quick[right]) {
				int tmp3=quick[first];
				quick[first]=quick[right];
				quick[right]=tmp3;
				left++;
			}else if(quick[first]<quick[left]) {
				int tmp3=quick[first];
				quick[first]=quick[left-1];
				quick[left-1]=tmp3;
				left--;
			}

			/*for(int i=0; i<end+1; i++) {
				System.out.print(quick[i]+" ");
			}
			System.out.println();*/
			//System.out.println("다음:"+left);
			QS(quick,first,left-1);
			//System.out.println("다다음:"+left);
			QS(quick,left+1,end);


		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader sc2 = new BufferedReader(new InputStreamReader(System.in));
		
		int total = sc.nextInt();
		int k=sc.nextInt();
		int quick[]=new int[total];
		/*for(int i=0; i<total; i++) {
			quick[i]=sc.nextInt();//array declare
		}*/
		
		StringTokenizer st = new StringTokenizer(sc2.readLine()," ");
		int p=0;
		while(st.hasMoreTokens()) {
			quick[p++]=Integer.parseInt(st.nextToken());
		}
		
		QS(quick,0,total-1);

		//for(int i=0; i<total; i++) {
			System.out.println(quick[k-1]);
		//}

		sc.close();

	}

}