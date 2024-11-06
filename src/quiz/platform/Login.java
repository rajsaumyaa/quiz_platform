package quiz.platform;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

        Login(){

                getContentPane().setBackground(Color.WHITE);

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource())
                setSize(1200, 500);
                setLocation(400, 200);
                setVisible(true);
        }

        public static void main(String[] args){
                new Login();
        }
        }



