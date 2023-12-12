package br.com.infnet;

import funcoes.Funcoes;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
/** @Test
   public void testSomarValores(){
      double y = 1;
      double x = 2;
      Funcoes instance = new Funcoes();
      double expResult = 3;
      double result = instance.somarValores(y,x);
      assertEquals(expResult, result, 0);


}**/
@Test
System.out.println("Deve retornar o codigo 200");
public void testaCodigo200(){
    Funcoes i = new Funcoes();
    int retorno = Funcoes.somarValores(double x,double y,double z);
    assertEquals(200,retorno);

}
@Test
        System.out.println("Deve retornar o codigo 200");
    public void testaCodigo200() {
        Funcoes j = new Funcoes();
        int retorno = Funcoes.dividirValores( double x, double y, double z);
        assertEquals(200, retorno);
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
