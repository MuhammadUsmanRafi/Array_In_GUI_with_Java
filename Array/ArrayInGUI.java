import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class ArrayInGUI {

    static int[] array;
    public static void main(String[] args) {

        JFrame frame=new JFrame("Arrays");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Enter indexes");
        JLabel label1=new JLabel("  Enter array with , sep");
        JLabel label2=new JLabel();

        JTextField field=new JTextField(16);
        JTextField field1=new JTextField(16);

        JButton button=new JButton("OK");
        JButton button1=new JButton("Ok print");

        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(field);
        panel.add(button);
        panel.add(label1);
        panel.add(field1);
        panel.add(button1);
        panel.add(label2);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array=new int[Integer.parseInt(field.getText())];
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = field1.getText();

                String[] copy = s.split(",");

                if (copy.length == array.length) {
                    for (int i = 0; i < copy.length; i++) {
                        array[i] = Integer.parseInt(copy[i]);
                    }

                    label2.setText("   " + Arrays.toString(array));
                } else {
                    label2.setText("Error please enter" + array.length + " element");
                }
            }
        });

        frame.add(panel);
        frame.setSize(200,300);
        frame.show();

    }

}
