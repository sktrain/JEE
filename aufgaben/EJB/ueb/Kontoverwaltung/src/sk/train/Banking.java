package sk.train;

class Konto // Konto
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
}

class Kontoverwaltung
{
    private Konto[] account;

    public Kontoverwaltung()
    {
        account = new Konto[100];
        for(int i = 0; i < account.length; i++)
        {
            account[i] = new Konto();
        }
    }

    
    
    public void transferMoney(int accountNumber, float amount)
    {
        
            float oldBalance = account[accountNumber].getBalance();
            float newBalance = oldBalance + amount;
            account[accountNumber].setBalance(newBalance);
       
    }
}

class Clerk extends Thread
{
    private Kontoverwaltung bank;

    public Clerk(String name, Kontoverwaltung bank)
    {
        super(name);
        this.bank = bank;
        start();
    }

    public void run()
    {
        for(int i = 0; i < 10000; i++)
        {
            /*
             * Kontonummer einlesen; simuliert durch
             * Wahl einer Zufallszahl zwischen 0 und 99
             */
            int accountNumber = (int) (Math.random() * 100);

            /*
             * Überweisungsbetrag einlesen; simuliert durch Wahl einer
             * Zufallszahl zwischen -500 und +499
             */
            float amount = (int) (Math.random() * 1000) - 500;

            bank.transferMoney(accountNumber, amount);
            System.out.println(getName()+": Transfer von "+amount+" auf Konto " + accountNumber);
        }
    }
}

public class Banking
{
    public static void main(String[] args)
    {
        Kontoverwaltung myBank = new Kontoverwaltung();
        new Clerk("Andrea Müller", myBank);
        new Clerk("Petra Schmitt", myBank);
    }
}