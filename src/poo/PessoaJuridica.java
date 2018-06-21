package poo;


public class PessoaJuridica extends Pessoa {
   
    private String cnpj;
    private String numero;
    private String cidade;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    

    public String getCnpj() {
        return cnpj;
    }

       public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
  
    private void validaCnpj(){
    }
}
