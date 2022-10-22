package keoTha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnLabel extends JFrame{
    private JPanel mainPanel;
    private JLabel textLabel;
    private JButton okButton;
    private JButton showButton;
    private JButton hideButton;
    private JPanel extraOnePanel;
    private JLabel lenaLabel;
    private static int count = 0;

    public LearnLabel(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);  // để hiển thị nội dung bên trong mainPanel
        this.pack();

        /*
        *           validate();
        * */

        // thêm icon và set size icon vào "lenaLabel"
        scaleImage();

        // tạo sự kiện cho nút OK
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setText("Bạn đã click vào nút Ok " + (++ count) + " lần!");
            }
        });

        // tạo sự kiện cho nút "Xuất hiện ảnh"
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lenaLabel.setVisible(true);
            }
        });

        // tạo sự kiện cho nút "Ẩn hình ảnh"
        hideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lenaLabel.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new LearnLabel("Learn Label");
        frame.setVisible(true);
        frame.setSize(600, 700);
    }


    public void scaleImage() {
        ImageIcon icon = new ImageIcon("D:\\LearnJavaSwing\\image\\Lena.png");
        //scale image to fit in jlabel
        Image img = icon.getImage();
//        Image imgScale = img.getScaledInstance(lenaLabel.getWidth(), lenaLabel.getHeight(), Image.SCALE_SMOOTH);
        Image imgScale = img.getScaledInstance(373, 311, Image.SCALE_AREA_AVERAGING);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        lenaLabel.setIcon(scaleIcon);
    }


}
