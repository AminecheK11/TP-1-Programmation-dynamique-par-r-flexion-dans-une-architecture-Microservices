package dao;

public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO] Récupération de la valeur depuis la source de données...");
        return 200.0;
    }
}