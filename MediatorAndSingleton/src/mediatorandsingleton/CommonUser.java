package mediatorandsingleton;

public abstract class CommonUser {

	protected CommonMessageMediator commonMediator;
	protected String username;

	public CommonUser(CommonMessageMediator commonMediator, String username) {
		this.commonMediator = commonMediator;
		this.username = username;
	}

	public abstract void send(String message);

	public abstract void receiveMessage(String message);
}
