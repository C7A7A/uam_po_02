package files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj �cie�k� do pliku wej�ciowego:");
		String fileIn = scanner.next();
		System.out.println("Podaj �cie�k� do pliku wyj�ciowego:");
		String fileOut = scanner.next();
		
		Path pathToFileIn = Paths.get(fileIn);
		Path pathToFileOut = Paths.get(fileOut);
		
		if(Files.notExists(pathToFileOut)) {
			try {
				Files.createFile(pathToFileOut);
			} catch (Exception e) {
				System.out.println("Problem z plikiem wyj�ciowym");
				scanner.close();
				return;
			}
		}
		
		List<String> lines = null;
		try {
			lines = Files.readAllLines(pathToFileIn);
		} catch (Exception e) {
			System.out.println("B��d dost�pu do pliku: " + pathToFileIn.getFileName());
			scanner.close();
			return;
		}
		
		System.out.println("ilo�� linii: " + lines.size());
		System.out.println("nazwa pliku wej�ciowego: " + pathToFileIn.getFileName());
		
		try {
			FileWriter writer = new FileWriter(fileOut);
			writer.write("ilo�� linii: " + lines.size());
			writer.write(System.lineSeparator());
			writer.write("nazwa pliku wej�ciowego: " + pathToFileIn.getFileName());
			writer.close();
		} catch (IOException ioe) {
			System.out.println("B��d dost�pu do pliku: " + pathToFileOut.getFileName());
			scanner.close();
			return;
		}
		
		scanner.close();
	}

}
