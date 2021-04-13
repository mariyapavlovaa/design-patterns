package VersacePerfumeShopObserverPattern;

public interface ItemObservableModel {

	void include(ItemObserverModel itemObserver); 

	void exclude(ItemObserverModel itemObserver); 

	void notifyItemObservers();

	String getUpdate();
}
