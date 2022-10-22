package keoTha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LearnTextField extends JFrame{
    private JTextField tfImport;
    private JTextArea taShowContent;
    private JButton btClear;
    private JLabel lbNotifi;
    private JPanel mainPanel;

    public LearnTextField(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setContentPane(mainPanel);
        this.setSize(600, 600);
        //this.pack();
        this.setLocationRelativeTo(null);

        tfImport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tfImport.getText().equals("")) {
                    taShowContent.append(tfImport.getText() + "\n");
                }
            }
        });
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taShowContent.setText("");
            }
        });
        tfImport.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfImport.setText("");
            }
        });
    }

    public static void main(String[] args) {
        LearnTextField learnTextField = new LearnTextField("Learn TextField");

    }
}
