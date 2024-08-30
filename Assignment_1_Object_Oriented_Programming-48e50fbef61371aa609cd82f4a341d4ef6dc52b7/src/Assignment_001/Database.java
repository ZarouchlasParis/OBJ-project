package Assignment_001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
/*
    Keeps the connection to the database and runs the neccessar queries
    Uses a MYsql database with a local host
 */


public class Database {
/*
    Connects to the database and displays the questions there
 */
    private Connection connect;
    private ArrayList<Observe> observers;
    private String username;

    public Database(){
        observers = new ArrayList<>();
    }
    public void connect_to(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("http://localhost/phpmyadmin/index.php?route=/server/databases");
        } catch (ClassNotFoundException e) {
            error(new Date() + ", " + getClass().getSimpleName() + ", " + e.getMessage() );
            connect = null;
        } catch (SQLException e) {
            error(new Date() + ", " +getClass().getSimpleName() + ", " + e.getMessage());
            connect = null;
        }

    }
    public void getErrorObserver(Observe obz) {
        observers.add(obz);
    }
    public void error(String message) {
        for(Observe e : observers){
            e.error(message);
        }
        }

}
