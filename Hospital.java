package HMS;

public class Hospital {
	private Patient[] patients;
	 private Doctor[] doctors;
	 private int patientCount;
	 private int doctorCount;

	 public Hospital(int maxPatients, int maxDoctors) {
	     patients = new Patient[maxPatients];
	     doctors = new Doctor[maxDoctors];
	     patientCount = 0;
	     doctorCount = 0;
	 }

	 public void addPatient(Patient patient) {
	     if (patientCount < patients.length) {
	         patients[patientCount++] = patient;
	         System.out.println("Patient added successfully.");
	     } else {
	         System.out.println("Cannot add more patients. Limit reached.");
	     }
	 }

	 public void addDoctor(Doctor doctor) {
	     if (doctorCount < doctors.length) {
	         doctors[doctorCount++] = doctor;
	         System.out.println("Doctor added successfully.");
	     } else {
	         System.out.println("Cannot add more doctors. Limit reached.");
	     }
	 }

	 public void displayPatients() {
	     System.out.println("Patients List:");
	     for (int i = 0; i < patientCount; i++) {
	         System.out.println(patients[i].getDetails());
	     }
	 }

	 public void displayDoctors() {
	     System.out.println("Doctors List:");
	     for (int i = 0; i < doctorCount; i++) {
	         System.out.println(doctors[i].getDetails());
	     }
	 }
	}

