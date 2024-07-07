package sk.train;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.ConcurrencyManagement;
import jakarta.ejb.ConcurrencyManagementType;
import jakarta.ejb.Singleton;

/**
 * Session Bean implementation class KontoVerwaltung
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class KontoVerwaltung implements KontoVerwaltungRemote {

	private Konto[] konten;

	public KontoVerwaltung() {
		super();
	}

	@PostConstruct
	public void initialize() {
		konten = new Konto[100];
		for (int i = 0; i < konten.length; i++) {
			konten[i] = new Konto();
		}
//		for (Konto k: konten) {
//			System.out.println(k);
//		};
	}

// das entspricht dem default des EJB-Containers 
//	public synchronized void transferMoney(int accountNumber, float amount)
//	public void transferMoney(int accountNumber, float amount) {
//	  float oldBalance = konten[accountNumber].getBalance(); 
//	  float newBalance = oldBalance + amount; 
//	  konten[accountNumber].setBalance(newBalance); }

	
	public void transferMoney(int accountNumber, float amount) {
		synchronized (konten[accountNumber]) {
			float oldBalance = konten[accountNumber].getBalance();
			float newBalance = oldBalance + amount;
			konten[accountNumber].setBalance(newBalance);
		}
	}
	
	public Konto[] getKonten() {
		return konten;
	}

}
