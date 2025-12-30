import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LoginS4 extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;

    LoginS4(String s1)
    {
        super(s1);
     
    }
    LoginS4()
    {
        
    }
    void setComponents()
    {

        Cursor c1=new Cursor(Cursor.HAND_CURSOR);
        Font f1=new Font("Times New Roman",Font.BOLD,28);
        Font f2 = new Font("Callibri", Font.ITALIC, 16);


        l1=new JLabel("Welcome to Coding Seekho Institute");
        l1.setFont(f1);
        l1.setForeground(Color.RED);
        l2=new JLabel("USERNAME");
        l3=new JLabel("PASSWORD");
        l3.setFont(f2);
        l3.setForeground(Color.BLUE);
        l4=new JLabel();
        t1=new JTextField();
        t2=new JPasswordField();
        b1=new JButton("Login");
        b1.setCursor(c1);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.DARK_GRAY);
        b2=new JButton("Autofill");
        b3=new JButton("Add");
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1.setBounds(100,50,300,30);
        l2.setBounds(100,200,100,30);
        l3.setBounds(100,350,100,30);
        l4.setBounds(100,550,300,30);
        t1.setBounds(350,200,100,30);
        t2.setBounds(350,350,100,30);
        b1.setBounds(200,450,100,30);
        b2.setBounds(400,450,100,30);
        b3.setBounds(500,550,100,30);

        b1.addActionListener(new Log());
b2.addActionListener(new Autofill());
b3.addActionListener(new Add());

}

    public static void main(String[] args) {
LoginS4 s1=new LoginS4("Welcome to Coding SeeKho");
s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Log implements ActionListener{
public void actionPerformed(ActionEvent e1){
    String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("Coding") && s2.equals("Seekho"))
{
    JOptionPane.showMessageDialog(null, "Login Successful");
    l4.setText("Login Successful");
    }
    else{
        JOptionPane.showMessageDialog(null, "Login Unsuccessful");   
     }
}
}

class Autofill implements ActionListener{
    public void actionPerformed(ActionEvent e1){
     t1.setText("Coding");
     t2.setText("Seekho");
    }
    }
    class Add implements ActionListener{
        public void actionPerformed(ActionEvent e1){
       try{
        int a = Integer.parseInt(t1.getText());
       int b = Integer.parseInt(t2.getText());
       int c=a+b;
       l4.setText("Addition is "+c);

       }
       catch(Exception e2){
l4.setText("Please Enter a number only");
       }
      
        }
        }
}