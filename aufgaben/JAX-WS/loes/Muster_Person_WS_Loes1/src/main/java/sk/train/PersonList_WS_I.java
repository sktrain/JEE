package sk.train;

import jakarta.jws.WebService;
//import jakarta.jws.soap.SOAPBinding;
//import jakarta.jws.soap.SOAPBinding.Style;

@WebService
//@SOAPBinding(style = Style.RPC)
public interface PersonList_WS_I {

	Person getPerson(int i); 

	Person[] getPersonList();

}