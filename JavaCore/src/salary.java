import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

public class salary {

	public static void main(String[] args) throws ParseException {
		
		Instant inst1 = Instant.now();
		
		System.out.println(inst1);
		
		Instant inst2 = inst1.plus(Duration.ofHours(20));
		
		System.out.println(inst2);
		
		long a = Duration.between(inst1, inst2).toHours();
		
		ArrayList<String> arr = new ArrayList<String>();
		HashMap map = new HashMap();
		arr.add("Allen");
		arr.add("100");
		arr.add("Thomas");
		arr.add("300");
		
		for(String s: arr) {
			System.out.println(s);
		}
		
		int i = 0, j = i+1;
		while(i<=arr.size()/2) {
			map.put(arr.get(i), (Long.parseLong(arr.get(j))*a));
			i+=2;
			j+=2;
		}
		
		System.out.println(map.entrySet());
	}

}
