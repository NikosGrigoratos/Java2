
package db;

import basics.Group;
import basics.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public  class Database {
    static Connection connection = null;
    public static void init(){
        if (connection==null){
            System.out.println("------Oracle JDBC Connection Testing..-----");
        }
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            }catch(ClassNotFoundException e){
                System.out.println("Driver not found");
                e.printStackTrace();
                return;
            }
            System.out.println("Oracle JDBC Driver registered");
            try{
                String url="jdbc:oracle:thin:@oracle12c.hua.gr:1521/orcl";
                String user="it217113";
                String pass="it217113";
                connection=DriverManager.getConnection(url, user, pass);
            }catch(SQLException e){
                System.out.println("Connection Failed!! Check Output Console!");
                e.printStackTrace();
                return;
            }
        if (connection!=null){
            System.out.println("Connected!");
        }else{
            System.out.println("Failed to make connection");
            
        }
        
    }
    
    public static void CreatePersonTable() throws SQLException {
        PreparedStatement prepstate = null;
        String sql = "CREATE TABLE PERSONS " +
                   "(id VARCHAR(1000), " +
                   " name VARCHAR(1000), " + 
                   " gender VARCHAR(1000), " + 
                   " country VARCHAR(1000), " + 
                   " cities VARCHAR(1000), " +
                   " birthdate VARCHAR(1000), " +
                   " deathdate VARCHAR(1000), " +
                   " alliases VARCHAR(1000), " +
                   " tags VARCHAR(1000)) ";
                
        
        prepstate=connection.prepareStatement(sql);
        prepstate.executeUpdate();
        
        System.out.println("Table has been created");

    }
    
    public static void CreateGroupTable() throws SQLException {
        PreparedStatement prepstate = null;
        String sql = "CREATE TABLE BANDS " +
                   "(id VARCHAR(1000), " +
                   " name VARCHAR(1000), " + 
                   " country VARCHAR(1000), " + 
                   " cities VARCHAR(1000), " +
                   " begindate VARCHAR(1000), " +
                   " enddate VARCHAR(1000), " +
                   " alliases VARCHAR(1000), " +
                   " tags VARCHAR(1000), " +
                   " members VARCHAR(1000))";
                  
        
        prepstate=connection.prepareStatement(sql);
        prepstate.executeUpdate();
        
        System.out.println("Table has been created");
    }
    
    public static void addGroupToDB(Group group) throws SQLException{
        String sqlq="INSERT INTO BANDS"
                +"(id,name,country,cities,begindate,enddate,alliases,tags,members) VALUES"
                +"(?,?,?,?,?,?,?,?,?)";
        PreparedStatement insertPrepState=connection.prepareStatement(sqlq);
        insertPrepState.setString(1, group.getId());
        insertPrepState.setString(2, group.getName());
        insertPrepState.setString(3, group.getCountry());
        insertPrepState.setString(4, group.getCities());
        insertPrepState.setString(5, group.getBeginDate());
        insertPrepState.setString(6, group.getEndDate());
        insertPrepState.setString(7, group.getAliases().toString());       
        insertPrepState.setString(8, group.getTags().toString());
        insertPrepState.setString(9, null);

        insertPrepState.executeUpdate();
        System.out.println("data inserted");
    }

    public static void AddPersonToDB(Person person ) throws SQLException{
        String IDSQl="INSERT INTO PERSONS"
                +"(id,Name,Gender,Country,Cities,BirthDate,DeathDate,Alliases,Tags) VALUES"
                +"(?,?,?,?,?,?,?,?,?)";
        PreparedStatement insertPrepState=connection.prepareStatement(IDSQl);
        insertPrepState.setString(1,person.getId());
        insertPrepState.setString(2,person.getName());
        insertPrepState.setString(3,person.getGender());
        insertPrepState.setString(4,person.getCountry());
        insertPrepState.setString(5,person.getCities());
        insertPrepState.setString(6,person.getBirthDate());
        insertPrepState.setString(7,person.getDeathDate());
        insertPrepState.setString(8, person.getAliases().toString());
        insertPrepState.setString(9, person.getTags().toString());
        insertPrepState.executeUpdate();
        System.out.println("data inserted");
    }
    
    public static void getPersonsFromDb(String column ,String word) throws SQLException {
        
        String sql = "SELECT * FROM PERSONS WHERE " + column + "=" +"'"+word+"'" ;
        PreparedStatement SelPrepState=connection.prepareStatement(sql);
        ResultSet aa = SelPrepState.executeQuery(sql);
        ResultSetMetaData rsmd = aa.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (aa.next()) {
        for (int i = 1; i <= columnsNumber; i++) {
            if (i > 1) System.out.print(",  ");
            String columnValue = aa.getString(i);
            System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }
    }
    
    public static void getGroupsFromDb(String column ,String word) throws SQLException {
        
        String sql = "SELECT * FROM BANDS WHERE " + column + "=" +"'"+word+"'" ;
        PreparedStatement SelPrepState=connection.prepareStatement(sql);
        ResultSet aa = SelPrepState.executeQuery(sql);
        ResultSetMetaData rsmd = aa.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (aa.next()) {
        for (int i = 1; i <= columnsNumber; i++) {
            if (i > 1) System.out.print(",  ");
            String columnValue = aa.getString(i);
            System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }
    }
}
