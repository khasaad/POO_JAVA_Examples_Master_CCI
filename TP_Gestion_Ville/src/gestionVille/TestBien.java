package gestionVille;

public class TestBien {

	public static void main(String[] args) {
		
		Bien b1 = new Bien();
		//System.out.println(b1);
		System.out.println("Valeur en euro de b1 = "+b1.getValEuros());
		
		System.out.println("Nbre de Biens cr��s : "+ Bien.getNbExemplaires());
		//System.out.println("attendue : 1");
		
		Bien b2 = new Bien(10000,100);
		//System.out.println(b2);
		System.out.println("Valeur en euro de b2 = "+b2.getValEuros());
		
		System.out.println("Nbre de Biens cr��s : "+ Bien.getNbExemplaires());
		//System.out.println("attendue : 2");
		
		System.out.println("Info b1 nouvelle vesion");
		//System.out.println(b1.toString());
		System.out.println(b1);
		System.out.println("Attendue : adresse");
		
		System.out.println("Info b2 nouvelle version");
		//System.out.println(b2.toString());
		System.out.println(b2);
		System.out.println("Attendue : adresse");
		
	}

}
	
		
     