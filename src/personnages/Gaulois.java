package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private village village ;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;
	}
	
	

	public void setVillage(village village) {
		this.village = village;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\" " + texte + "\"");
	}

	private String prendreParole() {

		return "Le Gaulois " + nom + " : ";
	}

	public String toString() {
		return this.getNom();
	}

	public void fraper(Romain romain) {
		System.out.println(this.nom + " envoie un grand coup  dans la machoire de " + romain.getNom());
		romain.recevoirCoup((this.force * effetPotion) / 3);
		if (this.effetPotion > 1) {
			effetPotion--;
		} else {
			effetPotion = 1;
		}
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;

	}
	
	public void sePresenter() {
		if(village == null ) {
			System.out.println("Le Gaulois " + this.nom + ": Bonjour, je m'appelle  "+ this.nom + ". je voyge de villages en villages.");
		}else if (village.getChef() == this) {
			System.out.println("Le Gaulois " + this.nom + ": Bonjour, je m'appelle  "+ this.nom + ". Je suis le chef du village "  + this.village.getNom() + ".");
		}else {
			System.out.println("Le Gaulois " + this.nom + ": Bonjour, je m'appelle  "+ this.nom + ". j'habite le village " + this.village.getNom() + ".");
		}
	}

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.toString());

	}
	
	

}
