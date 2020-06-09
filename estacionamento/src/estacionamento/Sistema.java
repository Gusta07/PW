package estacionamento;

import javax.swing.JOptionPane;

public class Sistema {

        public String Placa;
        public String Modelo;
        public double HoraEntrada;
        public double MinEntrada;
        public double HoraSaida;
        public double MinSaida;
        public double Preco;
      
public double calcular(double HoraEntrada,double MinEntrada, double HoraSaida,double MinSaida){
    double Entrada= HoraEntrada+MinEntrada/60;
    double Saida= HoraSaida+MinSaida/60;
    double tempo=Math.ceil(Saida-Entrada); 
    
    return tempo;
}
public void nota(double tempo,double preco){
    double valor_total= tempo*preco;
             JOptionPane.showMessageDialog(null,"Placa do carro: "+getPlaca()
             +"\n Modelo: "+getModelo()+"\n"
             + " Horário de entrada: "+getHoraEntrada()+"h e " +getMinEntrada()+"\n"
             +" Horário de saida: "+getHoraSaida()+"h e " +getMinSaida()+"\n" 
             +" Tempo no estacionamento: "+tempo+" horas"
             +"\n Valor: R$ "+valor_total);
}
             
    public String getPlaca(){
        return Placa;
    }
    public void setPlaca(String Placa){
    this.Placa=Placa;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
    this.Modelo=Modelo;
    }
    public double getHoraEntrada(){
        return HoraEntrada;
    }
    public void setHoraEntrada(double HoraEntrada){
    this.HoraEntrada=HoraEntrada;
    }
    public double getMinEntrada(){
        return MinEntrada;
    }
    public void setMinEntrada(double MinEntrada){
    this.MinEntrada=MinEntrada;
    }
    public double getHoraSaida(){
        return HoraSaida;
    }
    public void setHoraSaida(double HoraSaida){
    this.HoraSaida=HoraSaida;
    } 
    public double getMinSaida(){
        return MinSaida;
    }
    public void setMinSaida(double MinSaida){
    this.MinSaida=MinSaida;
    }
    public double getPreco(){
        return Preco;
    }
    public void setPreco(double Preco){
    this.Preco=Preco;
    }    
}

