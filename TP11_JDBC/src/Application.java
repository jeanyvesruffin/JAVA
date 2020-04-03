import java.sql.*;

public class Application {

	public static void main(String[] args) {
		try {
			// Chargement du driver jdbc
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Création connection package java.mysql
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/db_catalogue","root","grimgo37");
			// le parametre de getConnection doit specifier les propriétés suivantes:
			// l'url composé de :
			// type de bd ==> "jdbc:mysql://"
			// la machine ==> "localhost:"
			// le port ==> "3306"
			// le nom de la base de données ==> db_catalogue
			//SUIVIT des parametres de config de la connexion composé de:
			// nom user ==> "root"
			// mot de passe ==> "grimgo37"
			// Creation objet statement
			Statement statement = connection.createStatement();
			// execution requete sql ds un resultat ==> ResultSet
			ResultSet resultSet = statement.executeQuery(
					"SELECT * "
							+ "FROM produits"
					);
			// on parcourt le resultat du retour de la requete à l'aide de while
			// avec une condition qui permet la lecture de table ligne à ligne et passe
			// a false lorque null .next()

			// ====== 1er solution (simple resultat) ======
			/* while(resultSet.next()) {
				System.out.println(resultSet.getString("nom_produit"));
			} */

			// ====== 2er solution (tous les resultats à l'aide des metaDonnées======
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			// on affiche toutes les colonnes à l'aide d'une boucle "\t" permet de faire des tabulations
			for(int i=1; i<resultSetMetaData.getColumnCount();i++) {
				System.out.print(resultSetMetaData.getColumnName(i)+"\t");
			}
			 System.out.println();
			// boucle while pour aafficher toutes les lignes
			while(resultSet.next()) {
				for(int i = 1; i<resultSetMetaData.getColumnCount();i++) {
					System.out.print(resultSet.getString(i) + "\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// Pour lever l'erreur: java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
			// Il est necessaire d'ajouter à notre application le fichier .jar du driver ici mysl.jdbc
			// "C:\ProgramData\chocolatey\lib\mysql-connector-java\tools\mysql-connector-java-8.0.15.tar"
			// copier/ coller le dans le projet puis declarer le au niveau des environnement de variable du projet

			// BUG FIX:
			// Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
			// The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
			// Voir ==> https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-usagenotes-connect-drivermanager.html
			//Bug fixe ==> java.sql.SQLException: The server time zone value 'Paris, Madrid (heure d?été)' is unrecognized 
			// or represents more than one time zone. You must configure either the server or JDBC driver (via the serverTimezone configuration property) 
			// to use a more specifc time zone value if you want to utilize time zone support.
			// Voir ==> https://mkyong.com/jdbc/java-sql-sqlexception-the-server-time-zone-value-xx-time-is-unrecognized/
			// 1er solution fonctionne 
		}

	}

}
