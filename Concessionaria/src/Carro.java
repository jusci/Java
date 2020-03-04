import org.junit.Assert;
import org.junit.Test;



public class Carro {
	

	
	  Veiculo c = new Veiculo("Carro","SEDAN","Prata",'r',176.00);
	  
	  @Test

	    public void test () {
	        c.status();
	        c.calcularVelocidade();
	        Assert.assertEquals(c.getTipo(), "Carro");

	    }
		
	}
	
	