/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcto_ejemplo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class MasGrandeTest {

    public MasGrandeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /*Test para 1 dato*/
    @Test
    public void testCardinalidadUnDato() {
        System.out.println("Comprueba si el resultado es 2 para cuando el array tiene un único valor y es 2");
        int[] a = {2};
        int expResult = 2;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }

    /*Test para varios datos positivos*/
    @Test
    public void testCardinalidadVariosDatos() {
        System.out.println("Comprueba si el resultado es 6 para cuando el array tiene un varios valores [1, 3, 6]");
        int[] a = {1, 3, 6};
        int expResult = 6;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }

    /*Test para varios datos con orden cambiado*/
    @Test
    public void testCardinalidadVariosDatosOrden() {
        System.out.println("Comprueba si el resultado es 6 para cuando el array tiene un varios valores en distinto orden [1, 6, 2]");
        int[] a = {1, 6, 3};
        int expResult = 6;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }

    /*Test para un array vacio*/
    @Test
    public void testCardinalidadMaxArrayVacio() {
        System.out.println("Comprueba si es 0 cuando el array esta vacio.");
        int[] a = {};
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }

    /*Test para array nulo*/
    @Test
    public void testExistenciaMaxArrayNulo() {
        System.out.println("Comprueba si es -1 cuando el array es nulo.");
        int[] a = null;
        int expResult = -99;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }

    /*Test para array de datos con algunos negativos*/
    @Test
    public void testRangoVariosDatosNegativos() {
        System.out.println("Comprueba si el resultado es 3 para cuando el array tiene un varios valores y alguno es negativo [-4, 2, 3]");
        int[] a = {-4, 2, 3};
        int expResult = 3;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }

    /*Test para array de datos negativos*/
    @Test
    public void testRangoDatosNegativos() {
        System.out.println("Comprueba si el resultado es -2 para cuando el array es de números negativos [-2, -3, -6]");
        int[] a = {-2, -3, -6};
        int expResult = -2;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
}
