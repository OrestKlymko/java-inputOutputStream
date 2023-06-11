package checkNumber;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintNumbers {
	public void printNumber(File file){

		if(!file.exists()){
			file.getParentFile().mkdirs();
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				new CheckLine().checkerLine(line);
			}
		} catch (
				IOException e) {
			e.printStackTrace();
		}
	}
}

