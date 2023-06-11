package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void testToplaNegatifVePozitifSayi() {
		//given
		int sayi1 = -99;
		int sayi2 = 100;
		//when
		int gercekSonuc = Toplama.islemYap(sayi1, sayi2);
		//then
		assertEquals(1,gercekSonuc);
	}
	@Test
	public void testToplaPozitifVePozitifSayi() {
		//given
		int sayi1 = 1;
		int sayi2 = 1;
		//when
		int gercekSonuc = Toplama.islemYap(sayi1, sayi2);
		//then
		assertEquals(2,gercekSonuc);
	}
}
