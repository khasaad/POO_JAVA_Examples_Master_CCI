package gestionVille;

public class Bien {
	private int valEuros;
	private int coutEntretienMensuel;
	private static int nbExemplaires;
	
	public Bien (){
		this.valEuros=0;
		this.coutEntretienMensuel=0;
		nbExemplaires++;
	}
	
	public Bien (int valEuros, int coutEntretienMensuel){
		this.valEuros=valEuros;
		this.coutEntretienMensuel=coutEntretienMensuel;
		nbExemplaires++;
	}
	
	/**
	 * @return the valEuros
	 */
	public int getValEuros() {
		return valEuros;
	}
	/**
	 * @param valEuros the valEuros to set
	 */
	public void setValEuros(int valEuros) {
		this.valEuros = valEuros;
	}
	/**
	 * @return the coutEntretienMensuel
	 */
	public int getCoutEntretienMensuel() {
		return coutEntretienMensuel;
	}
	/**
	 * @param coutEntretienMensuel the coutEntretienMensuel to set
	 */
	public void setCoutEntretienMensuel(int coutEntretienMensuel) {
		this.coutEntretienMensuel = coutEntretienMensuel;
	}
	
	/**
	 * @return the nbExemplaires
	 */
	public static int getNbExemplaires() {
		return nbExemplaires;
	}
	
	public String getInfo(){
		return "Bien :\n"
				+"Val en euro : "+this.getValEuros()+"\n"
				+"Cout entretien : "+this.coutEntretienMensuel;
	}
	
	
}
