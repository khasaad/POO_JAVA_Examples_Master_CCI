package gestionVille;

public class Vehicule extends Bien {

	private String numeroImmatriculation;
	private int nbPlaces;
	private static int nbVehicules=0;
	
	public Vehicule(String numeroImmatriculation, int nbPlaces) {
		super();
		this.numeroImmatriculation=numeroImmatriculation;
		this.nbPlaces=nbPlaces;
		Vehicule.nbVehicules++;
	}

	public Vehicule(int valEuros, int coutEntretienMensuel,
			String numeroImmatriculation, int nbPlaces) {
		super(valEuros, coutEntretienMensuel);
		this.numeroImmatriculation=numeroImmatriculation;
		this.nbPlaces=nbPlaces;
		nbVehicules++;
	}

	/**
	 * @return the numeroImmatriculation
	 */
	public String getNumeroImmatriculation() {
		return numeroImmatriculation;
	}

	/**
	 * @return the nbPlaces
	 */
	public int getNbPlaces() {
		return nbPlaces;
	}
	
	public static int getNbVehicules(){
		return nbVehicules;
	}
	
	public String getInfo(){
		return "Vehicule "+super.getInfo()+"\n"
				+"Nb places : "+this.nbPlaces+"\n"
				+"Num immatriculation : "+this.numeroImmatriculation;
	}

}
