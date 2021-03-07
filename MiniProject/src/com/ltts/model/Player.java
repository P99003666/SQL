package com.ltts.model;

public class Player {

	int player_id;
	String player_name;
	String player_address;

	public Player() {
	}

	public Player(String player_name, String player_address) {
		this.player_name = player_name;
		this.player_address = player_address;
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getPlayer_address() {
		return player_address;
	}

	public void setPlayer_address(String player_address) {
		this.player_address = player_address;
	}

	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ",player_name=" + player_name + ", player_address=" + player_address + "]";
	}
}
