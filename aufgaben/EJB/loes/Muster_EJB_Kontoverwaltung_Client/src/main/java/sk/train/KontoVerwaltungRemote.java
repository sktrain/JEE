package sk.train;

import jakarta.ejb.Remote;

@Remote
public interface KontoVerwaltungRemote {
	
	public void transferMoney(int accountNumber, float amount);
	public Konto[] getKonten();

}
