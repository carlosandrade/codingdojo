import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzPlazzTest {

@Test
public  void test1() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(1), "1"); 
}

@Test
public  void test2() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(2), "1,2"); 
}

@Test
public  void test3() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(3), "1,2,Fizz"); 
}

@Test
public  void test4() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(4), "1,2,Fizz,4"); 
}

@Test
public  void test5() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(5), "1,2,Fizz,4,Buzz"); 
}

@Test
public  void test6() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(6), "1,2,Fizz,4,Buzz,Fizz"); 
}
}
