import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




class FourthWidget {
    JPanel panel;
    public FourthWidget(){
        panel = new JPanel();
        JTextField textforbutton = new JTextField(10);
        JButton button = new JButton("Пометитить");
        JCheckBox checkbox1 = new JCheckBox("Первый");
        JCheckBox checkbox2 = new JCheckBox("Второй");
        JCheckBox checkbox3 = new JCheckBox("Третий");
        
        panel.add(button);
        panel.add(textforbutton);
        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(checkbox3);     
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textforbutton.getText();
                if (str.equals(checkbox1.getText()))
                    checkbox1.setSelected(true);
                else if (str.equals(checkbox2.getText()))
                        checkbox2.setSelected(true);
                    else if (str.equals(checkbox3.getText()))
                        checkbox3.setSelected(true);
                        else JOptionPane.showMessageDialog(null, "Такого имени элемента не найдено");
            }
        });
        
    }
    JPanel getPanel(){
        return panel;
    }
}