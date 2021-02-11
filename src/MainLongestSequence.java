import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLongestSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sequnce you want to generate: ");
		System.out.println("--------------------------------------------------");
		int n = sc.nextInt();
		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> subList = new ArrayList<Integer>();
		sc.close();
		
		CalculateSequence calculateSequence = new CalculateSequence(list);
		calculateSequence.setList(n);
		
		subList = calculateSequence.getTheLongestSeq(n);
		System.out.println("--------\nLongest sequence is : "+ subList.size());
		System.out.println(subList);
		

	}

}
