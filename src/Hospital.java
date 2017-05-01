
public class Hospital {
	Doctor doctor = new Doctor();
	Nurse nurse= new Nurse();
	Administrator administrator = new Administrator();
	Receptionist receptionist= new Receptionist();
	Surgeon surgeon= new Surgeon();
	Janitor janitor = new Janitor();
	
	doctor.diagnose();
	nurse.care();
	administor.manage();
	surgeon.operate();
	receptionist.type();
	receptionist.call();
	janitor.clean();
	

}

