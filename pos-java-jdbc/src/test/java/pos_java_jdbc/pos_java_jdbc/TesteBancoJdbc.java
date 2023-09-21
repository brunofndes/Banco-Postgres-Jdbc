package pos_java_jdbc.pos_java_jdbc;




import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConenection;
import dao.UserPosDao;
import model.Userposjava;


public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		
	
		
		
	}
	
	@Test
	public void initListar() {
		UserPosDao dao = new UserPosDao();
		
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("----------------------------------------------------");
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void initBuscar() {
		UserPosDao dao = new UserPosDao();
		
		try {
			Userposjava userposjava = dao.buscar(4L);
			
			System.out.println("CONSULTA POR ID "+ userposjava);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void initAtualizar() {
		
		try {
			UserPosDao dao = new UserPosDao();
			
			Userposjava objetoBanco = dao.buscar(3L);
			objetoBanco.setNome("ATUALIZADO AGORA");
			
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
