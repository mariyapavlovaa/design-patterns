package mediatorandsingleton;

public class MediatorMain {

	public static void main(String[] args) {
		CommonMessageMediator chat = new OnlineChat();
		CommonUser user1 = new OnlineChatUser(chat, "Dimitur");
		CommonUser user2 = new OnlineChatUser(chat, "Mariya");
		CommonUser user3 = new OnlineChatUser(chat, "Nikola");

		user2.send(" Hello, mates!");
		user1.send("add bot");
		user3.send("cat");

		Bot bot = Bot.getInstanceOfBot();
		// bot.postInfo("Bot!");

	}

}
