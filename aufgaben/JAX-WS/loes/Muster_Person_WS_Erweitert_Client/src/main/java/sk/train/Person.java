package sk.train;

import java.time.LocalDate;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

//@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	
	public enum Geschlecht { W, M, U

	};
	
	private String name;
//	@XmlJavaTypeAdapter(type = LocalDate.class,value=LocalDateAdapter.class)
	private LocalDate birthdate;
	private Geschlecht g;
	
	
	public Person() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	//kleine Anpassung
	public void setBirthdate(String birthdate) {
		this.birthdate = LocalDate.parse(birthdate);
	}
	public Geschlecht getG() {
		return g;
	}
	public void setG(Geschlecht g) {
		this.g = g;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthdate=" + birthdate + ", g=" + g + "]";
	}
	
	
	

}
