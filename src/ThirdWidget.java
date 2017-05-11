import java.awt.event.*;
import javax.swing.*;



class ThirdWidget{
    JPanel panel;
    public ThirdWidget(){
        panel = new JPanel();
        JTextField textforbutton = new JTextField(10);
        JButton button = new JButton("Пометитить");
        JRadioButton radiobutton1 = new JRadioButton("Первый");
        JRadioButton radiobutton2 = new JRadioButton("Второй");
        JRadioButton radiobutton3 = new JRadioButton("Третий");

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(radiobutton1);
        buttongroup.add(radiobutton2);
        buttongroup.add(radiobutton3);
        
        panel.add(button);
        panel.add(textforbutton);
        panel.add(radiobutton1);
        panel.add(radiobutton2);
        panel.add(radiobutton3);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textforbutton.getText();
                if (str.equals(radiobutton1.getText()))
                    radiobutton1.setSelected(true);
                else if (str.equals(radiobutton2.getText()))
                        radiobutton2.setSelected(true);
                    else if (str.equals(radiobutton3.getText()))
                        radiobutton3.setSelected(true);
                        else JOptionPane.showMessageDialog(null, "Такого имени элемента не найдено");
            }
        });
    }
    JPanel getPanel(){
        return panel;
    }
}