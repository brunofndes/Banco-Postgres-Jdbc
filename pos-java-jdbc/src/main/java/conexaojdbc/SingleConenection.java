package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConenection {

		private static String url = "jdbc:postgresql://localhost:5433/posjava";
		private static String password = "admin";
		private static String user = "postgres";
		private static Connection connection = null;
		private static String driveSql = "org.postgresql.Driver";
		
		static {
			conectar();
		}
		
		public SingleConenection() {
			 conectar();
		}
		
		private static void conectar() {
			try {
				if(connection == null) {
					Class.forName(driveSql);
					connection = DriverManager.getConnection(url, user, password);
					connection.setAutoCommit(false);
					System.out.println("Conectado com sucesso");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getConnection() {
			return connection;
		}
		
		
}
