package mediatorandsingleton;

public class Bot {

	private static Bot instanceOfBot;

	private Bot() {

	}

	public static Bot getInstanceOfBot() {
		if (instanceOfBot == null) {
			instanceOfBot = new Bot();
		}

		return instanceOfBot;
	}

	public void postInfo(String info) {
		System.out.println("It has been added " + info);
	}
}
