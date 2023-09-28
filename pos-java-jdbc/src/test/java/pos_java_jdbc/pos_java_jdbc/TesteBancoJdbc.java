package pos_java_jdbc.pos_java_jdbc;




import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConenection;
import dao.UserPosDao;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;


public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		
		
		userposjava.setNome("Brendo Nogueira");
		userposjava.setEmail("brendo@teste.com");
		
		userPosDao.salvar(userposjava);
		
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
			Userposjava userposjava = dao.buscar(1L);
			
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
			objetoBanco.setNome("OUTRO NOME");
			
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initDeletar() {
		try {
			UserPosDao dao = new UserPosDao();
			dao.deletar(3L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initTelefone() {
		UserPosDao dao = new UserPosDao();
		Telefone telefone = new Telefone();
		
		
		telefone.setNumero("799999123");
		telefone.setTipo("iphone");
		telefone.setUsuario(11L);
		
		dao.salvarTelefone(telefone);
		
	}
	
	@Test
	public void carregarFoneUser() {
		
		UserPosDao dao = new UserPosDao();
		
		List<BeanUserFone> beanUserFones = dao.listaUserFone(11L);
		
		for (BeanUserFone beanUserFone : beanUserFones) {
			System.out.println(beanUserFone);
			System.out.println("------------------------------------------------");
		}
		
	}
	
	@Test
	public void deleteUserFone() {
		try {
			UserPosDao dao = new UserPosDao();
			dao.deleteFonePorUser(11L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
