import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class s11004 {

	static void MS(int merge[],int p, int q) {
		/*for(int i=0;i <q+1 ; i++) {
			System.out.println(merge[i]);
		}*/
		if(p<q) {
			int mid=(p+q)/2;
			MS(merge,p,mid);
			MS(merge,mid+1,q);
			SM(merge,p,q,mid);
		}


	}
	static void SM(int merge[], int p, int q, int mid) {
		/*for(int i=0;i <q+1 ; i++) {
			System.out.println(merge[i]);
		}*/
		int tmp[]=new int[q-p+1];
		int ind1=p;//p~mid
		int ind2=mid+1;//mid+1~q
		int ind3=0;
		while(ind1<=mid&&ind2<=q) {

			if(merge[ind1]<merge[ind2]) {
				tmp[ind3]=merge[ind1];
				ind3++;
				ind1++;
			}else if(merge[ind1]>merge[ind2]) {
				tmp[ind3]=merge[ind2];
				ind3++;
				ind2++;
			}

		}
		while(ind3<q-p+1) {
			if(ind1>mid) {
				tmp[ind3]=merge[ind2];
				ind3++;
				ind2++;
			}else if(ind2>q) {
				tmp[ind3]=merge[ind1];
				ind3++;
				ind1++;
			}
		}
		int k=0;
		for(int i=p; i<q+1;i++) {
			merge[i]=tmp[k];
			k++;
		}
	}




	public static void main(String[] args) throws IOException {
		Scanner sc2 = new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int total = sc2.nextInt();
		int k= sc2.nextInt();
		int merge[]=new int[total];
		StringTokenizer st = new StringTokenizer(sc.readLine()," ");
		int p=0;
		while(st.hasMoreTokens()) {
			merge[p++]=Integer.parseInt(st.nextToken());
		}
		/*for(int i=0; i<total; i++) {
			merge[i]=sc.nextInt();
		}*/

		MS(merge,0,total-1);

		//for(int i=0; i<total; i++) {
			System.out.println(merge[k-1]);
		//}

		sc.close();
	}

}
