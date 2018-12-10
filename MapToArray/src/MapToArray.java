import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapToArray {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "abc");
		hashMap.put(102, "def");
		hashMap.put(103, "ghi");
		hashMap.put(104, "jkl");
		MapToArray mapToArray = new MapToArray();
		String[] convertMapToArray = mapToArray.convertMapToArray(hashMap);
		for (String values : convertMapToArray) {
			System.out.println(values);
		}

	}

	public String[] convertMapToArray(Map<Integer, String> sourceMap) {

		Collection<String> values = sourceMap.values();
		String[] targetArray = values.toArray(new String[values.size()]);
		return targetArray;

	}
}
