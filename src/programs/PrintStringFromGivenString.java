package programs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * Print 3r2f1a4g from given string "rrrffagggg"
 * @author priti
 *
 */
public class PrintStringFromGivenString {

	public static void main(String[] args) {
		//1. using map merging in java
		String s="rrrffagggg";
		Map<Character,Integer> charSeq = new LinkedHashMap<Character, Integer>();
		for(char c: s.toCharArray()) {
			charSeq.merge(c, 1,Integer::sum);
		}
		charSeq.forEach((k,v)->
		System.out.println(v+""+k));
		System.out.println();
		
		System.out.println("using map merging in java");
		//2. using Java8 streams and Collectors groupingBy
		String input="rrrffagggg";
		List<String> charList = new ArrayList<>();{
		for(char ch:input.toCharArray()) {
			charList.add(String.valueOf(ch));
		}
		System.out.println(charList);
		Map<Character,Long> charFrequency = charList.stream()
				.flatMap(a->a.chars().mapToObj(c->(char)c))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				charFrequency.forEach((k,v)->
				System.out.println(k+""+v));
				System.out.println("using Java8 streams and Collectors groupingBy");
		
		}
	}

	
}

