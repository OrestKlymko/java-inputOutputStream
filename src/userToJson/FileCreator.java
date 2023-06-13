package userToJson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
	public void createJsonFile(File file, String text){
		File jsonFile = new File("/Users/orestklymko/Downloads/StreamReader/resources/user.json");
		if(!jsonFile.exists()){
			jsonFile.getParentFile().mkdirs();
		}
		try(FileWriter writer = new FileWriter(jsonFile);) {
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
