package sk.train;

import javax.ejb.Remote;

@Remote
public interface KontoVerwaltungRemote {
	
	public void transferMoney(int accountNumber, float amount);
	public Konto[] getKonten();

}
