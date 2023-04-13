package AcheONumero;
import javax.swing.*;

public class JogoDeAdivinhaçãoDeNúmeros {
   public static void main(String[] args) {
       int NumeroDoComputador = (int) (Math.random()*200 + 1);
       int RespostaDoUsuario = 0;
       System.out.println("O palpite correto seria " + NumeroDoComputador);
        int count = 1;

       while (RespostaDoUsuario != NumeroDoComputador)
       {
           String response = JOptionPane.showInputDialog(null,
               "Digite um palpite entre 1 e 200", "Jogo de adivinhação", 3);
           RespostaDoUsuario = Integer.parseInt(response);
           JOptionPane.showMessageDialog(null, ""+ determineOPalpite(RespostaDoUsuario, NumeroDoComputador, count));
           count++;
       }  
   }

   public static String determineOPalpite(int RespostaDoUsuario, int NumeroDoComputador, int count){
       if (RespostaDoUsuario <=0 || RespostaDoUsuario >200) {
           return "Seu palpite é inválido";
       }
       else if (RespostaDoUsuario == NumeroDoComputador ){
           return "Correto!\nTotal de palpites: " + count;
       }
    
       else if (RespostaDoUsuario > NumeroDoComputador) {
           return "Seu palpite é muito alto, tente novamente.\nTente Número: " + count;
       }
       else if (RespostaDoUsuario < NumeroDoComputador) {
           return "Seu palpite é muito baixo, tente novamente.\nTente Número:" + count;
       }
       else {
           return "Seu palpite está incorreto.\nTente o número:" + count;
   	}
   }
}