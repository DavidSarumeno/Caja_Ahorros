/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class Controlador_ClienteTest {
    
    public Controlador_ClienteTest() {
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

    /**
     * Test of crearPersona method, of class Controlador_Cliente.
     */
    @Test
    public void testCrearPersona() {
        System.out.println("crearPersona");
        Controlador_Cliente instance = new Controlador_Cliente();
        instance.crearPersona();
    }

    /**
     * Test of buscarPersona method, of class Controlador_Cliente.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        String cedula = "";
        Controlador_Cliente instance = new Controlador_Cliente();
        String expResult = "";
        String result = instance.buscarPersona(cedula);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarPersona method, of class Controlador_Cliente.
     */
    @Test
    public void testActualizarPersona() {
        System.out.println("actualizarPersona");
        String cedula = "";
        Controlador_Cliente instance = new Controlador_Cliente();
        String expResult = "";
        String result = instance.actualizarPersona(cedula);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarPersona method, of class Controlador_Cliente.
     */
    @Test
    public void testEliminarPersona() {
        System.out.println("eliminarPersona");
        String cedula = "";
        Controlador_Cliente instance = new Controlador_Cliente();
        String expResult = "";
        String result = instance.eliminarPersona(cedula);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularEdad method, of class Controlador_Cliente.
     */
    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        Controlador_Cliente instance = new Controlador_Cliente();
        int expResult = 0;
        int result = instance.calcularEdad();
        assertEquals(expResult, result);
    }
    
}
