package practice.base;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader implements IJsonReader{

	public String readFile(String path) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		  return new String(encoded, StandardCharsets.UTF_8);
	}

}
