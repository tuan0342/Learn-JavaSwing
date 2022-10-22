import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class StepTwoSwing extends JFrame implements ActionListener {
    JButton okButton, exitButton, cancelButton;

    // thêm 1 tý code nè

    public StepTwoSwing(){
        okButton = new JButton("OK");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");

        this.add(okButton);
        okButton.setActionCommand("ok"); // "ok" giống như mã số sinh viên vậy. nó là mã riêng của nút "OK"
        okButton.addActionListener(this); // tạo sự kiện
        okButton.setMnemonic(KeyEvent.VK_O); // tạo phím tắt: Alt + O (truy cập cửa sổ gần nhất mới sử dụng đc phím tắt)

        this.add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
        cancelButton.setMnemonic(KeyEvent.VK_C);

        this.add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(this);
        exitButton.setMnemonic(KeyEvent.VK_E);
        exitButton.setToolTipText("click để thoát");  // khi dê chuột đến nút "Exit" sẽ có dòng text thông báo

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        setSize(400, 300);
        this.setVisible(true);   // hiển thị màn hình
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Test Two JavaSwing Code");

        this.setResizable(false);  /* không cho thay đổi kích thước của app  */
    }

    public static void main(String[] args) {
        new StepTwoSwing();
    }


    // implements phương thức này
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand()))
            JOptionPane.showMessageDialog(rootPane, "Bạn vừa nhấn nút OK");
        if ("exit".equals(e.getActionCommand()))
            System.exit(0);
        if ("cancel".equals(e.getActionCommand()))
            JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn hủy bỏ không?");
    }
}
