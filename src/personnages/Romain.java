package personnages;



import objets.Equipement;

public class Romain {

	private String nom;
	private int force;
	private Equipement [] equipements = new Equipement[2];
	private int nbEquipement = 0 ;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		System.out.println("Force Romain Positf : " + this.isIvariantVerified());
		
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {

		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		
		int forceInitiale = this.force;
		
		// Prés condition forceCoup doit etre positif
		if(force>0) {
			
		this.force = this.force - forceCoup;

		if (this.force < 1) {
			this.parler("j'abandonne !");

		} else {

			this.parler("Aie");

		}
		
		}
		
		// Postcondition Force diminue
		
		if(this.force < forceCoup) {
			System.out.println("La force du Romain " + this.nom + " a diminuée.");
			
		}else {
			System.out.println("La force du Romain " + this.nom + " n'a pas diminuée.");
		}
		
		
		System.out.println("Force Romain Positf : " + this.isIvariantVerified());
	}
	

	public boolean isIvariantVerified() {
			return this.force == 0 || this.force>0 ;	
	}
	
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2: 
			System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
			break ;
		case 1 : 
			comparerEtAffecter(nbEquipement, equipement);
			break ;
		case 0 : 
			comparerEtAffecter(nbEquipement, equipement);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + nbEquipement);
		}
	}
	
	
	private void comparerEtAffecter(int position, Equipement equipement) {
		Equipement test = this.equipements[0];
		if(test == equipement) {
			System.out.println("Le soldat " + this.getNom() + " possede déjà un " + equipement.toString() + ".");
		}else {
			this.equipements[position] = equipement ;
			System.out.println("Le soldat " + this.getNom() + " s'équippe avec un " + equipement.toString() + ".");
			this.nbEquipement ++;
		}
	}
	
	public static void main(String [] args) {
		
		Romain minus = new Romain("Minus", 6); 
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		 
		
	}
	
}