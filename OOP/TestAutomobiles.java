package OOP;

public class TestAutomobiles {
	public static void main(String[]args) {
		Automobiles m = new Automobiles();
		m.setColor("White");
		System.out.println(m.getColor());
		m.setMake("TATA");
		System.out.println(m.getMake());
		m.setSpeed(180);
		System.out.println(m.getSpeed());
		m.Gear1(20);
		System.out.println(m.getSpeed());
		m.Gear2(50);
		System.out.println(m.getSpeed());
		m.Gear3(80);
		System.out.println(m.getSpeed());
		m.Gear4(20);
		System.out.println(m.getSpeed());
		int Speed = 80;
		if(Speed<=20) {
			System.out.println("Change Gear");
		}else if(Speed<=50) {
			System.out.println("Change Gear1 to Gear2");
		}else if(Speed<=80) {
			System.out.println("Change Gear2 to Gear3");
			
		}else if (Speed<=120) {
			System.out.println("Change Gear3 to Gear4");
		}
		
		
		
	}

}
