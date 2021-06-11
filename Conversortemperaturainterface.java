package conversortemperaturainterface;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conversortemperaturainterface {
    
    public static void main(String[] args) {
        //mensagem inicial ao usuário
        JOptionPane.showMessageDialog(null, "Bem vindo ao nosso programa para conversão de graus Celsius em Fahrenheit!");
        
        //criando caixas de diálogo para aquisição de valores necessários
        String snCelsius = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius");
        
        //convertendo valores de string para double
        double Celsius = Double.parseDouble(snCelsius);
        double fahrenheit = ((Celsius*9)/5)+32;
        DecimalFormat df = new DecimalFormat("##.#");//formatação de um double para possuir apenas uma casa decimal
        
        //criando caixa de diálogo para apresentar ao usuário a conversão realizada
        JOptionPane.showMessageDialog(null,"A temperatura em graus Fahrenheit é: "+df.format(fahrenheit)+"°F", "Conversão realizada!",JOptionPane.PLAIN_MESSAGE);
        
        
        
        
    }
    
}
