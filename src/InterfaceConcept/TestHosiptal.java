package InterfaceConcept;

public class TestHosiptal {

	public static void main(String[] args) {


		//USMedical us=new USMedical(); cannot create object of interface
		FortisHospital fh=new FortisHospital();//creating object of class fortis hospital
		fh.cardioservices();
		fh.ENTservices();
		fh.emergencyservices();
		fh.gynecservices();
		fh.medicalInsurance();
		fh.oncologyservices();
		fh.OPTservices();
		fh.covidTest();
		fh.covidfunds();
		fh.pathologyservices();//overridden method calling
		fh.NursingTraining();
		USMedical.billing();//static method can be called using class name
		fh.hiring();
		
		//top casting-child class object refered by parent class reference variable
		USMedical us=new FortisHospital();//creates only us fetaures cannot access the entire fortis 
		us.emergencyservices();
		us.gynecservices();
		us.orthoservices();
		us.covidfunds();//accessing from parent and grandparent class
		us.covidTest();
		
		UKMedical uk=new FortisHospital();
		uk.emergencyservices();
		uk.ENTservices();
		uk.physioservices();
		
		//down casting-not allowed at compile also -parent class object referd by child class ref variable
		//FortisHospital fs=new UKMedical();
		
		
		
	}

}
