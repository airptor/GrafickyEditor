import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow (int width, int height) {
        setSize(width, height);
        setTitle("App");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel labNum1 = new JLabel("Zadejte 1. číslo:");
        JLabel labNum2 = new JLabel("Zadejte 2. číslo:");

        JTextField num1Input = new JTextField();
        num1Input.setColumns(5);
        JTextField num2Input = new JTextField();
        num2Input.setColumns(5);
        JTextField vysledekF = new JTextField();
        vysledekF.setColumns(5);

        JButton btnSecist = new JButton("Sečíst");
        btnSecist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(num1Input.getText());
                    int num2 = Integer.parseInt(num2Input.getText());
                    int vysledek = num1 + num2;
                    vysledekF.setText(Integer.toString(vysledek));
            }
        });

        add(labNum1);
        add(num1Input);
        add(labNum2);
        add(num2Input);
        add(btnSecist);
        add(vysledekF);




//        JLabel labHello = new JLabel("Hello");
//        add(labHello);
//
//        JTextField txtInput = new JTextField();
//        txtInput.setText("Hello");
//        txtInput.setEditable(false);
//        add(txtInput);
//
//        JButton btnSubmit = new JButton("Submit");
//        add(btnSubmit);
//        btnSubmit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                txtInput.setText("Bye");
//                JOptionPane.showMessageDialog(null, "Zadej číslo");
//            }
//        });
    }
}
