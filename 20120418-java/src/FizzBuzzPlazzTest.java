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
	assertEquals(f.compare(2), "1, 2"); 
}
	
}
