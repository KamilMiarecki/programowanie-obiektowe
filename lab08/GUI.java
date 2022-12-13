import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame{
    double a, b, c, wynik;
    private JTextField textField1C;
    private JButton zamianaButton;
    private JTextField textField2F;
    private JPanel panelMain;
    private JLabel tempC;
    private JLabel tempF;
    private JButton wyjscie;

    public GUI() {
        JFrame frame = new JFrame();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("zad1");;
        frame.setVisible(true);


        zamianaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            a=Double.parseDouble(textField1C.getText());
            wynik= (a* 9/5)+32;
                textField2F.setText( String.valueOf(wynik));
            }

        });
        wyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }

    public static void main(String[] args){
        GUI GUI= new GUI();
        GUI.setContentPane(GUI.panelMain);
        GUI.setVisible(true);
        GUI.setSize(500,200);

    }


}