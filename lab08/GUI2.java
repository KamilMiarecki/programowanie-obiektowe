import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI2 extends JFrame{
    double a, b, c, wynik;
    private JButton zatwierdzButton;
    private JRadioButton windowsButton;
    private JRadioButton macOSRadioButton;
    private JRadioButton linuxRadioButton;

    private JPanel Mainpanel;

     //  private ImageIcon WindowsLogo= new ImageIcon(getClass().getResource("windows.png"));


    private ImageIcon image1;
    private JLabel label1;


    public GUI2() {


        zatwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (windowsButton.isSelected()) {
                    JOptionPane.showMessageDialog(zatwierdzButton,windowsButton.getText());
                }
                else if (linuxRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(zatwierdzButton,linuxRadioButton.getText());
                }
                else  JOptionPane.showMessageDialog(zatwierdzButton,macOSRadioButton.getText());
            }
        });
        windowsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsButton.isSelected()) {
                    image1=new ImageIcon(getClass().getResource("windows.png"));
                    label1 =new JLabel(image1);
                    add(label1);


                }
            }
        });
    }



    public static void main(String[] args){
        GUI2 GUI= new GUI2();
        GUI.setContentPane(GUI.Mainpanel);
        GUI.setVisible(true);
        GUI.setSize(300,100);

    }


}