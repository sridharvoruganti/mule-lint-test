package com.test;

import java.sql.ResultSet;
import java.sql.Statement;

public class example {

	// Function to serialize an object and write it to a file

	public static void SerializeToFile(Object obj, String filename) {

		/*
		 * // Get username from parameters String username =
		 * request.getParameter("username"); // Create a statement from database
		 * connection Statement statement = connection.createStatement();
		 */
		// Create unsafe query by concatenating user defined data with query string
		String username = "";
		String query = "SELECT secret FROM Users WHERE (username = '" + username + "' AND NOT role = 'admin')";
		// ... OR ...
		// Insecurely format the query string using user defined data
		String query2 = String.format("SELECT secret FROM Users WHERE (username = '%s' AND NOT role = 'admin')",
				username);
		// Execute query and return the results
		//ResultSet result = statement.executeQuery(query);

	}
}