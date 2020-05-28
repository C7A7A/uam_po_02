package residents;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void add_resident(ArrayList<Person> residents, Person resident) {
		String pesel = resident.getPesel();
		boolean flag = false;
		
		for (Person person : residents) {
			if (person.getPesel().equals(pesel)) {
				//System.out.println(person.getPesel() + " " + pesel);
				person.setCity(resident.getCity());
				person.setName(resident.getName());
				person.setPesel(resident.getPesel());
				person.setSurname(resident.getSurname());
				
				flag = true;
			}
		}
		
		if (flag == false) {
			residents.add(resident);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String flag = "";
		String name, surname, city, pesel;
		ArrayList<Person> residents = new ArrayList<Person>();
		
		System.out.println("--- Lista mieszkañców ---");
		
		do {
			Person resident = new Person();
			
			System.out.println("Podaj nazwê miasta:");
			city = scanner.nextLine();
			
			System.out.println("Podaj imiê, nazwisko i PESEL:");
			name = scanner.next();
			surname = scanner.next();
			pesel = scanner.next();
			
			if (resident.validate_parameter(city) && resident.validate_parameter(name) 
				&& resident.validate_parameter(surname) && resident.validate_parameter(pesel)) {
				
				if (resident.validate_pesel(pesel)) {
					
					resident.setCity(city);
					resident.setName(name);
					resident.setSurname(surname);
					resident.setPesel(pesel);
					
					add_resident(residents, resident);
				} else {
					System.out.println("Podano b³êdny PESEL");
				}
			} else {
				System.out.println("Podano b³êdne dane");
			}
			
			System.out.println("E - zakoñcz dzia³anie programu, C - kontynuuj");
			flag = scanner.next();
			
		} while(!flag.equals("E"));

		scanner.close();
		
		String file_name = "residents.txt";
		
		try {
			FileWriter writer = new FileWriter(file_name);
			//File file = new File(file_name);
			//System.out.println(file.getAbsolutePath());
			for(Person resident: residents) {
				writer.write("Miasto: " + resident.getCity() + "\n" +
							 "Imiê: " + resident.getName() + "\n" +
							 "Nazwisko: " + resident.getSurname() + "\n" +
							 "PESEL: " + resident.getPesel() + "\n" + "\n"
							 );
			}
			writer.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
