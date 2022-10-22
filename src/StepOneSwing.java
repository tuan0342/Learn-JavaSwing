import javax.swing.*;
import java.awt.*;

public class StepOneSwing {
    // eheehehe


    private JFrame frame;   // frame là khung
    JButton button;  // button là một thành phần khác
    
    // thêm 1 tý code nữa nè

    public StepOneSwing() {
        creatAndShow();
    }

    public void creatAndShow() {
        button = new JButton("OK");
        frame = new JFrame("Tittle");

        frame.setSize(400, 300); // setSize: cài kích thước của thành phần
//        frame.pack();  // ko sử dụng setSize mà sử dụng pack() thì frame sẽ chỉ bao bọc vừa đủ nút "OK"

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sẽ tắt chương trình khi nhấn vào dấu "x"

        frame.add(button);
        frame.setLayout(new FlowLayout());  // đẩy nút OK lên phía trên frame

        frame.setLocationRelativeTo(null);  // khi chạy thì frame sẽ hiển thị chính giữa màn hình window
        frame.setVisible(true); // setVisible: thiết lập khả năng hiển thị của thành phần
    }

    public static void main(String[] args) {
        new StepOneSwing();  // gọi hàm này để hiển thị cửa sổ
    }




//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//
//        JButton button = new JButton("click");
//        button.setBounds(130, 30, 100, 30);  // width và height: là chiều rộng và chiều cao của button
//                                                               // x và y: là vị trí so với khung frame
//        frame.setTitle("Bai 1");
//        frame.add(button);
//
//        frame.setSize(400, 200);
//        frame.setLayout(null); // ko sử dụng trình quản lý bố cục
//        frame.setVisible(true);  // hiển thị cửa sổ
//    }

}
