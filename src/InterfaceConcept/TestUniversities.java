package InterfaceConcept;

public class TestUniversities {

	public static void main(String[] args) {

		US us=new IIT();
		us.ColoradoUniversity();
		us.TexasUniversity();
		us.NYU();
		us.HumanResourceCourses();
		us.TechnicalCourses();
		us.ManagementCourses();
		
		UK uk=new IIT();
		uk.CambridgeUniversity();
		uk.ManchesterUniversity();
		uk.OxfordUniversity();
		uk.HumanResourceCourses();
		uk.TechnicalCourses();
		uk.ManagementCourses();
		
		India i=new IIT();
		i.AIT();
		i.BHU();
		i.PuneUniversity();
		i.TechnicalCourses();
		i.ManagementCourses();
		i.HumanResourceCourses();
		
		
		US u=new IIM();
		u.ColoradoUniversity();
		u.TexasUniversity();
		u.NYU();
		u.TechnicalCourses();
		u.ManagementCourses();
		u.HumanResourceCourses();
		
		UK k=new IIM();
		k.CambridgeUniversity();
		k.ManchesterUniversity();
		k.OxfordUniversity();
		k.TechnicalCourses();
		k.ManagementCourses();
		k.HumanResourceCourses();
		
		India in=new IIM();
		in.AIT();
		in.BHU();
		in.PuneUniversity();
		in.TechnicalCourses();
		in.ManagementCourses();
		in.HumanResourceCourses();
		
		US s=new OtherUniversities();
		s.ColoradoUniversity();
		s.TexasUniversity();
		s.NYU();
		s.TechnicalCourses();
		s.ManagementCourses();
		s.HumanResourceCourses();
		
		UK uk1=new OtherUniversities();
		uk1.CambridgeUniversity();
		uk1.ManchesterUniversity();
		uk1.OxfordUniversity();
		uk1.TechnicalCourses();
		uk1.HumanResourceCourses();
		uk1.ManagementCourses();
		
		India ind=new OtherUniversities();
		ind.AIT();
		ind.BHU();
		ind.PuneUniversity();
		ind.TechnicalCourses();
		ind.ManagementCourses();
		ind.HumanResourceCourses();

	}

}
