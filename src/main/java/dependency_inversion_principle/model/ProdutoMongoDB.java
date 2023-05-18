package dependency_inversion_principle.model;

import dependency_inversion_principle.interfaces.IProdutoDB;

public class ProdutoMongoDB implements IProdutoDB {
    public String getIdProduto(String idProduto){
        return "MongoDB: Exibindo dados do Produto: " + idProduto;
    }
}
