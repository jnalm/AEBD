/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aebd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luismf20
 */
public class AEBD {

    private static OracleConnection oc = new OracleConnection();
    
    public static void main(String[] args) throws SQLException {
		
		System.out.println("---BEM-VINDO---\n1 - Criar Tablespace\n2 - Criar Utilizador\n");
                
                ResultSet rs = Get.getCPU();
                
                Set.setCPU(rs);
                
                /*
		switch (1) {
		case 1:
                        
			Set s = new Set();
			Connection c = oc.getOracleConnection();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Qual é o nome do seu Tablespace?\n");
			String name = sc.next();
			System.out.println("Qual é o espaço do seu Tablespace?\n");
			int size = sc.nextInt();
			s.createTablespace(name, size);
			oc.grant();
			while(sc.nextInt() != 0) {
				System.out.println("Qual é o seu Username?\n");
				String username = sc.next();
                                System.out.println("Qual a password?\n");
				String password = sc.next();
				s.createUser(username, name, password);
				System.out.println("Deseja criar outro Utilizador?\n");
				sc.nextInt();
			}
			sc.close();
                        break;
		}*/
    }   
}
