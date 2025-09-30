package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;
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

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.toString());

	}

}
