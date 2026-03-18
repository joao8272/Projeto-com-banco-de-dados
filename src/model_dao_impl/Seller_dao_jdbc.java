package model_dao_impl;

import model_Dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;
import java.util.List;

public class Seller_dao_jdbc implements SellerDao {
    @Override
    public void insert(Seller obj) {

    }
    @Override
    public void update(Seller obj) {

    }
    @Override
    public void deleteById(Integer id) {

    }
    @Override
    public Department findById(Integer id) {
        return null;
    }
    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
