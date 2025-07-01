import java.util.Arrays;
import java.util.List;

public class FirstNonRepeatinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(0,1,0,1, 2, 3, 2, 4, 5, 4);

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating element: " + list.get(i));
                return;
            }
        }

        System.out.println("No non-repeating element found.");
	}

}
