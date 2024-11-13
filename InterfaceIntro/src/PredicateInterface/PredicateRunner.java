package PredicateInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateRunner {
	public static void main(String[] args) {
		
	
	Predicate<Integer>p1=(n)->n==10;;
	System.out.println(p1.test(100));//false
	Predicate<String>p2=(n)->n=="hello....";;
	System.out.println(p2.test("hello...."));//true
	
	
	BiPredicate<Integer,Integer>p3=(x,y)->x>=20 && y>10;;
	System.out.println(p3.test(22, 11));//true
	System.out.println(p3.test(8, 11));//false
	
	BiPredicate<Integer,String>p4=(x,y)->x>=20 && y=="hi";;
	System.out.println(p4.test(22, "hi"));//true
	System.out.println(p4.test(8, "hi"));//false
	
	Predicate<Integer>m=(n)->n==10;
	System.out.println(m.test(10));
	
	
}
}
