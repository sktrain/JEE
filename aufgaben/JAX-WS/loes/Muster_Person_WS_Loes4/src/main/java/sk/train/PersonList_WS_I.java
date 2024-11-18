package sk.train;

import jakarta.jws.WebService;

@WebService
public interface PersonList_WS_I {

	Person getPerson(int i); 

	Person[] getPersonList();

}