public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa("Antonio",
        "15/10/2000",23 );
        
        System.out.printf("O %s tem %d anos e nasceu na data %s \n",pessoa.getNome(),pessoa.getIdade(),pessoa.getDatNsc());
        pessoa.setNome("Mario");
        System.out.printf("O %s tem %d anos e nasceu na data %s",pessoa.getNome(),pessoa.getIdade(),pessoa.getDatNsc());
    }
}
