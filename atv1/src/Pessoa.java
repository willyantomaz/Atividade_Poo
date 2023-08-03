public class Pessoa {
    private String nome;
    private String datNsc;
    private int idade;
    
    public Pessoa(String nome,String datNsc,int idade){
        this.nome = nome;
        this.datNsc = datNsc;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDatNsc(){
        return this.datNsc;
    }
    public int getIdade(){
        return this.idade;
    }

}
