import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStname;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton upisiButton;
    private JPanel studentPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().studentPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        upisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int o1,o2,o3, uku;
                double prosjek;

                o1 = Integer.parseInt(txtMarks1.getText());
                o2 = Integer.parseInt(txtMarks2.getText());
                o3 = Integer.parseInt(txtMarks3.getText());

                uku = o1 + o2 + o3;

                txtTotal.setText(String.valueOf(uku));

                prosjek = uku/3;

                txtAvg.setText(String.valueOf(prosjek));

                if (prosjek > 50)
                {
                    txtGrade.setText("Prolaz");
                }
                else
                {
                    txtGrade.setText("Ponovo na ispit");
                }
            }
        });
    }

}
