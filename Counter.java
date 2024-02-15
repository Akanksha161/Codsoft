import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class Counter extends JFrame implements ActionListener{  
    JLabel lb1,lb2;  
    JTextArea ta;  
    JButton b;  
     
    Counter(){  
        super("WordCounter");  
        lb1=new JLabel("Characters: ");  
        lb1.setBounds(50,50,100,20);  
        lb2=new JLabel("Words: ");  
        lb2.setBounds(50,80,100,20);  
          
        ta=new JTextArea();  
        ta.setBounds(50,110,300,200);  
          
        b=new JButton("click");  
         
        b.setBounds(150,320, 80,30);//x,y,w,h 
        b.addActionListener(this);  
        
        add(lb1);add(lb2);add(ta);add(b); 
        setSize(400,400); 
        //using no layout manager  
        setLayout(null);
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b){  
        String text=ta.getText();  
        lb1.setText("Characters: "+text.length());  
        String words[]=text.split("\\s");  
        lb2.setText("Words: "+words.length);  
        }
        } 
public static void main(String[] args) {  
    new Counter();  
}}  