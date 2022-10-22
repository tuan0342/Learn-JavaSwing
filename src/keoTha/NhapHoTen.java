package keoTha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NhapHoTen extends JFrame{
    private JTextField jtfFirstName;
    private JTextField jtfLastName;
    private JButton btOk;
    private JButton btClear;
    private JPanel mainPanel;
    private JLabel lbWellCome;

    public NhapHoTen() {
        setTitle("Enter Full Name");
        setContentPane(mainPanel);
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbWellCome.setText("Full Name: " + jtfFirstName.getText() + " " + jtfLastName.getText());
            }
        });


        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbWellCome.setText("");
            }
        });
    }

    public static void main(String[] args) {
        NhapHoTen nhapHoTen = new NhapHoTen();
    }
}
