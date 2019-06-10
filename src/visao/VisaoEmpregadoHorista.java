package visao;

import conceito.Empregado;
import conceito.EmpregadoHorista;
import conceito.Endereco;
import conceito.EnderecoException;
import conceito.PessoaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eberty Miranda
 */
public class VisaoEmpregadoHorista implements IVisaoEmpregado {
    
    private EmpregadoHorista emp;
    private Endereco emp2;
    
    public VisaoEmpregadoHorista() {
        emp = new EmpregadoHorista();
        emp2 = new Endereco() {};
    }
    
    @Override
    public void lerDados() {
        boolean continuaLoop = true;
        do {
            try {
                emp.setNome(JOptionPane.showInputDialog("Forneca o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneca o cargo: "));
                emp.setNumeroHora(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero de horas trabalhadas: ")));
                emp.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Forneca o valor da hora trabalhada: ")));
                emp2.setCidade(JOptionPane.showInputDialog("Forneca a cidade: "));
                emp2.setBairro(JOptionPane.showInputDialog("Forneca o bairro: "));
                emp2.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero: ")));
                emp2.setCep(Integer.parseInt(JOptionPane.showInputDialog("Forneca o cep: ")));
                emp2.setLogradouro(JOptionPane.showInputDialog("Forneca o logradouro: "));
                emp2.setUf(JOptionPane.showInputDialog("Forneca a Uf: ")); 
                continuaLoop = false;
            } catch (PessoaException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de digitaçao");
            } catch (EnderecoException ex) {
                Logger.getLogger(VisaoEmpregadoHorista.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (continuaLoop);
    }
    
    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null, this.obterDados(), "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
    
    @Override
    public String obterDados() {
        return "Nome: " + emp.getNome() + "\nCargo: " + emp.getCargo() + "\n Salario: R$ " + emp.calcularSalario() +
                "\nCidade: " + emp2.getCidade() + "\nBairro: " + emp2.getBairro() + "\nNumero casa:" + emp2.getNumero() + 
                "\nCep casa: " + emp2.getCep() + "\nLogradouro da casa: " + emp2.getLogradouro() + "\n UF: " + emp2.getUf();
    }
    
    @Override
    public Empregado getEmpregado() {
        return emp;
    }
    
    public Endereco getEnderecoCompleto (){
       return emp2;
   }
    
}
