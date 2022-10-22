import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LearnLabel2 extends JFrame {
    public LearnLabel2() {
        this.setSize(500, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        JLabel label = new JLabel();  // tạo label
        this.add(label);
        label.setSize(350, 750);  // set size cho label

        System.out.println("x: " + label.getSize().width + ", y " + label.getSize().height);

        setPicture(label, "D:\\LearnJavaSwing\\image\\cos1.jpg");
    }

    /* thiết lập ảnh bằng label */
    public void setPicture(JLabel label,String fileName) {
        try {
            BufferedImage image = ImageIO.read(new File(fileName));
            int x = label.getSize().width;  // lấy size của label
            int y = label.getSize().height;
            int ix = image.getWidth();  // lấy size của image
            int iy = image.getHeight();

            int dx = 0, dy = 0;

            // căn chỉnh kích thước ảnh
            if (x / y > ix / iy) {
                dy = y;
                dx = y * ix / iy;
            } else {
                dx = x;
                dy = x * iy / ix;
            }

            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));  // tạo icon + set size ảnh
            label.setIcon(icon);  // thêm icon vào label
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LearnLabel2 learnLabel2 = new LearnLabel2();
    }
}
