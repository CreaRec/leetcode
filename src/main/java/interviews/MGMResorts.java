package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
* Two arrays:
* products and usage
* int[] products = {4, 6, 3, 8, 9, 1};
* int[] usage = {6, 8, 4, 6, 6, 9, 8, 6, 8, 9};
*
* 1) find not used products // 3, 1
* 2) find most used products // 6, 8
* 3) find less used products // 4
 */
public class MGMResorts {
	public static void main(String[] args) {
		int[] products = {4, 6, 3, 8, 9, 1};
		int[] usage = {6, 8, 4, 6, 6, 9, 8, 8, 9};

		// 1st
		Set<Integer> usageSet = Arrays.stream(usage).boxed().collect(Collectors.toSet());
		Set<Integer> notUsedProductSet = Arrays.stream(products).boxed().collect(Collectors.toSet());
		notUsedProductSet.removeAll(usageSet);
		notUsedProductSet.forEach(System.out::println);


		Map<Integer, Integer> mp = new HashMap<>();
		for (int i : usage) {
			mp.put(i, mp.getOrDefault(i, 0) + 1);
		}

		List<Map.Entry<Integer, Integer> > list = new ArrayList<>(mp.entrySet());
		list.sort((o1, o2) -> {
			if (o1.getValue().equals(o2.getValue())) {
				return o2.getKey() - o1.getKey();
			} else {
				return o2.getValue() - o1.getValue();
			}
		});

		//2nd
		int max = -1;
		for (int i = 0; i < list.size(); i++) {
			Map.Entry<Integer, Integer> entry = list.get(i);
			if (i == 0) {
				max = entry.getValue();
			}
			if (max == entry.getValue()) {
				System.out.println("Max usage: " + entry.getKey());
			} else {
				break;
			}
		}

		//3rd
		int min = -1;
		for (int i = list.size() - 1; i >= 0; i--) {
			Map.Entry<Integer, Integer> entry = list.get(i);
			if (i == list.size() - 1) {
				min = entry.getValue();
			}
			if (min == entry.getValue()) {
				System.out.println("Less usage: " + entry.getKey());
			} else {
				break;
			}
		}
	}
}
