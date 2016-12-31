package com.ricks.security;

public class UserAuthorization {
	public static boolean isUserAuthorized(String role) {
		if (role!=null &&role.equals("Admin User")) {
			return true;
		}
		return false;
	}

}
