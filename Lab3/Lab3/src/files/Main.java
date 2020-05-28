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
		System.out.println("Podaj œcie¿kê do pliku wejœciowego:");
		String fileIn = scanner.next();
		System.out.println("Podaj œcie¿kê do pliku wyjœciowego:");
		String fileOut = scanner.next();
		
		Path pathToFileIn = Paths.get(fileIn);
		Path pathToFileOut = Paths.get(fileOut);
		
		if(Files.notExists(pathToFileOut)) {
			try {
				Files.createFile(pathToFileOut);
			} catch (Exception e) {
				System.out.println("Problem z plikiem wyjœciowym");
				scanner.close();
				return;
			}
		}
		
		List<String> lines = null;
		try {
			lines = Files.readAllLines(pathToFileIn);
		} catch (Exception e) {
			System.out.println("B³¹d dostêpu do pliku: " + pathToFileIn.getFileName());
			scanner.close();
			return;
		}
		
		System.out.println("iloœæ linii: " + lines.size());
		System.out.println("nazwa pliku wejœciowego: " + pathToFileIn.getFileName());
		
		try {
			FileWriter writer = new FileWriter(fileOut);
			writer.write("iloœæ linii: " + lines.size());
			writer.write(System.lineSeparator());
			writer.write("nazwa pliku wejœciowego: " + pathToFileIn.getFileName());
			writer.close();
		} catch (IOException ioe) {
			System.out.println("B³¹d dostêpu do pliku: " + pathToFileOut.getFileName());
			scanner.close();
			return;
		}
		
		scanner.close();
	}

}
