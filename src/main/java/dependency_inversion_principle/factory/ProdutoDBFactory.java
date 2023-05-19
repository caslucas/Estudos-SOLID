package dependency_inversion_principle.factory;

import dependency_inversion_principle.enums.DataBase;
import dependency_inversion_principle.interfaces.IProdutoDB;
import dependency_inversion_principle.model.ProdutoMongoDB;
import dependency_inversion_principle.model.ProdutoMySql;

public class ProdutoDBFactory {

    public static IProdutoDB criar(DataBase type){

        IProdutoDB produtoDB = null;
        switch (type){
            case MYSQL:
                produtoDB= new ProdutoMySql();
                break;
            case MONGODB:
                produtoDB = new ProdutoMongoDB();
            break;
        }
        return produtoDB;
    }
}
