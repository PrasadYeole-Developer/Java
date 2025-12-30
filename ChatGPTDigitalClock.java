import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class ChatGPTDigitalClock extends JFrame {
    JLabel l1, l2;
    SimpleDateFormat d1, d2;
    Timer timer;

    ChatGPTDigitalClock(String s1) {
        super(s1);
    }

    ChatGPTDigitalClock() {
    }

    void setComponents() {
        // Initialize labels
        l1 = new JLabel();
        l2 = new JLabel();

        // Set font, foreground, and background for the time label
        l1.setFont(new Font("Verdana", Font.BOLD, 40));
        l1.setForeground(Color.RED);
        l1.setBackground(Color.BLACK);
        l1.setOpaque(true);

        // Set font, foreground, and background for the day label
        l2.setFont(new Font("Verdana", Font.BOLD, 30));
        l2.setForeground(Color.BLUE);
        l2.setBackground(Color.LIGHT_GRAY);
        l2.setOpaque(true);

        // Set layout and add components
        setLayout(null);
        add(l1);
        add(l2);

        // Set positions and dimensions
        l1.setBounds(50, 50, 400, 100);
        l2.setBounds(50, 200, 400, 100);

        // Initialize date formats
        d1 = new SimpleDateFormat("hh:mm:ss a");
        d2 = new SimpleDateFormat("EEEE");

        // Use a Swing Timer for updating the clock
        timer = new Timer(1000, e -> {
            String time = d1.format(Calendar.getInstance().getTime());
            l1.setText(time);

            String day = d2.format(Calendar.getInstance().getTime());
            l2.setText(day);
        });

        timer.start(); // Start the timer
    }

    public static void main(String[] args) {
        DigitalClock d1 = new DigitalClock("Digital Clock");
        d1.setVisible(true);
        d1.setSize(500, 500);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d1.setComponents();
    }
}
