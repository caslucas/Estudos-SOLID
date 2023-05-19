package dependency_inversion_principle.pagamento;

import dependency_inversion_principle.enums.DataBase;
import dependency_inversion_principle.factory.ProdutoDBFactory;
import dependency_inversion_principle.interfaces.IProdutoDB;

public class Pagamento {

    public void pagar(String idProduto){
        IProdutoDB produtoDB = ProdutoDBFactory.criar(DataBase.MONGODB);
        String produto = produtoDB.getIdProduto(idProduto);
        System.out.println(produto);
    }
}
