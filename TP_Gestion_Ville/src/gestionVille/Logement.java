package gestionVille;

public class Logement extends Bien {
	
	private int superficieAuSol;
	private int nbPersonnesLogees;
	private static int nbLogements=0;
	

	/**
	 * 
	 */
	public Logement(int superficieAuSol, int nbPersonnesLogees) {
		super();
		this.superficieAuSol=superficieAuSol;
		this.nbPersonnesLogees=nbPersonnesLogees;
		nbLogements++;
	}

	/**
	 * @param valEuros
	 * @param coutEntretienMensuel
	 */
	public Logement(int valEuros, int coutEntretienMensuel,int superficieAuSol, int nbPersonnesLogees) {
		super(valEuros, coutEntretienMensuel);
		this.superficieAuSol=superficieAuSol;
		this.nbPersonnesLogees=nbPersonnesLogees;
		nbLogements++;
	}

	/**
	 * @return the superficieAuSol
	 */
	public int getSuperficieAuSol() {
		return superficieAuSol;
	}

	/**
	 * @return the nbPersonnesLogees
	 */
	public int getNbPersonnesLogees() {
		return nbPersonnesLogees;
	}
	
	public int getNbLogements(){
		return nbLogements;
	}
	
	public String getInfo(){
		return "Logement "+super.getInfo()+"\n"
				+"Nb personnes Logees : "+this.getNbPersonnesLogees()+"\n"
				+"Num superficie au sol : "+this.superficieAuSol;
	}

}

