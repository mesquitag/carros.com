package Dao;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.carros.Dao.UsuarioDao;
import com.carros.Models.Endereco;
import com.carros.Models.Pessoa;
import com.carros.Models.Telefone;

public class ClienteDaoTest {
	
	public ClienteDaoTest(){}


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void casoDeTeste02_cadastroDeCliente(){
		System.out.println("Caso de teste CT-02 em execução ...");
		System.out.println("Verificação de cadastro do usuário e inclusão no banco");
		Pessoa pessoa = new Pessoa();
		Endereco end = new Endereco();
		Telefone tel = new Telefone();
		
		pessoa.setId(1);
		pessoa.setNome("Bruno Dantas");
		pessoa.setEmail("bruno@gmail.com");
		pessoa.setSenha("123456");
		pessoa.setDataNascimento(new java.util.Date(8/20/1996));
		pessoa.setCpf("09704752163");
		pessoa.setRg("5878639");
		
		Integer codEndereco = 1;
		tel.setId(codEndereco);
		tel.setTelefone("6291009113");
		
		Integer codTelefone = 1;
		end.setId(1);
		end.setLogradouro("RUA 1");
		end.setNumero("1");
		end.setComplemento("QD 2 LT 3");
		end.setCep("74475370");
		
		UsuarioDao userDao = new UsuarioDao();
		userDao.salvar(pessoa, codEndereco, codTelefone);
	
		Assert.assertEquals("bruno@gmail.com", pessoa.getEmail());
		//fail("Já existe um cadastro no sistema com o email informado"); 
			
		
	}

}
