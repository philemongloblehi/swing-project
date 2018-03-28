package com.agreotech.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.agreotech.dao.IParcelleDao;
import com.agreotech.domaine.Parcelle;

public class ParcelleDao implements IParcelleDao {
	
	private String saveQuery = "INSERT INTO parcelle(culture, observation) VALUES(?, ?)";
	private String updateQuery = "UPDATE parcelle SET culture = ?, observation = ? WHERE id = ?";
	private String deleteQuery = "DELETE FROM parcelle WHERE id = ?";
	private String readOneQuery = "SELECT * FROM parcelle WHERE id = ?";
	private String readAllQuery = "SELECT * FROM parcelle";
	
	PreparedStatement ps;
	Connection conn = Singleton.getConnection();

	@Override
	public boolean save(Parcelle t) {
		int retour = -1;
		try {
			
			ps = conn.prepareStatement(saveQuery);
			ps.setString(1, t.getCulture());
			ps.setString(2, t.getObservation());
			
			retour = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retour > 0;
	}

	@Override
	public boolean update(Parcelle t) {
		int retour = -1;
		try {
			
			ps = conn.prepareStatement(updateQuery);
			ps.setString(1, t.getCulture());
			ps.setString(2, t.getObservation());
			ps.setInt(3, t.getId());
			
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
	public Parcelle readOne(Integer id) {
		Parcelle parcelle = null;
		try {
			
			ps = conn.prepareStatement(readOneQuery);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				parcelle = new Parcelle();
				parcelle.setId(rs.getInt("id"));
				parcelle.setCulture(rs.getString("culture"));
				parcelle.setObservation(rs.getString("observation"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return parcelle;
	}

	@Override
	public List<Parcelle> readAll() {
		
		List<Parcelle> listParcelles = new LinkedList<>();
		Parcelle parcelle = null;
		
		try {
			
			ps = conn.prepareStatement(readAllQuery);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				parcelle = new Parcelle();
				parcelle.setId(rs.getInt("id"));
				parcelle.setCulture(rs.getString("culture"));
				parcelle.setObservation("observation");
				
				listParcelles.add(parcelle);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listParcelles;
	}

}
