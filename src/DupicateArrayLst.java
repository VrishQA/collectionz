import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupicateArrayLst {

	public static void main(String[] args) {
		
		
		
		List<Integer> x= new ArrayList<>(Arrays.asList(1,2,2,2,3,4,4,5,5,5));
		System.out.println("Before Removing Duplicates");
		System.out.println(x);
		
		for(int i=0;i<x.size()-1;i++) {
			if(x.get(i).equals(x.get(i+1))) {
				x.remove(i);
				i--;
				//x.set(i, x.get(i + 1));	
			}
			
		}
		System.out.println("After Removing Duplicates");
		System.out.println(x);
		
		

	}

}
