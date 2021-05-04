package mediatorandsingleton;

public class OnlineChatUser extends CommonUser {

	public OnlineChatUser(CommonMessageMediator commonMediator, String username) {
		super(commonMediator, username);
		commonMediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.username + " posted: " + message);
		this.commonMediator.sendMessage(message, this);

	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.username + " received: " + message);

	}

}
