import javax.swing.*;
class LoginS2 extends JFrame{
    LoginS2(String s1)
    {
        super(s1);
     
    }
    LoginS2()
    {
        
    }
    void setComponents()
    {
        JLabel l1 = new JLabel("Welcome!");
        JTextField t1=new JTextField();
        setLayout(null);
        
        l1.setBounds(200,100,100,30);
        t1.setBounds(200,200,100,30);
        add(l1);
        add(t1);


    }

    public static void main(String[] args) {
LoginS2 s1=new LoginS2("Welcome to Coding SeeKho");
s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}