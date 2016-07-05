package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {
	
	ArrayList<String> paises;
	static final String ITALIA = "Italia";
	static final String ALEMANIA = "Alemania";
	static final String FRANCIA = "Francia";
	
	

	@Test
	public void test() {
		
		
		assertNull(paises);
		paises = new ArrayList<String>();
		
		assertTrue( paises.isEmpty() );
		assertEquals(0,paises.size());
		
		paises.add(ALEMANIA);
		paises.add(ITALIA);
		paises.add(FRANCIA);
		paises.add(FRANCIA);
		
		assertEquals(4, paises.size());
		
		assertEquals(ALEMANIA, paises.get(0));
		assertEquals(ITALIA, paises.get(1));
		assertEquals(FRANCIA, paises.get(2));
		assertEquals(FRANCIA, paises.get(3));
		
		/**
		
		assertEquals(2, paises.indexOf(FRANCIA));
		assertEquals(-1,paises.indexOf("irak"));
		
		paises.remove(paises.size()-1);
		paises.remove(paises.size()-1);
		*/
		
		
	}
		

}
