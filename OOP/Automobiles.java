package OOP;

public class Automobiles {
           private String Color;
           private int Speed;
           private String Make;
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			Color = color;
		}
		public int getSpeed() {
			return Speed;
		}
		public void setSpeed(int speed) {
			Speed = speed;
		}
		public String getMake() {
			return Make;
		}
		public void setMake(String make) {
			Make = make;
		}
           public void Gear1(int i) {
        	   setSpeed(getSpeed()-i);
           }
           public void Gear2(int j) {
        	   setSpeed(getSpeed()-j);
           }
           public void Gear3(int k) {
        	   setSpeed(getSpeed()-k);
           }
           public void Gear4(int l) {
        	   setSpeed(getSpeed()-l);
           }
           
}
