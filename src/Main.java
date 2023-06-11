import checkNumber.PrintNumbers;
import frequencyWords.FrequencyPrinter;
import userToJson.JsonWriter;
import java.io.*;


public class Main {
	public Main() {
	}

	public static void main(String[] args) {

		//Task 1
		File data = new File("/Users/orestklymko/Downloads/StreamReader/resources/data.txt");
		PrintNumbers printNumbers = new PrintNumbers();
		printNumbers.printNumber(data);


		//Task 2

		File file = new File("/Users/orestklymko/Downloads/StreamReader/resources/file.txt");
		JsonWriter jsonWriter = new JsonWriter();
		jsonWriter.writeToJson(file);

		//Task 3

		File words = new File("/Users/orestklymko/Downloads/StreamReader/resources/words.txt");
		FrequencyPrinter frequencyPrinter = new FrequencyPrinter();
		frequencyPrinter.toCount(words);


	}
}






