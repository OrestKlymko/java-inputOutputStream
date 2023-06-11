package frequencyWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CounterWords {
	public void calculateWord(BufferedReader bufferedReader){
		HashMap<String, Integer> results = new HashMap<>();
		String line;
		StringBuilder stringBuilder = new StringBuilder();
		while(true){
			try {
				if ((line = bufferedReader.readLine()) == null) break;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			stringBuilder.append(line);
			stringBuilder.append(" ");
		}
		String[] resultLineArray = stringBuilder.toString().split(" ");

		int index=0;
		int count=0;
		int counter=0;

		while (index<resultLineArray.length) {
			for (String str : resultLineArray) {
				if (str.contains(resultLineArray[index])) {
					count++;
				}
				counter++;

				if (counter == resultLineArray.length) {
					results.put(resultLineArray[index], count);
					index++;
					counter = 0;
					count = 0;
				}
			}
		}
		for(Map.Entry<String, Integer> item : results.entrySet()){

			System.out.printf("%s %s \n", item.getKey(), item.getValue());
		}
	}
}
