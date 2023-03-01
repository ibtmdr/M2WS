

package fr.m2i.m2ws.Notation;

import jakarta.inject.Singleton;

import java.sql.*;
import java.util.ArrayList;

@Singleton
public class CRUDNotation {

    private static Connection connection;
	public static void connection() {

		try{
			// Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecole", "root", "Ibtissam@12345");
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}

	}

	public static void disconnection(){
		try {

			connection.close();
		}catch (SQLException e){
			e.getMessage();
		}
	}

		public static void deleteNotation(int id) {

		try {


			PreparedStatement ps = connection.prepareStatement("DELETE FROM notation WHERE id = ? ");
			// pour ajouter un valur en enter de requete (premier ?)
			ps.setInt(1, id);
			// supprission de la base
			ps.executeUpdate();
			connection.commit();


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}





	public static int insertionNotation(Notation notation){
        int i = 0;
		try {

			PreparedStatement ps = connection.prepareStatement("INSERT INTO notation (nom,prenom,note) values(?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			// pour ajouter un valur en enter de requete (premier ?)
			ps.setString(1, notation.getNom());
			// pour ajouter un valur en enter de requete (deuxieme ?)
			ps.setString(2, notation.getPrenom());
			// pour ajouter un valur en enter de requete (troisieme ?)
			ps.setInt(3, notation.getNote());
			// insertion a la base
			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				i = rs.getInt(1);
			}
			connection.commit();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
        return i ;
	}





	public static ArrayList<Notation> selectNotation() {

		ArrayList<Notation> notations= new ArrayList<Notation>();

		try {

			// Porteur de requette sql
			Statement stmt = connection.createStatement();
			// Executer la requette sql , met le retour dans result state
			ResultSet resultats = stmt.executeQuery("SELECT * FROM notation");

			// lire le resultat ligne par ligne
			while(resultats.next()) {
				notations.add(new Notation(resultats.getInt(1), resultats.getString(2), resultats.getString(3), resultats.getInt(4)));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return notations;

	}
	public static Notation selectNotationParId(int id) {

		Notation notation = null;

		try {


			PreparedStatement ps = connection.prepareStatement("SELECT * FROM notation WHERE id  = ? ");
			// pour ajouter un valur en enter de requete (premier ?)
			ps.setInt(1, id);
			ResultSet resultats = ps.executeQuery();
			System.out.println("clients :");

			while(resultats.next())
				notation = new Notation(resultats.getInt(1),resultats.getString(2),resultats.getString(3),resultats.getInt(4));


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}



		return notation;

	}


	public static void updateNotation(Notation notation)  {
					
					try {
			
						
						PreparedStatement ps = connection.prepareStatement("UPDATE notation SET no, = ? , prenom= ?, note = ? WHERE id = ? ");
						// pour ajouter un valur en enter de requete (premier ?)
						ps.setString(1, notation.getNom());
						// pour ajouter un valur en enter de requete (deuxieme ?)
						ps.setString(2, notation.getPrenom());
						// pour ajouter un valur en enter de requete (deuxieme ?)
						ps.setInt(3, notation.getNote());
						// pour ajouter un valur en enter de requete (deuxieme ?)
						ps.setInt(4, notation.getId());
                        ps.executeUpdate();
						connection.commit();
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}

				}

			

			

		}



