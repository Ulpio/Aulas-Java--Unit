
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculadora extends JFrame{
    
    private JButton numero0;
    private JButton numero1;
    private JButton numero2;
    private JButton numero3;
    private JButton numero4;
    private JButton numero5;
    private JButton numero6;
    private JButton numero7;
    private JButton numero8;
    private JButton numero9;
    
    
    private JButton dividir;
    private JButton multiplicar;
    private JButton subtrair;
    private JButton somar;
    private JButton igual;
    private JButton ponto;
    
    private JTextField display;
    
    private int leitura;
    private int memoria;
    private char operacao;
    
    public Calculadora(){
        this.setTitle("Calculadora");
        this.setBounds(500, 100, 292, 450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        
        leitura = 0;
        memoria = 0;
        
        display = new JTextField();
        display.setBounds(0, 0, 300, 100);
        this.add(display);
        
        // coluna 1
        numero7 = new JButton();
        numero7.setText("7");
        numero7.setBounds(0, 120, 65, 65);
        this.add(numero7);
        
        numero4 = new JButton();
        numero4.setText("4");
        numero4.setBounds(0, 190, 65, 65);
        this.add(numero4);
        
        numero1 = new JButton();
        numero1.setText("1");
        numero1.setBounds(0, 260, 65, 65);
        this.add(numero1);
        
        numero0 = new JButton();
        numero0.setText("0");
        numero0.setBounds(0, 330, 65, 65);
        this.add(numero0);
        
        // coluna 2
        numero8 = new JButton();
        numero8.setText("8");
        numero8.setBounds(70, 120, 65, 65);
        this.add(numero8);
        
        numero5 = new JButton();
        numero5.setText("5");
        numero5.setBounds(70, 190, 65, 65);
        this.add(numero5);
        
        numero2 = new JButton();
        numero2.setText("2");
        numero2.setBounds(70, 260, 65, 65);
        this.add(numero2);
        
        ponto = new JButton();
        ponto.setText(".");
        ponto.setBounds(70, 330, 65, 65);
        this.add(ponto);
        
        // coluna
        numero9 = new JButton();
        numero9.setText("9");
        numero9.setBounds(140, 120, 65, 65);
        this.add(numero9);
        
        numero6 = new JButton();
        numero6.setText("6");
        numero6.setBounds(140, 190, 65, 65);
        this.add(numero6);
        
        numero3 = new JButton();
        numero3.setText("3");
        numero3.setBounds(140, 260, 65, 65);
        this.add(numero3);
        
        igual = new JButton();
        igual.setText("=");
        igual.setBounds(140, 330, 65, 65);
        this.add(igual);
        
        //coluna 4
        
        multiplicar = new JButton();
        multiplicar.setText("*");
        multiplicar.setBounds(210, 120, 65, 65);
        this.add(multiplicar);
        
        dividir = new JButton();
        dividir.setText("/");
        dividir.setBounds(210, 190, 65, 65);
        this.add(dividir);
        
        somar = new JButton();
        somar.setText("+");
        somar.setBounds(210, 260, 65, 65);
        this.add(somar);
        
        subtrair = new JButton();
        subtrair.setText("-");
        subtrair.setBounds(210, 330, 65, 65);
        this.add(subtrair);
        
        numero1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 1;
                display.setText(display.getText() + "1");
            
            }
        });
        
        numero0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 0;
                display.setText(display.getText() + "0");
            
            }
        });
        
        numero2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 2;
                display.setText(display.getText() + "2");
            
            }
        });
        
        numero3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 3;
                display.setText(display.getText() + "3");
            
            }
        });
        
        numero4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 4;
                display.setText(display.getText() + "4");
            
            }
        });
        
        numero5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 5;
                display.setText(display.getText() + "5");
            
            }
        });
        
        numero6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 6;
                display.setText(display.getText() + "6");
            
            }
        });
        
        numero7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 7;
                display.setText(display.getText() + "7");
            
            }
        });
        
        numero8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 8;
                display.setText(display.getText() + "8");
            
            }
        });
        numero9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                leitura += 9;
                display.setText(display.getText() + "9");
            
            }
        });
        
        somar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operacao = '+';
                memoria += leitura;
                leitura = 0; 
                display.setText(memoria + "+");
                
            }
        });
        
        subtrair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operacao = '-';
                memoria += leitura;
                leitura = 0; 
                display.setText(memoria + "-");
                
            }
        });
        
        dividir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operacao = '/';
                memoria += leitura;
                leitura = 0; 
                display.setText(memoria + "/");
                
            }
        });
        
        multiplicar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operacao = '*';
                memoria += leitura;
                leitura = 0; 
                display.setText(memoria + "*");
                
            }
        });
        igual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                switch(operacao){
                    case '+':{
                        memoria += leitura;
                        break;
                    }
                    case '-':{
                        memoria -= leitura;
                        break;
                    }
                    case '*':{
                        memoria *= leitura;
                        break;
                    }
                    case '/':{
                        memoria /= leitura;
                        break;
                    }
                }
                
                leitura = 0;
                display.setText("" + memoria);
                memoria = 0;
                
            }
        });
        
        }
        public static void main(String[] args){
            Calculadora exemplo = new Calculadora();
            exemplo.setVisible(true);
        }
        
    
    
    }
