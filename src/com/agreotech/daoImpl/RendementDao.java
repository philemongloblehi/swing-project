package com.agreotech.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.agreotech.dao.IRendementDao;
import com.agreotech.domaine.Rendement;

public class RendementDao implements IRendementDao {
	
	private String saveQuery = "INSERT INTO rendement(designation, annee, recolte) VALUES(?, ?, ?)";
	private String updateQuery ="UPDATE rendement SET designation = ?, annee = ?, recolte = ? WHERE id = ?";
	private String deleteQuery = "DELETE FROM rendement WHERE id = ?";
	private String readOneQuery ="SELECT * FROM rendement WHERE id = ?";
	private String readAllQuery ="SELECT * FROM rendement";
	
	PreparedStatement ps;
	Connection conn = Singleton.getConnection();

	@Override
	public boolean save(Rendement t) {
		int retour = -1;
		try {
			ps = conn.prepareStatement(saveQuery);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getAnnee());
			ps.setDouble(3, t.getRecolte());
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retour > 0;
	}

	@Override
	public boolean update(Rendement t) {
		int retour = -1;
		try {
			ps = conn.prepareStatement(updateQuery);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getAnnee());
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
	public Rendement readOne(Integer id) {
		Rendement rendement = null;
		try {
			ps = conn.prepareStatement(readOneQuery);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				rendement = new Rendement();
				rendement.setId(rs.getInt("id"));
				rendement.setDesignation(rs.getString("designation"));
				rendement.setAnnee(rs.getString("annee"));
				rendement.setRecolte(rs.getDouble("recolte"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rendement;
	}

	@Override
	public List<Rendement> readAll() {
		List<Rendement> listRendements = new LinkedList<>();
		Rendement rendement = null;
		try {
			ps = conn.prepareStatement(readAllQuery);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				rendement = new Rendement();
				rendement.setId(rs.getInt("id"));
				rendement.setDesignation(rs.getString("designation"));
				rendement.setAnnee(rs.getString("annee"));
				rendement.setRecolte(rs.getDouble("recolte"));
				
				listRendements.add(rendement);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listRendements;
	}

}
