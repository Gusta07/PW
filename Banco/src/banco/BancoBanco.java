
package banco;

import javax.swing.JOptionPane;

public class BancoBanco {
    public int numConta;
    public int agencia;
    public String nome;
    public String senha;
    public double saldo;
    public boolean logado = false;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numconta) {
        this.numConta = numconta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    
    public boolean logar(int agencia, int numConta, String senha){
        if (agencia == 1234 && numConta == 1 && "abc123".equals(senha)) {
            this.logado = true;
            atual(this.logado);
        }
        else{
                JOptionPane.showMessageDialog(null, "Dados incorretos");
                this.logado = false;
                      
        }                                                       
        return this.logado;
    }
   
    public void sacar(double valor, boolean logado){
         this.saldo = this.saldo - valor;
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "s - Sim\n"
                + "n - Não");
        switch(opcao){
            case "s":
                atual(this.logado);
                 break; 
            case "n":
                JOptionPane.showMessageDialog(null, "Obrigado\n"
                        + "Volte sempre");
                System.exit(0);                
                 break; 
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
    
    public void depositar(double valor, boolean logado){
        this.saldo = this.saldo + valor;
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "s - Sim\n"
                + "n - Não");
        switch(opcao){
            case "s":
                atual(this.logado);
                 break; 
            case "n":
                JOptionPane.showMessageDialog(null, "Obrigado\n"
                        + "Volte sempre");
                System.exit(0);                
                 break; 
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
    
    public void consultarSaldo(boolean logado){
        JOptionPane.showMessageDialog(null, "O saldo atual é de\n"
                + "R$ " + getSaldo());
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "s - Sim\n"
                + "n - Não");
        switch(opcao){
            case "s":
                atual(this.logado);
                 break; 
            case "n":
                JOptionPane.showMessageDialog(null, "Obrigado\n"
                        + "Volte sempre");
                System.exit(0);                
                 break; 
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
    }
    }
    
    public void atual (boolean logado){
        if (logado == true){
            int opcao;
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n"
                    + "1 - Depósito\n"
                    + "2 - Saque\n"
                    + "3 - Consulta de Saldo\n"
                    + "4 - Sair"));
            switch(opcao){
                case 1:
                   depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depósito")),this.logado);
                    break;
                case 2:
                   sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque")),this.logado);
                    break;
                case 3:
                   consultarSaldo(this.logado);
                    break;   
                case 4:
                    JOptionPane.showMessageDialog(null, "Obrigado\n"
                            + "Volte sempre");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
}
