package keoTha;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.SimpleTimeZone;

public class LearnTable1 extends JFrame{

    /*
    Tài liệu tham khảo:
        https://codersontrang.wordpress.com/2012/08/20/74/
        https://codersontrang.wordpress.com/2012/08/22/su-dung-jtable-cua-swing-trong-java-phan-2/
        https://codersontrang.wordpress.com/2012/08/24/su-dung-jtable-cua-swing-trong-java-phan-3/
     */

    private JPanel MainPanel;
    private JTable showTable;
    private JTextField nameTextField;
    private JTextField addressTextField;
    private JTextField idTextField;
    private JTextField emailTextField;
    private JTextField phoneTextField;
    private JTextField dateTextField;
    private JTextField markTextField;
    private JButton addStudentButton;
    private JButton resetButton;

    private ArrayList<Student> list = new ArrayList<>();
    private int stt = 1;
    DefaultTableModel model;  // model dữ liệu của 1 hàng ngang của bảng


    public LearnTable1(String title) {
        super(title);

        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.pack();
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);

        createTable();
        model = (DefaultTableModel) showTable.getModel();  // lấy model từ bảng

        /* Sự kiện cho nút "Reset" */
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTextField.setText("");
                addressTextField.setText("");
                idTextField.setText("");
                emailTextField.setText("");
                phoneTextField.setText("");
                dateTextField.setText("");
                markTextField.setText("");
            }
        });

        /* Sự kiện cho nút "Add Students" */
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = null;
                try {
                    // định dạng ngày/tháng/năm  ---> xem ở "https://viettuts.vn/java-date/simpledateformat-trong-java"
                    date = (new SimpleDateFormat("dd/MM/yyyy").parse(dateTextField.getText()));
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }

                Student s = new Student(nameTextField.getText(), addressTextField.getText(),
                                        emailTextField.getText(), phoneTextField.getText(),
                                        idTextField.getText(), Float.parseFloat(markTextField.getText()), date);

                list.add(s);
                
                showResult();
            }

            /* thêm dữ liệu vào 1 hàng của bảng*/
            private void showResult() {
                Student s = list.get(list.size() - 1); // lấy thằng sinh viên cuối cùng trong danh sách để hiển thị
                model.addRow(new Object[]{   // thêm hàng
                        stt++, s.getID(), s.getName(), s.getDob(), s.getAddress(), s.getPhone(), s.getEmail(), s.getMark()
                });
                System.out.println(s);
            }
        });
    }


    /* tạo bảng */
    private void createTable() {
        showTable.setModel(new DefaultTableModel(
                null,  // dữ liệu (hàng)
                new String[] {"STT", "ID", "Full Name", "Date of birth", "Address", "Phone numbers", "Email", "Mark"}  // title cột
        ));

        TableColumnModel column = showTable.getColumnModel();  // create TableColumnModel
        column.getColumn(0).setMinWidth(10);  //  set size width column
        column.getColumn(2).setMinWidth(130);
        column.getColumn(5).setMinWidth(100);

        // preferredScrollable trong file ".form" để chỉnh kích thước của bảng

        // Căn giữa cho 1 ô chứa dữ liệu
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        column.getColumn(1).setCellRenderer(centerRenderer);
        column.getColumn(3).setCellRenderer(centerRenderer);
        column.getColumn(4).setCellRenderer(centerRenderer);
        column.getColumn(5).setCellRenderer(centerRenderer);
    }


    public static void main(String[] args) {
        LearnTable1 learnTable1 = new LearnTable1("Learn Table Lesson 1");
    }
}
