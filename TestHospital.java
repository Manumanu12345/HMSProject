package HMS;
import java.util.Scanner;

public class TestHospital {
	public static void main(String[] args) {
		
	     Scanner scanner = new Scanner(System.in);
	     Hospital hospital = new Hospital(10,5); // Max 10 patients, 5 doctors

	     while (true) {
	         System.out.println("\n--- Hospital Management System ---");
	         System.out.println("1. Add Patient");
	         System.out.println("2. Add Doctor");
	         System.out.println("3. Display Patients");
	         System.out.println("4. Display Doctors");
	         System.out.println("5. Exit");
	         System.out.print("Choose an option: ");

	         int choice = scanner.nextInt();
	         scanner.nextLine();

	         switch (choice) {
	             case 1:
	                 System.out.print("Enter patient name: ");
	                 String patientName = scanner.nextLine();
	                 System.out.print("Enter patient age: ");
	                 int patientAge = scanner.nextInt();
	                 scanner.nextLine(); // Consume newline
	                 System.out.print("Enter patient ailment (e.g., Flu, Diabetes, Heart Disease): ");
	                 String ailment = scanner.nextLine();
	                 System.out.print("Enter treatment plan: ");
	                 String treatment = scanner.nextLine();
	                 System.out.print("Enter doctor assigned: ");
	                 String doctorAssigned = scanner.nextLine();
	                 Patient patient = new Patient(patientName, patientAge, ailment, treatment, doctorAssigned);
	                 hospital.addPatient(patient);
	                 break;

	             case 2:
	                 System.out.print("Enter doctor name: ");
	                 String doctorName = scanner.nextLine();
	                 System.out.print("Enter doctor specialty: ");
	                 String specialty = scanner.nextLine();
	                 Doctor doctor = new Doctor(doctorName, specialty);
	                 hospital.addDoctor(doctor);
	                 break;

	             case 3:
	                 hospital.displayPatients();
	                 break;

	             case 4:
	                 hospital.displayDoctors();
	                 break;

	             case 5:
	                 System.out.println("Exiting...");
	                 scanner.close();
	                 return;

	             default:
	                 System.out.println("Invalid choice. Please try again.");
	         }
	     }
	 }
	}

