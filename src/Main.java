import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) throws SQLException {
		
		System.out.println("---BEM-VINDO---\n1 - Criar Tablespace\n2 - Criar Utilizador\n");
		switch (1) {
		case 1:
			OracleConnection oc = new OracleConnection();
			Set s = new Set();
			oc.getOracleConnection();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Qual é o nome do seu Tablespace?\n");
			String name = sc.nextLine();
			System.out.println("Qual é o espaço do seu Tablespace?\n");
			int size = sc.nextInt();
			s.createTablespace(name, size);
			oc.grant();
			while(sc.nextInt() != 0) {
				System.out.println("Qual é o seu Username?\n");
				String username = sc.nextLine();
				s.createUser(username);
				System.out.println("Deseja criar outro Utilizador?\n");
				sc.nextInt();
			}
			sc.close();
		}
	}
	
}
