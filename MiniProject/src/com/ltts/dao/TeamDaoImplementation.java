package com.ltts.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltts.model.Team;
import com.ltts.util.DatabaseConnection;
import com.ltts.dao.TeamDao;
//import com.ltts.*;
public class TeamDaoImplementation implements TeamDao {

	static Connection con = DatabaseConnection.getConnection();

	@Override
	public int addTeam(Team tm) throws SQLException {

		String query = "insert into employee(emp_name, " + "emp_address) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, tm.getTeam_name());
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public void deleteTeam(int id) throws SQLException {
		String query = "delete from employee where emp_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public Team getTeam(int id) throws SQLException {

		String query = "select * from employee where emp_id= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setInt(1, id);
		Team tm = new Team();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			tm.setTeam_id(rs.getInt("team_id"));
			tm.setTeam_name(rs.getString("team_name"));
		}

		if (check == true) {
			return tm;
		} else
			return null;
	}

	@Override
	public List<Team> getTeams() throws SQLException {
		String query = "select * from employee";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Team> ls = new ArrayList();

		while (rs.next()) {
			Team tm = new Team();
			tm.setTeam_id(rs.getInt("emp_id"));
			tm.setTeam_name(rs.getString("emp_name"));
			ls.add(tm);
		}
		return ls;
	}

	@Override
	public void updateTeam(Team tm) throws SQLException {

		String query = "update employee set emp_name=?, " + " emp_address= ? where emp_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, tm.getTeam_name());
		ps.setInt(2, tm.getTeam_id());
		ps.executeUpdate();
	}
}
