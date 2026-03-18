package model_Dao;

import model_dao_impl.Seller_dao_jdbc;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new Seller_dao_jdbc();

    }
}
