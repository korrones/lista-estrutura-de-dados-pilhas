package estruturas;
public class ListaVetor {

    //Implementação com Vetores
    private Integer[] vetor;
    private int capacidade = 10;
    private int tamanho;

    public Integer[] getVetor() {
        return vetor;
    }

    public void setVetor(Integer[] vetor) {
        this.vetor = vetor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public ListaVetor(){
        this.vetor = new Integer[capacidade];
        this.tamanho = 0; 
    }

    public void aumentarCapacidade(){
        //criando um novo vetor com mais capacidade
        int novaCapacidade = this.capacidade * (capacidade/2);
        Integer[] novoVetor = new Integer[novaCapacidade];

        for (int i = 0; i < tamanho; i++){
            novoVetor[i] = vetor[i];
        }

        //a variavel vetor recebe o novoVetor com a capacidade atualizada
        vetor = novoVetor;
        capacidade = novaCapacidade;
    }

    public void adicionar(Integer elemento){
        if (tamanho == capacidade) {
            aumentarCapacidade();
        }
        vetor[tamanho] = elemento;
        tamanho++;
    }

    public void mostrarElementos(){
        if (tamanho == 0) {
            System.out.println("Lista está vazia");
        }else{
            for(int i =0; i< tamanho; i++){
                System.out.println(vetor[i] + " ");
            }
        }
    }
}