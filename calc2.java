import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calc2 implements ActionListener {
    JTextField tf = new JTextField();
    JFrame jf;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bclear, badd, bsub, bmul, bdiv, bdlt, bAdd, bSub, bMul, bDiv;
    int code = 0;

    calc2() {

        frameSetting();
        addComponents();

    }

    public void frameSetting() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(400, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setLayout(null);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setResizable(false);
    }

    public void addComponents() {

        tf.setBounds(65, 120, 250, 35);
        tf.setBackground(Color.WHITE);
        tf.setFont(new Font("Arial", Font.BOLD, 20));

        jf.add(tf);

        b0 = new Button("0");
        b0.setBounds(120, 320, 45, 45);
        b0.setFont(new Font("Arial", Font.BOLD, 15));
        b0.addActionListener(this);
        jf.add(b0);

        b1 = new Button("1");
        b1.setBounds(70, 270, 45, 45);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.addActionListener(this);
        jf.add(b1);

        b2 = new Button("2");
        b2.setBounds(120, 270, 45, 45);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.addActionListener(this);
        jf.add(b2);

        b3 = new Button("3");
        b3.setBounds(170, 270, 45, 45);
        b3.setFont(new Font("Arial", Font.BOLD, 15));
        b3.addActionListener(this);
        jf.add(b3);

        b4 = new Button("4");
        b4.setBounds(70, 220, 45, 45);
        b4.setFont(new Font("Arial", Font.BOLD, 15));
        b4.addActionListener(this);
        jf.add(b4);

        b5 = new Button("5");
        b5.setBounds(120, 220, 45, 45);
        b5.setFont(new Font("Arial", Font.BOLD, 15));
        b5.addActionListener(this);
        jf.add(b5);

        b6 = new Button("6");
        b6.setBounds(170, 220, 45, 45);
        b6.setFont(new Font("Arial", Font.BOLD, 15));
        b6.addActionListener(this);
        jf.add(b6);

        b7 = new Button("7");
        b7.setBounds(70, 170, 45, 45);
        b7.setFont(new Font("Arial", Font.BOLD, 15));
        b7.addActionListener(this);
        jf.add(b7);

        b8 = new Button("8");
        b8.setBounds(120, 170, 45, 45);
        b8.setFont(new Font("Arial", Font.BOLD, 15));
        b8.addActionListener(this);
        jf.add(b8);

        b9 = new Button("9");
        b9.setBounds(170, 170, 45, 45);
        b9.setFont(new Font("Arial", Font.BOLD, 15));
        b9.addActionListener(this);
        jf.add(b9);

        bclear = new Button("C");
        bclear.setBounds(70, 320, 45, 45);
        bclear.addActionListener(this);
        bclear.setBackground(Color.RED);
        bclear.setForeground(Color.WHITE);
        jf.add(bclear);

        badd = new Button("+");
        badd.setBounds(220, 320, 45, 45);
        badd.setFont(new Font("Arial", Font.BOLD, 15));
        badd.addActionListener(this);
        jf.add(badd);

        bsub = new Button("-");
        bsub.setBounds(220, 270, 45, 45);
        bsub.setFont(new Font("Arial", Font.BOLD, 15));
        bsub.addActionListener(this);
        jf.add(bsub);

        bmul = new Button("*");
        bmul.setBounds(220, 220, 45, 45);
        bmul.setFont(new Font("Arial", Font.BOLD, 15));
        bmul.addActionListener(this);
        jf.add(bmul);

        bdiv = new Button("/");
        bdiv.setBounds(220, 170, 45, 45);
        bdiv.setFont(new Font("Arial", Font.BOLD, 15));
        bdiv.addActionListener(this);
        jf.add(bdiv);

        bdlt = new Button("Dlt");
        bdlt.setBounds(170, 320, 45, 45);
        bdlt.addActionListener(this);
        bdlt.setBackground(Color.RED);
        bdlt.setForeground(Color.WHITE);
        jf.add(bdlt);

        bAdd = new Button("Add");
        bAdd.setBounds(270, 320, 45, 45);
        bAdd.addActionListener(this);
        bAdd.setBackground(new Color(239, 188, 2));
        bAdd.setFont(new Font("Arial", Font.BOLD,15));        

        jf.add(bAdd);
        
        bSub = new Button("Sub");
        bSub.setBounds(270, 270, 45, 45);
        bSub.addActionListener(this);
        bSub.setBackground(new Color(239, 188, 2));
        bSub.setFont(new Font("Arial", Font.BOLD,15));        
        jf.add(bSub);

        bMul = new Button("Mul");
        bMul.setBounds(270, 220, 45, 45);
        bMul.addActionListener(this);
        bMul.setBackground(new Color(239, 188, 2));
        bMul.setFont(new Font("Arial", Font.BOLD,15));        
        jf.add(bMul);

        bDiv = new Button("Div");
        bDiv.setBounds(270, 170, 45, 45);
        bDiv.addActionListener(this);
        bDiv.setBackground(new Color(239, 188, 2));
        bDiv.setFont(new Font("Arial", Font.BOLD,15));
        jf.add(bDiv);

    }

    public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        if (value == "0") {
            tf.setText(tf.getText() + "0");
        }

        else if (value == "1") {
            tf.setText(tf.getText() + "1");
        }

        else if (value == "2") {
            tf.setText(tf.getText() + "2");
        }

        else if (value == "3") {
            tf.setText(tf.getText() + "3");
        }

        else if (value == "4") {
            tf.setText(tf.getText() + "4");
        }

        else if (value == "5") {
            tf.setText(tf.getText() + "5");
        }

        else if (value == "6") {
            tf.setText(tf.getText() + "6");
        }

        else if (value == "7") {
            tf.setText(tf.getText() + "7");
        }

        else if (value == "8") {
            tf.setText(tf.getText() + "8");
        }

        else if (value == "9") {
            tf.setText(tf.getText() + "9");
        }
         else if (value == "+") {
            tf.setText(tf.getText() + "+");
        }
         else if (value == "-") {
            tf.setText(tf.getText() + "-");
        } 
        else if (value == "*") {
            tf.setText(tf.getText() + "*");
        } 
        else if (value == "/") {
            tf.setText(tf.getText() + "/");
        }
         else if (value == "C") {
            tf.setText("");
        } 
        else if (value == "Dlt") {
            int len=tf.getText().length();
            int number=len-1;
            StringBuilder back = new StringBuilder(tf.getText());
                back.deleteCharAt(number);
                tf.setText(back.toString()); 
                
            // System.out.println(len);
            
            

            // System.out.println("ok");

            // System.out.println("ok");

            // System.out.println("ok");

            // String strs[] = str.split("[ + - * / ]");
            // // int sum = 0;
            // // for (int i = 0; i < strs.length; i++) {
            // // sum += Integer.parseInt(strs[i]);
            // // }
            // // tf.setText("Result " + sum);
            // for (int i = 0; i < strs.length; i++) {
            // System.out.println(strs[i]);
            // }

        }
        else if (value == "Add") {
            String str = tf.getText();
            String strs[] = str.split("[+]");
            int sum = 0;
            for (int i = 0; i < strs.length; i++) {
                sum += Integer.parseInt(strs[i]);
            }
            tf.setText("Result " + sum);
        }
        else if (value == "Sub") {
            String str = tf.getText();
            String strs[] = str.split("[-]");
            int sub = Integer.parseInt(strs[0]);
            for (int i = 1; i < strs.length; i++) {
                sub -= Integer.parseInt(strs[i]);
            }
            tf.setText("Result " + sub);}
        else if (value == "Mul") {
            String str = tf.getText();
            String strs[] = str.split("[*]");
            int mul = 1;
            for (int i = 0; i < strs.length; i++) {
                mul *= Integer.parseInt(strs[i]);
            }
            tf.setText("Result " + mul);

            // System.out.println(mul);
        } 
        
        else if (value == "Div") {
            String str = tf.getText();
            String strs[] = str.split("[/]");
            Double div = Double.parseDouble(strs[0]);
            for (int i = 1; i < strs.length; i++) {
                div /= Double.parseDouble(strs[i]);
            }
            tf.setText("Result " + div);
            // tf.setText(div);
        }
    }

    public static void main(String[] args) {
        new calc2();
    }
}
