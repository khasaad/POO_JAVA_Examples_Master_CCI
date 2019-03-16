/**
 * 
 */
package exo2;

/**
 * @author  Khaled SAAD
 *
 */
public class Compte {

	private int numero;
	private int solde;
	/**
	 * 
	 */
	public Compte(int no) {
		this.numero =no;
		this.solde=0;
	}
	
	public void debit(int montant) throws PasAssezArgentException {
		if(montant > this.solde)
			throw new PasAssezArgentException("Decouvert non autorisŽ");
		this.solde-=montant;
	}
	
	public void credit(int montant) throws IllegalArgumentException {
		if(montant<0)
			throw new IllegalArgumentException("Attention le montant " +
					"du crŽdit doit tre positif");
		this.solde+=montant;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

}
