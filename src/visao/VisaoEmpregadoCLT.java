package visao;

import conceito.Empregado;
import conceito.EmpregadoCLT;
import conceito.Endereco;
import conceito.PessoaException;
import conceito.EnderecoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Eberty Miranda
 */
public class VisaoEmpregadoCLT implements IVisaoEmpregado {
    
    private EmpregadoCLT emp;
    private Endereco emp2;
    public VisaoEmpregadoCLT() {
        emp = new EmpregadoCLT();
        emp2 = new Endereco() {};
        
    }
      
    @Override
    public void lerDados() {
        boolean continuaLoop = true;
        do{
            try{
                
                emp.setNome(JOptionPane.showInputDialog("Forneca o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneca o cargo: "));
                emp.setSalarioBase(Float.parseFloat(JOptionPane.showInputDialog("Forneca o Salario Base: ")));
                emp.setPINSS(Float.parseFloat(JOptionPane.showInputDialog("Forneca o percentual de INSS: ")));
                emp.setPIR(Float.parseFloat(JOptionPane.showInputDialog("Forneca de IR: ")));
                emp.setValorSalarioFamilia(Float.parseFloat(JOptionPane.showInputDialog("Forneca o valor do salario familia: ")));
                emp.setNumeroFilhos(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero de filhos: ")));
                emp2.setCidade(JOptionPane.showInputDialog("Forneca a cidade: "));
                emp2.setBairro(JOptionPane.showInputDialog("Forneca o bairro: "));
                emp2.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero ")));
                emp2.setCep(Integer.parseInt(JOptionPane.showInputDialog("Forneca o cep ")));
                emp2.setLogradouro(JOptionPane.showInputDialog("Forneca o logradouro: "));
                emp2.setUf(JOptionPane.showInputDialog("Forneca a Uf: "));                
                
                continuaLoop = false;
            } catch (PessoaException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
            } catch (EnderecoException ex) {
                Logger.getLogger(VisaoEmpregadoCLT.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (continuaLoop);
    }
    
    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null, this.obterDados(), "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
    
    @Override
    public String obterDados() {
        return "Nome: " + emp.getNome() + "\nCargo: " + emp.getCargo() + "\n Salario: R$ " + emp.calcularSalario()+
                "\nCidade: " + emp2.getCidade() + "\nBairro: " + emp2.getBairro() + "\nNumero casa:" + emp2.getNumero() + 
                "\nCep casa:" + emp2.getCep() + "\nLogradouro da casa:" + emp2.getLogradouro() + "\n UF:" + emp2.getUf();
    }
    
    @Override
    public Empregado getEmpregado(){
        return emp;
    }
   public Endereco getEnderecoCompleto (){
       return emp2;
   }

}
