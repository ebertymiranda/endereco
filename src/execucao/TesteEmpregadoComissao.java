package execucao;
import visao.VisaoEmpregadoComissao;
/**
 *
 * @author Eberty Miranda
 * 
 */
public class TesteEmpregadoComissao {
    
    public static void main(String args[]) {
        
        VisaoEmpregadoComissao emp2 = new VisaoEmpregadoComissao();
        emp2.lerDados();
        emp2.mostrarDados();
        
        System.exit(0);
    }
    
}
