import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CalculateSequence {
	
	private List<Integer> myList = new ArrayList<Integer>();
	
	public CalculateSequence(List<Integer> list) {
		this.myList = list;
	}

	public List<Integer>getList() {
		return this.myList;
	}
	
	public void setList(int n){
		for (int i=0;i <n; i++) {
			myList.add(ThreadLocalRandom.current().nextInt(0, n +1));
			System.out.println(myList.get(i));
		}	
	}
	
	public List<Integer> getTheLongestSeq(int n){
		int counStart = 0;
		int count=1;
		int max =1;
		int endIndex = 0;
		int startIndex =0;
	    boolean flag = false;
		
	    List<Integer> subList = new ArrayList<Integer>();
	    int i = 1;
		while(i < n) {
			if(myList.get(i) > myList.get(i - 1)) {
				count ++;
				if(!flag) {
					counStart = i - 1;
				}
				flag = true;
			 }
			else if (count > max && flag) {
				startIndex = counStart;
				max = count;
				count = 0;
				flag = false;
				endIndex = i;	
			 }
			else {
				count = 0;
				flag = false;
			}
			i++;
		}
		return subList = myList.subList(startIndex, endIndex);
		
	}
}
