package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger [] loggers = new BaseLogger [] {new FileLogger(), new EmailLogger(), new ConsoleLogger(), new DatabaseLogger()};
//			logger.Log("Log Mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
