package sk.train;

import java.io.Serializable;

public class Konto implements Serializable// Konto
{
    private float balance; // Kontostand

    public void setBalance(float balance)
    {
        this.balance = balance;
    }

    public float getBalance()
    {
        return balance;
    }

	@Override
	public String toString() {
		return "Konto [balance=" + balance + "]";
	}
    
    
}