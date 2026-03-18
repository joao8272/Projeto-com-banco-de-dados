package Application;

import model_Dao.DaoFactory;
import model_Dao.SellerDao;

public class Program {
    public static void main(String[] args){
        SellerDao sellerDao = DaoFactory.createSellerDao();

    }
}
