package uf2181;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class FuncionesDGTTests {

	private static FuncionesDGT funcionesDGT;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funcionesDGT = new FuncionesDGT();
	}
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void mediaPuntosTest() {
	int v[] = {2,4,6,8};
	int v2[] = {5,5,5,5};
	int v3 [] = new int [0];
	int[] v4 = {-2, 2, -2, 2};
	assertEquals(5, funcionesDGT.mediaPuntos(v));
	
	assertNotEquals(3, funcionesDGT.mediaPuntos(v));
	
	assertEquals(5, funcionesDGT.mediaPuntos(v2));
	
	assertNotEquals(7, funcionesDGT.mediaPuntos(v2));
	
	assertThrows(ArrayIndexOutOfBoundsException.class, ()-> funcionesDGT.mediaPuntos(v3));
	
	assertEquals(0, funcionesDGT.mediaPuntos(v4));
	}

	
	@Test
	void maximaTasaPermitidaTest() {
		
		assertEquals(0.25, funcionesDGT.maximaTasaPermitida("General", true));
		assertNotEquals(0.25, funcionesDGT.maximaTasaPermitida("General", false));
		assertNotEquals(0.251, funcionesDGT.maximaTasaPermitida("General", true));
		
		
		assertEquals(0.5, funcionesDGT.maximaTasaPermitida("General", false));
		assertNotEquals(0.5, funcionesDGT.maximaTasaPermitida("General", true));
		assertNotEquals(0.55, funcionesDGT.maximaTasaPermitida("General", true));
		
		
		assertEquals(0.15, funcionesDGT.maximaTasaPermitida("Novel", true));
		assertNotEquals(0.15, funcionesDGT.maximaTasaPermitida("Novel", false));
		assertNotEquals(0.155, funcionesDGT.maximaTasaPermitida("Novel", true));
		
		assertEquals(0.3, funcionesDGT.maximaTasaPermitida("Novel", false));
		assertNotEquals(0.3, funcionesDGT.maximaTasaPermitida("Novel", true));
		assertNotEquals(0.333, funcionesDGT.maximaTasaPermitida("Novel", true));
	}

	

}
