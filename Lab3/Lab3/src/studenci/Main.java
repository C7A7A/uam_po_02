package studenci;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option, optionStudent;
		String studentName, studentIndex, flag = "";
		ArrayList<Student> studentList = new ArrayList<Student>();
		//FileOutputStream pathToFile = new FileOutputStream("C:/Users/matcza5/Desktop/studia/uam_po/Lab3/Lab3/src/studenci/students.txt");
		
		System.out.println("Witaj w systemie dodawania studentów");
		
		do {
			StudentDzienny stD = new StudentDzienny();
			StudentZaoczny stZ = new StudentZaoczny();
			
			System.out.println("Wybierz jedn¹ z poni¿szych opcji:");
			System.out.println("1 Dodaj nowego studenta");
			System.out.println("2 Wyœwietl listê studentów");
			System.out.println("3 Wyjdz z programu");
			
			option = scanner.nextInt();
			
			switch(option) {
				case 1: // Add
					System.out.println("1 Student Dzienny");
					System.out.println("2 Student Zaoczny");
					System.out.println("3 Wyjd¿");
					optionStudent = scanner.nextInt();
					
					System.out.println("Podaj imiê:");
					studentName = scanner.next();
					System.out.println("Podaj indeks (dzienny - zaczyna siê od 1, "
													+ "zoaczny - zaczyna siê od 2):");
					studentIndex = scanner.next();
					
					if(optionStudent == 1) { // Dzienny
						stD.setName(studentName);
						stD.setIndex(studentIndex);
						studentList.add(stD);
					} else if (optionStudent == 2) { // Zaoczny
						stZ.setName(studentName);
						stZ.setIndex(studentIndex);
						studentList.add(stZ);
					} else {
						break;
					}
					break;
				case 2: // Print
					System.out.println("1 studenci Dzienni");
					System.out.println("2 studenci Zaoczni");
					System.out.println("3 Wszyscy studenci");
					optionStudent = scanner.nextInt();
					if(optionStudent == 1) { // Dzienny
						for(Student st: studentList) {
							studentIndex = st.getIndex();
							if((studentIndex.substring(0, 1)).equals("1")) {
								System.out.println(st);
							}
						}
					} else if (optionStudent == 2) { // Zaoczny
						for(Student st: studentList) {
							studentIndex = st.getIndex();
							if((studentIndex.substring(0, 1)).equals("2")) {
								System.out.println(st);
							}
						}
					} else {
						for(Student st: studentList) {
							System.out.println(st);
						}
					}
					break;
				case 3: // Exit
					flag = "N";
					break;
				default:
					System.out.println("Wybierz opcjê od 1-3");
					break;
			}	
		} while(flag != "N");
		
		try {
			FileWriter writer = new FileWriter("C:\\Users\\matcza5\\Desktop\\studia\\uam_po\\Lab3\\Lab3\\src\\studenci\\studenci.txt");
			for(Student st: studentList) {
				writer.write("Index: " + st.getIndex());
				writer.write(" Name: " + st.getName());
				writer.write(System.lineSeparator());
			}
			writer.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		scanner.close();
	}

}
