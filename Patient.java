package HMS;

public class Patient {
		 private String name;
		 private int age;
		 private String ailment;
		 private String treatment;
		 private String doctorAssigned;

		 public Patient(String name, int age, String ailment, String treatment, String doctorAssigned) {
		     this.name = name;
		     this.age = age;
		     this.ailment = ailment;
		     this.treatment = treatment;
		     this.doctorAssigned = doctorAssigned;
		 }

		 public String getDetails() {
		     return "Name: " + name + ", Age: " + age + ", Ailment: " + ailment +
		            ", Treatment: " + treatment + ", Doctor Assigned: " + doctorAssigned;
		 }
		}

