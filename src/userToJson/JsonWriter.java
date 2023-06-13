package userToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonWriter {


	public void writeToJson(File file){
		List<User> arrayUsers = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			String line;
			int index=0;
			while ((line = bufferedReader.readLine()) != null) {

				String [] infoNameAge=line.split(" ");
				if(infoNameAge[1].matches("[-+]?\\d+")&!infoNameAge[0].matches("[-+]?\\d+")){
					arrayUsers.add(new User(infoNameAge[0],Integer.parseInt(infoNameAge[1])));
				}

				index++;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(arrayUsers);




		FileCreator fileCreator = new FileCreator();
		fileCreator.createJsonFile(file,json);


		System.out.println(json);
	}
}
