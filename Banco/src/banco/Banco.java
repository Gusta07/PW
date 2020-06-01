package banco;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        BancoBanco dados = new BancoBanco();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da agencia: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: ")));
        dados.setSenha(JOptionPane.showInputDialog("Digite a senha: "));
        
        dados.logar(dados.getAgencia(), dados.getNumConta(),dados.getSenha());
    }
    
}
