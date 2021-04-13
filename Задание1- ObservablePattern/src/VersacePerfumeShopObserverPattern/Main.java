package VersacePerfumeShopObserverPattern;

public class Main {

	public static void main(String[] args) {
		
		Perfume perfume = new Perfume();
		ItemObserverModel itemObserver1 = new PerfumeIncluder("Summer sale: ");
		ItemObserverModel itemObserver2 = new PerfumeIncluder("Winter sale: ");
		ItemObserverModel itemObserver3 = new PerfumeIncluder("August sale: ");
		
		perfume.include(itemObserver1);
		perfume.include(itemObserver2);
		perfume.include(itemObserver3);
		
		perfume.setPerfume(" Versace Eros");
		perfume.setPerfume(" Dylan Blue");
		
		

	}

}
