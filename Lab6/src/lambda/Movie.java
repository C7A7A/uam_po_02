package lambda;

import java.nio.file.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.text.MessageFormat.format;

import java.io.IOException;

public class Movie {

	private static String[] parseCSV(String line) {
		String regex = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
		String[] movie = line.split(regex);
		String title = movie[1].trim();
		if (title.charAt(0) == '"' && title.charAt(title.length() - 1) == '"') {
			movie[1] = title.substring(1, title.length() - 1).trim();
		}
		return movie;
	}
	
	private static boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) return false;
		}
		return true;
	}
	
	private static long moviesAmount(List<String[]> movies) {
		long count = movies.stream().count();
		return count;
	}
	
	private static IntSummaryStatistics moviesYears(List<String[]> movies) {
		IntSummaryStatistics years = movies.stream()
                .map(movie -> movie[1].trim())
                .map(title -> title.substring(title.length() - 5, title.length() - 1))
                .filter(Movie::isNumeric)
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
		return years;
	}
	
	private static Map<String, Long> moviesGenres(List<String[]> movies) {
		Map<String, Long> genres = movies.stream()
										 .map(movie -> movie[2])
										 .flatMap(gen -> Arrays.stream(gen.split("\\|")))
										 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
										 
		return genres;
	}
	
	public static void main(String[] args) {
		Path sourcePath = Paths.get("movies.csv");
		
		List<String> lines;
		
		try {
			lines = Files.readAllLines(sourcePath);
		} catch (Exception e) {
			System.out.println("File access error: " + sourcePath.getFileName());
			return;
		}
		
		//lines.stream().forEach(System.out::println);
		
		List<String[]> movies = lines.stream()
								.skip(1)
								.map(Movie::parseCSV)
								.collect(Collectors.toList());
		
		//movies.stream().map(movie -> movie[1]).forEach(System.out::println);
		
		System.out.println(moviesAmount(movies));
		
		IntSummaryStatistics years = moviesYears(movies);
		System.out.println(format("Movies were produced beetween {0} - {1}", years.getMin(), years.getMax()));
		
		Map<String, Long> genres = moviesGenres(movies);
		
		genres.entrySet().stream()
						 .max(Map.Entry.comparingByValue())
						 .ifPresent(element -> System.out.println(format("The most popular movie genre: {0},"
						 		+ " Amount of movies: {1}", element.getKey(), element.getValue())));
		
		genres.entrySet().stream()
						 .sorted(Map.Entry.comparingByKey())
						 .forEach(entry -> System.out.println("Genre: " + entry.getKey() + 
								 							  " Amount of movies: " + entry.getValue()));
		
	}

}
