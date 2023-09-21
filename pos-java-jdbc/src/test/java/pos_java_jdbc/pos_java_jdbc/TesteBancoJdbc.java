package pos_java_jdbc.pos_java_jdbc;




import org.junit.Test;

import conexaojdbc.SingleConenection;
import dao.UserPosDao;
import model.Userposjava;


public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(4L);
		userposjava.setNome("Teste de função");
		userposjava.setEmail("teste do teste");
		
		userPosDao.salvar(userposjava);
	}
}
