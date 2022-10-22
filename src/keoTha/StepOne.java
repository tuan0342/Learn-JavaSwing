package keoTha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StepOne extends JFrame {
    private JPanel mainPanel;
    private JTextField celsiusTextField;  // nhập văn bản
    private JLabel celsiusLabel;
    private JButton convertButton;  // click tạo sự kiện
    private JLabel fahrenheitLabel;
    private JButton exitButton;
    private JButton confirmAct;
    private JButton fillTextButton;
    private JLabel fillTextLabel;

    public StepOne(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // tắt chương trình khi đóng app
        this.setContentPane(mainPanel);// hiển thị giao diện
        this.pack();

        /* tạo sự kiện cho nút Convert */
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temFahr = (int)(Double.parseDouble(celsiusTextField.getText()) * 1.8 + 32);
                fahrenheitLabel.setText(temFahr + " FahrenheitLabel");

                JOptionPane.showMessageDialog(mainPanel,"Đã convert");  // hiển thị tbao vừa click nút nào đó
            }
        });

        /* tạo sự kiện cho nút Exit */
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);   // 0:dừng chương trình do ý muốn ----- !0: là dừng ctrinh do có vấn đề xảy ra
            }
        });

        /* confirm một hành động: gồm 3 lựa chọn Yes - No - Cancel */
        confirmAct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(mainPanel, "Là lá la");
            }
        });

        /* điền văn bản nào đó */
        fillTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog("Nhập văn bản nào!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new StepOne("Celsius Convert");
        frame.setVisible(true);
    }
}
