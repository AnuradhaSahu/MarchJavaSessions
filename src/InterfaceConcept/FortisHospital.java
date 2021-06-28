package InterfaceConcept;

public class FortisHospital extends HospitalManagement implements USMedical,UKMedical,IndianMedical{

	@Override
	public void orthoservices() {
		System.out.println("FH-orthoservices");
	}

	@Override
	public void neuroservices() {
		System.out.println("FH-neuroservices");
		
	}

	@Override
	public void emergencyservices() {
		System.out.println("FH-emergencyservices");
		
	}

	@Override
	public void gynecservices() {
		System.out.println("FH-gynecservices");
		
	}

	@Override
	public void physioservices() {
		System.out.println("FH-physioservices");
		
	}

	@Override
	public void ENTservices() {
		System.out.println("FH-ENTservices");
		
	}

	@Override
	public void oncologyservices() {
		System.out.println("FH-oncologyservices");
		
	}

	@Override
	public void cardioservices() {
		System.out.println("FH-cardioservices");
		
	}

	@Override
	public void pediaservices() {
		System.out.println("FH-pediaservices");
		
	}
	//FH methods
	public void medicalInsurance() {
		System.out.println("FH-medicalInsurance");
	}
	public void OPTservices() {
		System.out.println("FH-OPTservices");
	}

	@Override
	public void covidTest() {
		System.out.println("FH-covidTest");
		
	}

	@Override
	public void covidfunds() {
		System.out.println("FH-covidfunds");
	}
	
	@Override
	public void pathologyservices() {
		System.out.println("FH-pathologyservices");
	}
	
	//method hiding
	public static void billing() {
		System.out.println("USM Billing");
	}

	public  void hiring() {
		System.out.println("FH USM hiring");
	}

}
