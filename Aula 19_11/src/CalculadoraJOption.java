import javax.swing.JOptionPane;

public class CalculadoraJOption {
    public static void main(String[] args) {
        float num1,num2;
        String operacao;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo valor"));
        operacao = JOptionPane.showInputDialog("insira a operação (+,-,*,/)");
        switch(operacao){
            case "+":{
                JOptionPane.showMessageDialog(null, "O resultado da soma é:" + somar(num1, num2), "Resultado", 0);
                break;
            }
            case "-":{
                JOptionPane.showMessageDialog(null, "O resultado da subtração é:" + subtrair(num1, num2), "Resultado", 1);
                break;
            }
            case "*":{
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação  é:" + multiplicar(num1, num2), "Resultado", 2);
                break;
            }
            case "/":{
                JOptionPane.showMessageDialog(null, "O resultado da divisão é:" + dividir(num1, num2), "Resultado", 3);
                break;
            }
            default:{JOptionPane.showMessageDialog(null, "Operação inválida", "Erro", 0);
            }
        }  
    }
    public static float somar(float num1,float num2){
        return num1+num2;
    }
    public static float subtrair(float num1,float num2){
        return num1-num2;
    }
    public static float multiplicar(float num1,float num2){
        return num1*num2;
    }
    public static float dividir(float num1,float num2){
        return num1/num2;
    }

}
