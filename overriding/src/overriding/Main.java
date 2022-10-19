package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager [] krediManagers = new BaseCreditManager[] 
				{new TeacherCreditManager(), new TarimKrediManager(), new OgrenciCreditManager()};
		
		for (BaseCreditManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000)); 
		}

	}

}
