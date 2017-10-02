package collectionFrame1;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		Set<Integer> num = new HashSet<>();
		
		num.add(1000);
		num.add(2000);
		num.add(3000);
		num.add(1000);
		
		for(Integer n: num) {
			System.out.println(n);
		}
		
		int sum = 0;
		for(Integer n: num) {
			sum += n;
		}
		System.out.println();
		System.out.println(sum);

	}

}
