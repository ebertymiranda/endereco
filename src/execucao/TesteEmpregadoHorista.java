package execucao;
import visao.VisaoEmpregadoHorista;
/**
 *
 * @author Eberty Miranda
 */
public class TesteEmpregadoHorista { 
    
    public static void main(String args[]) {
        
        VisaoEmpregadoHorista emp3 = new VisaoEmpregadoHorista();
        emp3.lerDados();
        emp3.mostrarDados();
        
        System.exit(0);
    }
    
}
