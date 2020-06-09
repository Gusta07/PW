package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
    Sistema itens= new Sistema();
    
    itens.setPlaca((JOptionPane.showInputDialog("Placa: ")));
    itens.setModelo((JOptionPane.showInputDialog("Modelo: ")));
    itens.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Preço(hora): ")));
    itens.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog("Hora de entrada: ")));
    itens.setMinEntrada(Integer.parseInt(JOptionPane.showInputDialog("Minuto de entrada: ")));
    itens.setHoraSaida(Integer.parseInt(JOptionPane.showInputDialog("Hora de saída: ")));
    itens.setMinSaida(Integer.parseInt(JOptionPane.showInputDialog("Minuto de saída: ")));
            
   double tempo= itens.calcular(itens.getHoraEntrada(),itens.getMinEntrada(),itens.getHoraSaida(),itens.getMinSaida());
          itens.nota(tempo, tempo);        
    }
}  
