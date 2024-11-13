package FunctionalInterface;

public class Runner {
	public static void main(String[] args) {
		Demo1 d1=()->{System.out.println("------HELLO HAI-------");};
		d1.disp();
		demo2 d2=(x,y)->{System.out.println("sum of two num is : "+(x+y));};
		d2.show(10,8);
		demo3 d3=()->{System.out.println("------BYE-------");};
		d3.display();
		
		
				
		
		
	}
}
