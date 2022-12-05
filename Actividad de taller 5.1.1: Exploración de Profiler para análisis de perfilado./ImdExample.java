public class ImdExample{

    private final static String CONNECTION_URL = "jdbc:mysql://localhost:3306/IMD";

    public static Connection createConnection() trows SQLException{
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(CONNECTION_URL, "root", "root");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) throws SQLException{
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM IMD");
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }

    
}