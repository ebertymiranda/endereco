package conceito;

/**
 *
 * @author Eberty Miranda
 */
public class PessoaException extends Exception {

    public PessoaException () {
        super("Erro ao manipular pessoa/empregado");
    }
    
    public PessoaException(String mensagem) {
        super(mensagem);
    }
    
}
