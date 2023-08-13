// Classe que representa um objeto Carro
public class Carro {
    // Propriedades do Carro
    private String marca;
    private int anoFabricacao;

    // Construtor da classe Carro
    public Carro(String marca, int anoFabricacao) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    // Método para obter a marca do carro
    public String getMarca() {
        return marca;
    }

    // Método para definir a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para obter o ano de fabricação do carro
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Método para definir o ano de fabricação do carro
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Carro da marca " + marca + ", fabricado em " + anoFabricacao);
    }

    // Método principal (main) para testar a classe Carro
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Toyota", 2020);

        // Exibindo informações do carro
        meuCarro.exibirInformacoes();
    }
}

