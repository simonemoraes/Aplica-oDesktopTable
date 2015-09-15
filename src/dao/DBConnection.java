package dao;

import java.sql.*;

public class DBConnection {

    private static final String DRIVER_CLASS_MYSQL = "com.mysql.jdbc.Driver";
    private static final String URL_MYSQL = "jdbc:mysql://localhost/livros";
    private static final String USER = "simone";
    private static final String PASS = "442332si";

    /* Classe que faz a conexão com o banco de dados.*/
    public static Connection getConnection() {
        System.out.println("Conectando ao Banco de Dados");
        try {
            Class.forName(DRIVER_CLASS_MYSQL);
            return  DriverManager.getConnection(URL_MYSQL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /* Classe que faz uma execução no banco.*/
    public static void close(Connection conn, PreparedStatement pstm, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }

            if (pstm != null) {
                pstm.close();
            }

            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* Classe que prepara uma execução no banco.*/
    public static void createTable() {
        Connection connection =  getConnection();
        PreparedStatement stmt = null;
        
         String sql = "CREATE TABLE IF NOT EXISTS livros("+
         "ID INT NOT NULL AUTO_INCREMENT,"+
         "EDITORA VARCHAR(50) NOT NULL,"+
         "TITULO VARCHAR(50) NOT NULL,"+
         "ISBN VARCHAR(50) NOT NULL,"+
         "PRIMARY KEY (ID))";
         
        try {
            stmt = (PreparedStatement) connection.prepareStatement(sql);
            stmt.execute();
            System.out.println("Create Tables Ok!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, stmt, null);
        }
    }
}
