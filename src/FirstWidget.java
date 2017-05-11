import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class FirstWidget{
    JPanel panel;
    public FirstWidget(){
        panel = new JPanel();
        JComboBox combo = new JComboBox();
        JButton button = new JButton("Добавить");
        JTextField textforcombo = new JTextField(10);
        
        combo.setPreferredSize(new Dimension(100,20));
        
        panel.add(combo);
        panel.add(textforcombo);
        panel.add(button);
        
        button.addActionListener(new ActionListener(){
            int index;
            @Override
            public void actionPerformed(ActionEvent e){
                String massiv = textforcombo.getText();
                                
                for (index = 0; index < combo.getItemCount(); index++){
                    if (massiv.equals(combo.getItemAt(index))){
                        JOptionPane.showMessageDialog(null, "Такой элемент уже есть");
                        break;
                    }
                }
                if (index == combo.getItemCount()){
                    combo.addItem(textforcombo.getText());
                }  
                textforcombo.setText("");
            }
        });
      
    }    
    
    JPanel getPanel(){
        return panel;
    }
}