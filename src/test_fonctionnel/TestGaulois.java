package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

 

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		 Gaulois obelix = new Gaulois("Obélix", 16); 
		 Romain minus = new Romain("Minus", 6);
		 int index = 0 ;
		 
		 asterix.parler("Bonjour Obélix.");
		 obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des singliers ?");
		 asterix.parler("Oui très bonne idée.");
		 System.out.println("Dans la foret "+ asterix.toString() + " et " + obelix.toString()+ " tombent nez à nez sur le Romain " + minus.getNom());
		 
		  
		System.out.println("------------------------\n");
		
		Romain brutus = new Romain("brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		panoramix.fabriquerPortion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		while(index<3){
			 asterix.fraper(brutus);
			 index++;
		 };
	}

}
