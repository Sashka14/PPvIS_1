import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




class FifthWidget {
    JPanel panel;
    public FifthWidget(){
        panel = new JPanel();
        JTextField textforbutton = new JTextField(10);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JTable table = new JTable(5,2);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(textforbutton);
        panel.add(table);

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textforbutton.getText();
                table.setValueAt(str, 1, 0);
                textforbutton.setText("");
            }
        });
        
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = (String) table.getValueAt(1, 0);
                table.setValueAt(str, 1, 1);
                table.setValueAt("", 1, 0);
            }
        });
        
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = (String) table.getValueAt(1, 1);
                table.setValueAt(str, 1, 0);
                table.setValueAt("", 1, 1);
            }
        });
    }
    JPanel getPanel(){
        return panel;
    }
}
