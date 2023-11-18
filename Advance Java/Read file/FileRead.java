import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\JAVA LANGUAGE\\Array_problem\\Practice.java");
		int countPremitiveVariables = 0;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				System.out.println(line);
				String[] wordStrings = line.trim().split(" ");
				for (String i : wordStrings) {
					if (i.equals("int") || i.equals("float") || i.equals("double") || i.equals("Long")) {
						countPremitiveVariables++;
					}
				}
				// bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.print(e.getMessage());
		}
		System.out.print(countPremitiveVariables);

	}

}