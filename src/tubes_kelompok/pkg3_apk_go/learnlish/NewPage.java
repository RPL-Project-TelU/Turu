//import required classes and packages 
package tubes_kelompok.pkg3_apk_go.learnlish;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
  
//create NewPage class to create a new page on which user will navigate  
class NewPage extends JFrame implements ActionListener  
{  
    //constructor  
    NewPage()  
    {  
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(400, 200);  
        JButton b1 = new JButton("MULAI QUIZ"); 
        JPanel newPanel = new JPanel(new GridLayout(0, 1));
        newPanel.add(b1);             
        add(newPanel, BorderLayout.CENTER);  
        b1.addActionListener(this);
    }  
    public void actionPerformed(ActionEvent ae)       
    {  
        this.dispose();
        kuis quiz = new kuis();
    }
}