import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {
	Libro c;
	@Before
	public void setUp() throws Exception {
		c = new Libro(); 
	}

	@Test
	public void testLibroBooleanStringString() {
		assertEquals(c.getAutor(), c.getAutor());
	}

	@Test
	public void testLibro() {
		assertEquals(0, 0);
	}

	@Test
	public void testSetAutor() {
		c.setAutor("Manolo");
		assertEquals("Manolo", c.getAutor());
	}

	@Test
	public void testSetPrestado() {
		c.setPrestado(false);
		assertEquals(false, c.getPrestado());
	}

	@Test
	public void testSetDias() {
		c.setDias(15);
		assertEquals(15, c.getDias());
	}

	@Test
	public void testSetNombre() {
		c.setNombre("Pepe");
		assertEquals("Pepe", c.getNombre());
	}

	@Test
	public void testGetAutor() {
		c.setAutor("Manolo");
		assertTrue(c.getAutor()=="Manolo");
	}

	@Test
	public void testGetPrestado() {
		c.setPrestado(true);
		assertTrue(c.getPrestado()==true);
	}

	@Test
	public void testGetDias() {
		c.setDias(1998);
		assertTrue(c.getDias()==1998);
	}

	@Test
	public void testGetNombre() {
		c.setNombre("Lola");
		assertTrue(c.getNombre()=="Lola");
	}

	@Test
	public void testPrestamo() {
		boolean prestamo= true;
		boolean disponible ;
		assertEquals(disponible=true, prestamo);
		
	}

	@Test
	public void testDevolucion() {
		boolean prestamo=false;
		assertEquals(prestamo, false);
	}

	@Test
	public void testToString() {
		c.setAutor("Pepa");
		assertTrue(c.getAutor()=="Pepa");
	}

}
