package classOrganisation;

public class Customer {
	

		public static void main(String[] args) {
			Person p = new Person(null, null, null, null);
			System.out.println(" person details are");
			
			System.out.println("family name "+p.getFamilyName()+" given name "+p.getGivenName()
			+" middle name"+p.getMiddleName()+" phone number "+p.getPhone()+ " birth date is"+p.getBirthDate());
			System.out.println();
			Hospital h= new Hospital();
			System.out.println("\n hospital details are");
		
			System.out.println(" name "+h.name("id")+ " phone number is "+h.getPhone());
			
			Patient patient =new Patient(null, null, null, null);
			System.out.println("\n patient details are ");
			System.out.println("name is"+patient.getGivenName()+" id is "+patient.id("id")
			+"acceptd date"+patient.getAccepted()+"allergies are "+patient.getAllergies());
			
			Prescription prescription = new Prescription();
			Doctor d= new Doctor(null, null, null, null);
			d.updatePrescription(prescription);
			d.writePrescription();
			
	}
}
