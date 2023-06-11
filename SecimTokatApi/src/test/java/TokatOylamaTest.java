import static org.junit.Assert.*;

import org.junit.Test;

public class TokatOylamaTest {

    @Test
    public void testAPartiOyArttir() {
    	TokatOylama.partiOyArttir("A");

        int gercekSonuc = 1;

        assertEquals(gercekSonuc, TokatOylama.partiAOy);
    }

    @Test
    public void testBPartiOyArttir() {
    	TokatOylama.partiOyArttir("B");

        int gercekSonuc = 1;

        assertEquals(gercekSonuc, TokatOylama.partiBOy);
    }

    @Test
    public void testCPartiOyArttir() {
    	TokatOylama.partiOyArttir("C");

        int gercekSonuc = 1;

        assertEquals(gercekSonuc, TokatOylama.partiCOy);
    }

    @Test
    public void testAPartiOyAzalt() {

    	TokatOylama.partiOyAzalt("A");
        int gercekSonuc = 0;
        assertEquals(gercekSonuc, TokatOylama.partiAOy);
    }

    @Test
    public void testBPartiOyAzalt() {

    	TokatOylama.partiOyAzalt("B");
        int gercekSonuc = 0;
        assertEquals(gercekSonuc, TokatOylama.partiBOy);
    }

    @Test
    public void testCPartiOyAzalt() {

    	TokatOylama.partiOyAzalt("C");
        int gercekSonuc = 0;
        assertEquals(gercekSonuc, TokatOylama.partiCOy);
    }

   @Test
    public void testOyListele() {
	   String yeni = "A partisi oy sayısı : "  + TokatOylama.partiAOy + "B partisi oy sayısı : "  + TokatOylama.partiBOy + "C partisi oy sayısı : "  + TokatOylama.partiCOy;
	   
        String[] dizi = new String[3];
        dizi[0] = "A partisi oy sayısı : " + 0;
        dizi[1] = "B partisi oy sayısı : " + 0;
        dizi[2] = "C partisi oy sayısı : " + 0;

        String[] dizi1 = new String[3];
        String data = TokatOylama.partiOyListele();

        assertEquals(data, yeni);
    }
    
}