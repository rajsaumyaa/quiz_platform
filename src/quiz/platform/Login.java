package quiz.platform;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

        JTextField text;
        JButton Next;
        JButton back;

        Login(){

                getContentPane().setBackground(Color.WHITE);
                setLayout(null);

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/l2.jpg"));
                Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i);
                JLabel image = new JLabel(i2);
                image.setBounds(650,0,550,500);
                add(image);

                JLabel heading = new JLabel("QUIZ TEST");
                heading.setBounds(140,60,380,45);
                heading.setFont(new Font("Catholic", Font.BOLD,40));
                heading.setForeground(new Color(22,30,99));
                add(heading);


                JLabel name = new JLabel("Enter Your Name");
                name.setBounds(160,150,300,20);
                name.setFont(new Font("Mongolian Bait",Font.BOLD,18));
                name.setForeground(new Color(22,54,99));
                add(name);

                text = new JTextField();
                text.setBounds(80,200,300,25);
                text.setFont(new Font("Catholic",Font.BOLD, 18));
                add(text);

                Next = new JButton("Next");
                Next.setBounds(100,270,120,25);
                Next.setBackground(new Color(22,54,99));
                Next.setForeground(Color.WHITE);
                add(Next);

                back = new JButton("back");
                back.setBounds(80,200,300,25);
                back.setBackground(new Color(22,54,99));
                back.setForeground(Color.WHITE);
                add(back);





                setSize(1200, 500);
                setLocation(80, 30);
                setVisible(true);
        }

        public static void main(String[] args){
                new Login();
        }
        }



