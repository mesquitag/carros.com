package Dao;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.carros.Dao.CarroDao;
import com.carros.Models.Carro;

public class CarroDaoTest {
	
	public CarroDaoTest(){}
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void casoDeTeste03_cadastroDeCarro() {
		System.out.println("Executando caso de teste CT-03");
		System.out.println("Testando inclusão do carro no banco!");
		Carro parametro = new Carro();
		
		parametro.setMarca("Honda");
		parametro.setModelo("Civic");
		parametro.setAno("2009/2010");
		parametro.setPlaca("NQP-1234");
		//parametro.setImage(multiparts);
		
		CarroDao instancia = new CarroDao();
		instancia.salvar(parametro);
		
		Assert.assertEquals("NQP-1234", parametro.getPlaca());
		
				
	}

}
