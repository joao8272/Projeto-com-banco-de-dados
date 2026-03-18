package Application;

import model_Dao.DaoFactory;
import model_Dao.SellerDao;
import model_entities.Seller;

public class Program {
    public static void main(String[] args){

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
