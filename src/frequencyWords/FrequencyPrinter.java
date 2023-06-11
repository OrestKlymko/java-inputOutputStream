package frequencyWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FrequencyPrinter {
	public void toCount(File file){
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			CounterWords counterWords = new CounterWords();
			counterWords.calculateWord(bufferedReader);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
