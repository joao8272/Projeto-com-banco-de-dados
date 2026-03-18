package model_Dao;

import model_entities.Seller;
import model_entities.Department;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Seller> findAll();
}
