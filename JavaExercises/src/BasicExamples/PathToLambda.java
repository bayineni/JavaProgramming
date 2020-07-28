package BasicExamples;

import java.util.*;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PathToLambda {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".java");
				
			}
		};
		
		FileFilter dupfilter = (File pathname) -> pathname.getName().endsWith(".java");
		
		File dir = new File("dfdvs");
		File[] files = dir.listFiles(filter);
		
		List<Integer> values = new ArrayList<Integer>();
		


List<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(4);
numbers.add(6);

List square = numbers.stream().map((x)->x*x).collect(Collectors.toList());



	}

}
