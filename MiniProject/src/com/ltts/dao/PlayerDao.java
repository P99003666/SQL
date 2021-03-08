package com.ltts.dao;

import java.sql.SQLException;
import java.util.List;

import com.ltts.model.Player;
public interface PlayerDao {

	public int add(Player pl) throws SQLException;

	public void delete(int id) throws SQLException;

	public Player getPlayer(int id) throws SQLException;

	public Player getPlayerByName(String name) throws SQLException;
	
	public Player getPlayerBySkill(String skill) throws SQLException;
	
	public Player getPlayerByDate(String date) throws SQLException;
	
	public List<Player> getPlayers() throws SQLException;

	public void update(Player pl) throws SQLException;
}
