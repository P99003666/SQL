package com.ltts.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltts.model.Player;
import com.ltts.util.DatabaseConnection;
//import com.ltts.*;
public class PlayerDaoImplementation implements PlayerDao {

	static Connection con = DatabaseConnection.getConnection();

//	@Override
//	public int add(Player pl) throws SQLException {
//
//		String query = "insert into players(player_name, " + "player_address, " + "player_numberOfMatches, " + "wickets, " + "skill, "+" dateOfBirth) VALUES (?, ?, ?, ?, ?, ?)";
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setString(1, pl.getPlayer_name());
//		ps.setString(2, pl.getPlayer_address());
//		ps.setInt(3, pl.getPlayer_numberOfMatches());
//		ps.setInt(4, pl.getWickets());
//		ps.setString(5, pl.getSkill());
//		ps.setDate(6, pl.getDateOfBirth());
//		int n = ps.executeUpdate();
//		return n;
//	}
	@Override
	public int add(Player pl) throws SQLException {

		String query = "insert into PLAYERS(player_name, " + "player_address, " + "player_numberOfMatches, " + "wickets, " + "skill, " + " dateOfBirth, "+" teamId) VALUES (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, pl.getPlayer_name());
		ps.setString(2, pl.getPlayer_address());
		ps.setInt(3, pl.getPlayer_numberOfMatches());
		ps.setInt(4, pl.getWickets());
		ps.setString(5, pl.getSkill());
		ps.setDate(6, pl.getDateOfBirth());
		ps.setInt(7, pl.getTeamId());
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public void delete(int id) throws SQLException {
		String query = "delete from PLAYERS where player_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	
	@Override
	public Player getPlayer(int id) throws SQLException {

		String query = "select * from PLAYERS where player_id= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setInt(1, id);
		Player pl = new Player();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			pl.setPlayer_id(rs.getInt("player_id"));
			pl.setPlayer_name(rs.getString("player_name"));
			pl.setPlayer_address(rs.getString("player_address"));
			pl.setPlayer_numberOfMatches(rs.getInt("player_numberOfMatches"));
			pl.setWickets(rs.getInt("wickets"));
			pl.setSkill(rs.getString("skill"));
			pl.setTeamId(rs.getInt("teamId"));
			
		}

		if (check == true) {
			return pl;
		} else
			return null;
	}
	public Player getPlayerByName(String name) throws SQLException {

		String query = "select * from PLAYERS where player_name= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setString(1, name);
		Player pl = new Player();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			pl.setPlayer_id(rs.getInt("player_id"));
			pl.setPlayer_name(rs.getString("player_name"));
			pl.setPlayer_address(rs.getString("player_address"));
			pl.setPlayer_numberOfMatches(rs.getInt("player_numberOfMatches"));
			pl.setWickets(rs.getInt("wickets"));
			pl.setSkill(rs.getString("skill"));
			
		}

		if (check == true) {
			return pl;
		} else
			return null;
	}
	
	public Player getPlayerBySkill(String skill) throws SQLException {

		String query = "select * from PLAYERS where skill= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setString(1, skill);
		Player pl = new Player();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			pl.setPlayer_id(rs.getInt("player_id"));
			pl.setPlayer_name(rs.getString("player_name"));
			pl.setPlayer_address(rs.getString("player_address"));
			pl.setPlayer_numberOfMatches(rs.getInt("player_numberOfMatches"));
			pl.setWickets(rs.getInt("wickets"));
			pl.setSkill(rs.getString("skill"));
			
		}

		if (check == true) {
			return pl;
		} else
			return null;
	}
	public Player getPlayerByDate(String date) throws SQLException {

		String query = "select * from PLAYERS where dateOfBirth= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setString(1, date);
		Player pl = new Player();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			pl.setPlayer_id(rs.getInt("player_id"));
			pl.setPlayer_name(rs.getString("player_name"));
			pl.setPlayer_address(rs.getString("player_address"));
			pl.setPlayer_numberOfMatches(rs.getInt("player_numberOfMatches"));
			pl.setWickets(rs.getInt("wickets"));
			pl.setSkill(rs.getString("skill"));
			
		}

		if (check == true) {
			return pl;
		} else
			return null;
	}
	@Override
	public List<Player> getPlayers() throws SQLException {
		String query = "select * from PLAYERS";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Player> ls = new ArrayList();

		while (rs.next()) {
			Player pl = new Player();
			pl.setPlayer_id(rs.getInt("player_id"));
			pl.setPlayer_name(rs.getString("player_name"));
			pl.setPlayer_address(rs.getString("player_address"));
			pl.setPlayer_numberOfMatches(rs.getInt("player_numberOfMatches"));
			pl.setWickets(rs.getInt("wickets"));
			pl.setSkill(rs.getString("skill"));
			pl.setDateOfBirth(rs.getDate("dateOfBirth"));
			ls.add(pl);
		}
		return ls;
	}

	@Override
	public void update(Player pl) throws SQLException {

		String query = "update PLAYERS set player_name= ?, " + " player_address= ?, " + " player_numberOfMatches= ?, " + " wickets = ? , " + " skill = ? where player_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, pl.getPlayer_name());
		ps.setString(2, pl.getPlayer_address());
		ps.setInt(3, pl.getPlayer_numberOfMatches());
		ps.setInt(4, pl.getWickets());
		ps.setString(5, pl.getSkill());
		ps.setInt(6, pl.getPlayer_id());
		ps.executeUpdate();
	}
}
