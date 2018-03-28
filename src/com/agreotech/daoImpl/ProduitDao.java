package com.agreotech.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.agreotech.dao.IProduitDao;
import com.agreotech.domaine.Produit;

public class ProduitDao implements IProduitDao {
	
	private String saveQuery = "INSERT INTO produit(designation, prix) VALUES(?, ?)";
	private String updateQuery = "UPDATE produit SET designation = ?, prix = ? WHERE id = ?";
	private String deleteQuery = "DELETE FROM produit WHERE id = ?";
	private String readOneQuery = "SELECT * FROM produit WHERE id = ?";
	private String readAllQuery = "SELECT * FROM produit";
	
	PreparedStatement ps;
	Connection conn = Singleton.getConnection();

	@Override
	public boolean save(Produit t) {
		int retour = -1;
		try {
			
			ps = conn.prepareStatement(saveQuery);
			ps.setString(1, t.getDesignation());
			ps.setInt(2, t.getPrix());
			
			retour = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retour > 0;
	}

	@Override
	public boolean update(Produit t) {
		int retour = -1;
		try {
			
			ps = conn.prepareStatement(updateQuery);
			ps.setString(1, t.getDesignation());
			ps.setInt(2, t.getPrix());
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
	public Produit readOne(Integer id) {
		Produit produit = null;
		try {
			
			ps = conn.prepareStatement(readOneQuery);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				produit = new Produit();
				produit.setId(rs.getInt("id"));
				produit.setDesignation(rs.getString("designation"));
				produit.setPrix(rs.getInt("prix"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produit;
	}

	@Override
	public List<Produit> readAll() {
		
		List<Produit> listProduits = new LinkedList<>();
		Produit produit = null;
		
		try {
			
			ps = conn.prepareStatement(readAllQuery);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				produit = new Produit();
				produit.setId(rs.getInt("id"));
				produit.setDesignation(rs.getString("designation"));
				produit.setPrix(rs.getInt("prix"));
				
				listProduits.add(produit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listProduits;
	}

}
