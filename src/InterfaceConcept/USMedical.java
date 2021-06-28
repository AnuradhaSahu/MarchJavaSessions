package InterfaceConcept;

public interface USMedical extends WHO,UNHG{
	
	public void orthoservices();
	public void neuroservices();
	public void emergencyservices();
	public void gynecservices();
	
	//after jdk 1.8- static methods with method body is allowed in interface
	public static void billing() {
		System.out.println("USM static method billing ");
	}
	//after jdk 1.8- default methods with method body is allowed in interface,generally we dont use it but can be used

	default void hiring() {//we can use it as it is or can override it
		System.out.println("USM Hiring");
	}

}
