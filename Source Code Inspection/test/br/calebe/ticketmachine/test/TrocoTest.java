package br.calebe.ticketmachine.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import br.calebe.ticketmachine.core.Troco;

public class TrocoTest {
  @Test
  public void instantiateClassTest() {
    Troco pm = new Troco(1);
    assertEquals(Troco.class, pm.getClass());
  }
  @Test
  public void getValorSuccessTest() {
    Troco pm = new Troco(1);
    // assertEquals(2, pm.getIterator());
  }
  
//   @Test
//   public void getValorErrorTest() {
//     Troco pm = new Troco(1);
//     assertNotEquals(1, pm.getValor());
//   }
  
//   @Test
//   public void getQuantidadeSuccessTest() {
//     PapelMoeda pm = new PapelMoeda(3, 1);
//     assertEquals(1, pm.getQuantidade());
//   }

//   @Test
//   public void getQuantidadeErrorTest() {
//     PapelMoeda pm = new PapelMoeda(4, 5);
//     assertNotEquals(3, pm.getQuantidade());
//   }
}