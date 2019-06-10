package conceito;

/**
 *
 * @author Eberty Miranda
 */
public abstract class Endereco extends Pessoa {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private int cep; 
    private String uf;

    public Endereco() {
        logradouro = "";
        bairro = "";
        cidade = "";
        
    }
    
    

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) throws EnderecoException {
        if (logradouro.length() >= 3) {
            this.logradouro = logradouro;
        }else{
            throw new EnderecoException("Nome da rua deve ser maior do que 3");
        }
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) throws EnderecoException{
        if (bairro.length() >= 3) {
            this.bairro = bairro;
        }else{
            throw new EnderecoException("Nome do bairro deve ser maior do que 3");
        }
        
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) throws EnderecoException {
          if (cidade.length() >= 3) {
           this.cidade = cidade;
        }else{
            throw new EnderecoException("Nome da cidade deve ser maior do que 3");
        }
        
    }

    /**
     *
     * @return
     */
    public int getCep() {
        return cep;
    }
   public void setCep(int cep) {
        this.cep = cep;
   }
            
   
    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) throws EnderecoException {
        if(uf.length() == 2) {
            this.uf = uf;
        } else {
            throw new EnderecoException("Numero do UF deve ser igual a 2");
        }
       
    }
    
    
    public String getEnderecoCompleto (){
        return "Endereco Completo" + "\nLogradouro: " + logradouro + "\nBairro: " +  bairro + "\nCidade: " + cidade + "\nCep: " + cep + "\nUF: "
                + uf + "\nNumero: " + numero;
        
    }   
}
