package VersacePerfumeShopObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Perfume implements ItemObservableModel {

	private List<ItemObserverModel> itemObservers;
	private String perfume;

	public Perfume() {
		this.itemObservers = new ArrayList<>();
	}

	@Override
	public void include(ItemObserverModel itemObserver) {
		itemObservers.add(itemObserver);
		itemObserver.setPerfume(this);

	}

	@Override
	public void exclude(ItemObserverModel itemObserver) {
		itemObservers.remove(itemObserver);

	}

	@Override
	public void notifyItemObservers() {
		for (ItemObserverModel singleItemObserver : itemObservers) {
			singleItemObserver.updateItemObserver();
		}

	}

	@Override
	public String getUpdate() {

		return this.perfume;
	}

	public void setPerfume(String newPerfume) {
		this.perfume = newPerfume;
		this.notifyItemObservers();
	}
}
