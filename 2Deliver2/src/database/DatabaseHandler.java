/*
This parameters are exists in case of using MySQL
 */

package database;

import java.sql.*;

public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://"
                +dbHost+":"
                +dbPort+"/"
                +dbName;
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser,dbPass);
        return dbConnection;
    }

    //Write

    //Read

    //Update

    //Delete
}
