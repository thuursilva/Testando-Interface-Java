package calculoimcinterface;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculoIMCinterface {


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao nosso programa para cálculo de IMC!");
        
        //criando caixas de diálogo para aquisição de valores necessários
        String snPeso = JOptionPane.showInputDialog("Digite seu peso");
        String snAltura = JOptionPane.showInputDialog("Digite sua altura separada por ponto(exemplo: 1.80)");
        
        //convertendo valores de string para double
        double peso = Double.parseDouble(snPeso);
        double altura = Double.parseDouble(snAltura);
        double imc = peso/Math.pow(altura,2);
        DecimalFormat df = new DecimalFormat("##.##");//formatação de um double para apenas duas casas decimais
        
        //criando caixa de diálogo para apresentar ao usuário seu imc
        JOptionPane.showMessageDialog(null,"Seu imc é: "+df.format(imc), "Cálculo realizado",JOptionPane.PLAIN_MESSAGE);
        
        //situações
        String situacao = null;
        if(imc < 16){
            situacao = "Subpeso severo. Procure assistência médica e tente realizar refeições frequentes ricas em nutrientes e proteínas.";
        }
         if(imc >= 16 && imc < 20){
            situacao = "Subpeso. Procure realizar refeições frequentes e ricas em nutrientes,\n a prática de exercícios moderados também podem ajudar a desenvolver músculos.";
        }
          if(imc >= 20 && imc < 25){
            situacao = "Normal. Está no seu peso ideal, tente se manter sempre saudável.";
        }
          if(imc >= 25 && imc < 30){
          situacao = "Sobrepeso. Procure consumir menos calorias e se alimentar de forma mais saudável,\n tente realizar mais exercícios e controlar o peso para reduzir massa corporal.";
        }
          if(imc >= 30 && imc < 40){
          situacao = "Obeso. Tente realizar uma dieta saudável, rica em proteínas e baixas calorias,\n praticar exercícios para a queima de calorias é muito benéfico.";
        }
          if( imc >= 40){
          situacao = "Obeso Mórbido. Procure assistência médica para realizar reeducação alimentar e uma dieta mais saudável de acordo com seu estado.\n Não realize dietas por conta própria. A prática de atividades físicas deve ser indicada pelo médico";
        }
          
          //criando caixa de diálogo para demonstrar a situação do usuário
          JOptionPane.showMessageDialog(null,situacao, "Situação atual, obrigado por participar!",JOptionPane.PLAIN_MESSAGE);
        
        
        
        
    }
    
}
