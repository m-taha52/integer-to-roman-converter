import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.*;

public class roman extends JFrame {
    JTextField j1, j2;
    ArrayList<Integer> numarray = new ArrayList<Integer>(
        Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100
        )); 
    
    ArrayList<String> romanarray = new ArrayList<String>(
        Arrays.asList("N","I", "II","III","IV","V", "VI"," VII", "VIII", "IX", "X"," XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI,","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"));


   roman() {
        JLabel l1 = new JLabel("Enter Number: ");
		JLabel l2 = new JLabel("Roman is: ");
		j1 = new JTextField(20);
        j2 = new JTextField(20);
        JPanel panel = new JPanel(new GridLayout(3,2));
        JButton b1 = new JButton("Result");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String number = j1.getText();
            int num = Integer.parseInt(number);
            int x = numarray.indexOf(num);
           String roman = romanarray.get(x);
           j2.setText(roman);
            }
        });

        JButton b2 = new JButton("Clear");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                j1.setText("");
                j2.setText("");

            }
        });

        panel.add(l1);
        panel.add(j1);
        panel.add(l2);
        panel.add(j2);
        panel.add(b1);
        panel.add(b2);
        add(panel);
        setVisible(true);
        pack();
    }

        public static void main(String[] args) {
            
            roman s1 = new roman();
        }




        
        
        
    }

