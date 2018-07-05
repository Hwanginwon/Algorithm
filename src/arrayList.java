import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();//제너릭
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);//10 20 30 
		numbers.add(1,50);//index=1 input 50 //10 50 20 30
		System.out.println(numbers.get(2));
		numbers.remove(2);
		System.out.println(numbers.size());
		
		Iterator it = numbers.iterator();
			while(it.hasNext()) {//hasNext 는 boolean 값
				int value = (int)it.next();//next 는 object로 받아오기 때문에 int 로 casting
				if(value ==30) {
					it.remove();
				}
			}
			
		for(int value : numbers) {
			System.out.println(value);
		}
	}

}
