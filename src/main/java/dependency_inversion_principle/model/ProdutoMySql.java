package dependency_inversion_principle.model;

import dependency_inversion_principle.interfaces.IProdutoDB;

public class ProdutoMySql implements IProdutoDB {

    public String getIdProduto(String idProduto){
        return "MySql: Exibindo dados do Produto: " + idProduto;
    }
}
