package conceito;
/**
 *
 * @author Eberty Miranda
 */
public class EnderecoException extends Exception{
    
     public EnderecoException () {
        super("Erro ao digitar endereço");
    }
    
    public EnderecoException(String mensagem) {
        super(mensagem);
    }
    
}
