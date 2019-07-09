package eu.ensup.formulaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.formulaire.domaine.Salarie;

public class Login {

	public static List<Salarie> loginSalarie(String login, String pwd) {

		List<Salarie> listSalarie = new ArrayList();
		// take a list to store the values which are in db
		try {
			Connection con = AccesBd.seConnecter();
			PreparedStatement ps = con.prepareStatement("select * from salarie where id=? and password=?");
			ps.setString(1, login);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Salarie salarie = new Salarie();
				// salarie.setId(rs.getString("idPersonne"));
				salarie.setId(rs.getInt("id"));
				salarie.setPassword(rs.getString("password"));
				listSalarie.add(salarie);
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return listSalarie;

	}
}
