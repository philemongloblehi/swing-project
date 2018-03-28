package com.agreotech.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.agreotech.dao.IEnginDao;
import com.agreotech.domaine.Engin;

public class EnginDao implements IEnginDao {
	
	private String saveQuery = "INSERT INTO engin(immatriculation, marque, consoEssenceJournaliere) VALUES(?, ?, ?) ";
	private String updateQuery = "UPDATE SET engin immatriculation=?, marque=?, consoEssenceJournaliere=? WHERE id=?";
	private String deleteQuery = "DELETE FROM engin WHERE id=?";
	private String readOneQuery = "SELECT * FROM engin WHERE id=?";
	private String readAllQuery = "SELECT * FROM engin";
	
	Connection conn = Singleton.getConnection();
	PreparedStatement ps;

	@Override
	public boolean save(Engin t) {
		int retour = -1;
		try {
			
			ps = conn.prepareStatement(saveQuery);
			ps.setString(1, t.getImmatriculation());
			ps.setString(2, t.getMarque());
			ps.setDouble(3, t.getConsoEssenceJournaliere());
			
			retour = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retour > 0;
	}

	@Override
	public boolean update(Engin t) {
		int retour = -1;
		try {
			
			ps = conn.prepareStatement(updateQuery);
			ps.setString(1, t.getImmatriculation());
			ps.setString(2, t.getMarque());
			ps.setDouble(3, t.getConsoEssenceJournaliere());
			ps.setInt(4, t.getId());
			
			retour = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retour > 0;
	}

	@Override
	public boolean delete(Integer id) {
		int retour = -1;
		try {
			ps = conn.prepareStatement(deleteQuery);
			ps.setInt(1, id);
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retour > 0;
	}

	@Override
	public Engin readOne(Integer id) {
		Engin engin = null;
		try {
			ps = conn.prepareStatement(readOneQuery);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				engin = new Engin();
				engin.setId(rs.getInt("id"));
				engin.setImmatriculation(rs.getString("immatriculation"));
				engin.setMarque(rs.getString("marque"));
				engin.setConsoEssenceJournaliere(rs.getDouble("consoEssenceJournaliere"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return engin;
	}

	@Override
	public List<Engin> readAll() {
		List<Engin> listEngins = new LinkedList<>();
		Engin engin = null;
		try {
			ps = conn.prepareStatement(readAllQuery);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				engin = new Engin();
				engin.setId(rs.getInt("id"));
				engin.setImmatriculation(rs.getString("immatriculation"));
				engin.setMarque(rs.getString("marque"));
				engin.setConsoEssenceJournaliere(rs.getDouble("consoEssenceJournaliere"));
				listEngins.add(engin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listEngins;
	}

}
