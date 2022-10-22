import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LearnLabel {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image or both

        ImageIcon image =  new ImageIcon("D:\\LearnJavaSwing\\image\\cat.png");
        Border border = BorderFactory.createLineBorder(Color.green,3); // (thickness: độ dày)

        JLabel label = new JLabel();  // create a label

        label.setText("Bro, do you even code?");  // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, RIGHT, CENTER of imageIcon
        label.setVerticalTextPosition(JLabel.TOP);  // set text TOP, BOTTOM, CENTER of imageICon
        label.setForeground(new Color(0x00FF00)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));  // set font of text(font, style, size)
        label.setIconTextGap(-50);  // set gap of text to image (gap: khoảng cách)
        label.setBackground(Color.black);  // set background color
        label.setOpaque(true);  // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label (TOP, BOTTOM, CENTER)
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label (LEFT, RIGHT, CENTER)
        //label.setBounds(100, 100, 300, 300); // set x, y positon within frame as well as dimentions (kích thước)


        JFrame jFrame = new JFrame();
        //jFrame.validate();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        //jFrame.setLayout(null);  //cài vị trí layout (thủ công) --> ta phải cài vị trí tọa độ cho các thành phần con (như label (setBounds),v.v..)
        jFrame.add(label);
        jFrame.setLocationRelativeTo(null);
        jFrame.pack();  // thêm tất cả các thành phần như label, textfield, v.v.. rồi mới đóng gói nhé!

    }
}
