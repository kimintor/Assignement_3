package Persistance;

import model.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AnimalDao implements IAnimalDao{


    private static AnimalDao instance;



    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","dragon93");
    }
    private AnimalDao()throws SQLException{
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static synchronized AnimalDao getInstance() throws SQLException{
        if (instance==null){
            instance= new AnimalDao();
        }
        return instance;
    }

//sqls
    private String insertAnimalSql = "insert into assignment_db.animal (reg_number, date_of_arrival, weight, origin, species)"
            +"VAlUES(?,?,?,?,?)";
    private String getByRegNumberSql = "select * from assignment_db.animal where reg_number = ?";

    private String getAllAnimalsSql = "select distinct * from assignment_db.animal";

    @Override
    public Animal save(Animal a) throws SQLException {
        Connection connection = getConnection();
        try {
            PreparedStatement stmt = connection.prepareStatement(insertAnimalSql);
            stmt.setLong(1,a.getRegNumber());
            String dateString = a.getArrivalDate().getYear()+"-"+a.getArrivalDate().getMonth()+"-"+a.getArrivalDate().getDay();
            System.out.println(dateString);
            Date date = Date.valueOf(dateString);
            stmt.setDate(2,date);
            stmt.setDouble(3,a.getWeight());
            stmt.setString(4,a.getOrigin());
            stmt.setString(5,a.getSpecies());

            stmt.executeUpdate();


        }finally {
            connection.close();
        }
        return a;
    }

    @Override
    public Animal getByRegNumber(long regNumber) throws SQLException {
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(getByRegNumberSql);
            statement.setInt(1,(int) regNumber);
            ResultSet resultSet = statement.executeQuery();
            Animal result = new Animal();
            while (resultSet.next()) {
                System.out.println("in dao get by reg number "+regNumber);
                int regNo = resultSet.getInt("reg_number");
                Date sqlDate = resultSet.getDate("date_of_arrival");
                Double weigth = resultSet.getDouble("weight");
                String origin = resultSet.getString("origin");
                String species = resultSet.getString("species");
                String date = ""+sqlDate;
                model.Date modelDate = new model.Date(date);


                result = new Animal(modelDate,weigth,regNo,origin,species);



            }
            System.out.println("animal with reg number ret::"+ result.getRegNumber());
            return result;

        }finally {
            connection.close();
        }
    }

    @Override
    public List<Animal> getAll() throws SQLException {
        Connection connection = getConnection();
        List<Animal> result = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(getAllAnimalsSql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int regNo = resultSet.getInt("reg_number");
                Date sqlDate = resultSet.getDate("date_of_arrival");
                Double weigth = resultSet.getDouble("weight");
                String origin = resultSet.getString("origin");
                String species = resultSet.getString("species");
                String date = ""+sqlDate;
                model.Date modelDate = new model.Date(date);

                Animal animal = new Animal(modelDate,weigth,regNo,origin,species);


                Animal a = new Animal(modelDate,weigth,regNo,origin);
                result.add(a);
                System.out.println("animal added with id :"+a.getRegNumber());
            }
            return result;
        }finally {
           // connection.close();
        }
    }
}
