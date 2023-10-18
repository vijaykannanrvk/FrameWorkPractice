package practice.base;

import java.io.IOException;
import java.nio.charset.Charset;

public interface IJsonReader {

	public String readFile(String path) throws IOException;
}
