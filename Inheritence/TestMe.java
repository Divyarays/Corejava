package Inheritence;

public class TestMe {
	public static void main(String[]args) {
		Circle1 c = new Circle1();
		Triangle1 t = new Triangle1();
		Rectangle2 r = new Rectangle2();
		
		c.setColor("blue");
        c.setBorderwidth(20);
        c.setRadius(20.5);
        t.setColor("Black");
        t.setBorderwidth(12);
        t.setBase(3.4);
        t.setHeight(12);
        r.setColor("Red");
        r.setBorderwidth(10);
        r.setLength(15);
        r.setWidth(20);
        
        System.out.println(c.getColor()+"\n"+c.getBorderwidth()+"\n"+c.getRadius()+"\n"+c.area());
        System.out.println(t.getColor()+"\n"+t.getBorderwidth()+"\n"+t.getHeight()+"\n"+t.getBase()+"\n"+t.area());
        System.out.println(r.getColor()+"\n"+r.getBorderwidth()+"\n"+r.getLength()+"\n"+r.getWidth()+"\n"+r.area());
        
      
        
        
		
	}

}
