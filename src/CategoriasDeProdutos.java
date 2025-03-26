public class CategoriasDeProdutos {

    private int codigoProduto;
    public CategoriasDeProdutos(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

        public void escolhercategoria ( int codigoProduto){
            String categoria;
            switch (codigoProduto) {
                case 1:
                    categoria = "Eletrônicos";
                    break;
                case 2:
                    categoria = "Alimentos";
                    break;
                default:
                    categoria = "Não encontrado";
        }
        System.out.println("Código do Produto: " + codigoProduto);
    }
    }
