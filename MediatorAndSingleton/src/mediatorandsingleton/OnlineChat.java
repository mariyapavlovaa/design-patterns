package mediatorandsingleton;

import java.util.ArrayList;
import java.util.List;

public class OnlineChat implements CommonMessageMediator {

	private List<CommonUser> users;
	private Bot bot;

	public OnlineChat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, CommonUser commonUser) {

		if (message.equals("add bot") && bot == null) {
			bot = Bot.getInstanceOfBot();
			for (CommonUser currentUser : this.users) {

				if (currentUser != commonUser) {
					currentUser.receiveMessage(message);
				}

			}
		} else if (message.equals("cat") && bot != null) {
			users.remove(commonUser);
			System.out.println(commonUser.username + " has been removed from the Online Chat!");

			for (CommonUser currentUser : this.users) {

				if (currentUser != commonUser) {
					currentUser.receiveMessage("The word cat is forbiden!"); // !
				}

			}

		} else {
			for (CommonUser currentUser : this.users) {

				if (currentUser != commonUser) {
					currentUser.receiveMessage(message);
				}

			}
		}

	}

	@Override
	public void addUser(CommonUser commonUser) {
		this.users.add(commonUser);

	}

}
