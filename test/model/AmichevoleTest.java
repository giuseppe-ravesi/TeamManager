/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enzov
 */
public class AmichevoleTest {

    private Disponibilità d1;
    private Disponibilità d2;

    private String m1;

    private Amichevole a1;

    @Before
    public void setUp() {
        m1 = "Frattura al femore";

        d1 = new Disponibilità(1, 1, true, null);
        d2 = new Disponibilità(1, 2, false, m1);

        a1 =new Amichevole(LocalDate.of(2025, 7, 4),LocalTime.of(15, 30, 45),90,"Manhattan","Inter");
    }

    @After
    public void tearDown() {
        a1 = null;
    }

    /**
     * Test of getTipologia method, of class Allenamento.
     */
    @Test
    public void testAggiungiDisponibilità() {

        //verifico che all'inizio non vi siano disponibilità
        assertEquals(0, a1.getDisponibilità().size());

        //aggiungo 2 disponibilità
        a1.aggiungiDisponibilità(d1);
        a1.aggiungiDisponibilità(d2);

        //verifico che effettivamente siano state inserite
        assertEquals(2, a1.getDisponibilità().size());

        //verifico che non siano null
        assertNotNull(a1.getDisponibilità());
    }
}
