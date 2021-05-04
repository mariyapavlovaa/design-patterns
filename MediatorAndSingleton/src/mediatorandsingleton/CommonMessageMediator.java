package mediatorandsingleton;

public interface CommonMessageMediator {

	void sendMessage(String message, CommonUser commonUser);

	void addUser(CommonUser commonUser);

}
