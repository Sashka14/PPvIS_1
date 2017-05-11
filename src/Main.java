import javax.swing.JFrame;
import javax.swing.JTabbedPane;



class MainJPanel{
    public MainJPanel(){
        JFrame frame = new JFrame("Лабораторная работа №1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setVisible(true);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        frame.add(tabbedPane);
        tabbedPane.add("Виджет №1", new FirstWidget().getPanel());
        tabbedPane.add("Виджет №2", new SecondWidget().getPanel());
        tabbedPane.add("Виджет №3", new ThirdWidget().getPanel());
        tabbedPane.add("Виджет №4", new FourthWidget().getPanel());
        tabbedPane.add("Виджет №5", new FifthWidget().getPanel());
    }

}

public class Main {
    public static void main(String[] args) {
        new MainJPanel();
    }   
}
