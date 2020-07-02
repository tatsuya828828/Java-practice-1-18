
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("こんにちは");
		fw.close();
	}
}
