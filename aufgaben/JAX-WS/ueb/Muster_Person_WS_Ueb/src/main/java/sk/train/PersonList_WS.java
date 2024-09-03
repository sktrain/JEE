package sk.train;


import jakarta.annotation.PostConstruct;


import sk.train.Person.Geschlecht;


public class PersonList_WS {
	
	private Person[] personlist;
	
	public PersonList_WS() {
		super();
		
	}
	
	@PostConstruct
	public void init() {
		personlist = new Person[10];
		for (int i = 0; i < personlist.length; ++i ) {
			Person p = new Person();
			p.setName("Mustermann"+i);
			//p.setBirthdate(LocalDate.of(2000,i+1,i+1));
			p.setG(Geschlecht.U);
			personlist[i] =p;
			System.out.println(p);
		}
	}
	
	
	
	public Person getPerson(int i)
	{		
		System.out.println("getPerson()");
				
		Person p = personlist[i];		
		return p;		
		
	}
	
	public Person[] getPersonList() {
		System.out.println("getPersonList()");
		return personlist;
	}
	
	

}
