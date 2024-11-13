package ConsumerInterface;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
public class ConsumerRunner {
	public static void main(String[] args) {
		Consumer c1=(n)->{System.out.println("HELLO " +n);};
		c1.accept("hai");
		Consumer c2=(n)->{System.out.println("BYE "+n);};
		c2.accept(100);
		BiConsumer c3=(x,y)->{System.out.println("sum :"+x+y);};
		c3.accept("hello", 100);
		BiConsumer<Integer,Integer> c4=(x,y)->{System.out.println("sum of "+x+" and "+y+" is = " +(x+y));};
		c4.accept(10, 8);
		
		}
		
		}
	

