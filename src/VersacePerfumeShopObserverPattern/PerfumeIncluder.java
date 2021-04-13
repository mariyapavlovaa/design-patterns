package VersacePerfumeShopObserverPattern;

public class PerfumeIncluder implements ItemObserverModel {

	private String name;
	private ItemObservableModel perfume;

	public PerfumeIncluder(String name) {
		this.setName(name);
	}

	@Override
	public void updateItemObserver() {

		if (perfume == null) {
			System.out.println(this.getName() + "perfume is not on sale!");
			return;
		}

		String lastPerfume = perfume.getUpdate();
		System.out.println(this.getName() + " icludes the parfume " + lastPerfume);
	}

	@Override
	public void setPerfume(ItemObservableModel perfume) {
		this.perfume = perfume;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
