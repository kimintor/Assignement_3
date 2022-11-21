package Persistance;

import model.Animal;

import java.sql.SQLException;
import java.util.List;

public interface IAnimalDao {


    public Animal save(Animal a) throws SQLException;

    public Animal getByRegNumber(long regNumber) throws SQLException;

    public List<Animal> getAll() throws SQLException;
}
