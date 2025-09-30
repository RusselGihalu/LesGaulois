package personnages;

 

public class Druide {
	
	private String nom ;
	private int force ;
	private Chaudron chaudron ;

	public Druide(String nom, int force){
		 this.nom = nom ;
		 this.force = force ;
		 this.chaudron = new Chaudron(force, 0) ;
		 
	}
	
	public void parler(String text) {
		
		System.out.println(text);
		
	}

	public String prendreParole() {
		return "Le Druide " + this.nom ;
	}
	
	public void fabriquerPortion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
		
	}
	
	public void booster(Gaulois gaulois) {
		
		boolean contientPotion = this.chaudron.resterPotion();
		gaulois.getNom();
		
		if(contientPotion) {
			if(gaulois.getNom()=="Obélix") {
				this.parler("Non, " + gaulois.getNom() + " Non!... Et tu le sais très bien!");
			}else {
				gaulois.boirePotion(chaudron.prendreLouche());
				this.parler("Tiens " + gaulois.getNom() + "un peu de potion magique.");
			}
			
		}else {
			
			this.parler("Désolé " + gaulois.getNom() + "il n'y a plus une seule goutte de potion.");
			
		}
		
	}
	
	public String getNom() {
		return  this.nom;
	}
	
}
