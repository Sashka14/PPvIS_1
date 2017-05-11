import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class SecondWidget{
    JPanel panel;
    public SecondWidget(){
        panel = new JPanel();
        JTextField textforbutton = new JTextField(10);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        button1.setPreferredSize(new Dimension(100,20));
        button2.setPreferredSize(new Dimension(100,20));

        panel.add(textforbutton);
        panel.add(button1);
        panel.add(button2);
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String str = textforbutton.getText();
                button2.setText(str);
            }            
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String str1 = button1.getText();
                String str2 = button2.getText();
                button1.setText(str2);
                button2.setText(str1);
            }            
        });
        
        }
    
    JPanel getPanel(){
        return panel;
    }
}