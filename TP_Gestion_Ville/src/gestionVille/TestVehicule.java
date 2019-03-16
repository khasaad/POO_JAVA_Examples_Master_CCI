package gestionVille;

public class TestVehicule {

	public static void main(String[] args) {
		
		Vehicule v1 = new Vehicule("CC-111-II",41);
		Vehicule v2 = new Vehicule(50000,100,"VV-222-TT",5);
		//System.out.println("Nb Biens = "+Bien.getNbExemplaires()+" attendue : 2");
		//System.out.println("Nb Vehicules = "+Vehicule.getNbVehicules()+" attendue : 2");
		//System.out.println(v1.getInfo());
		System.out.println(v2.getInfo());
		//Bien bv1 = (Bien)v1;
		//System.out.println(bv1.getInfo());
		
	}

}



