import org.junit.Test;

import daoo.UserPosDAO;
import modell.Userposjava;

public class TesteBancoJdbc {
	
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("Marcos teste");
		userposjava.setEmail("marcos@gmail.com");
		
		
		userPosDAO.salvar(userposjava);
		                                      
	}

}
