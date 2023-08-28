package task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplyTest {
	
	private Multiply multiply;
	@BeforeEach
	public void setUp() {
		multiply = new Multiply();
	}
	@Test
	public void testMultiply() {
		assertEquals(-4,
				multiply.multiplyWithoutAsterisk (-2, 2));
	}
}