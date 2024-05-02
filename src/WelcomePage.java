import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class WelcomePage implements ActionListener {

    JFrame homeFrame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    JButton logoutbButton = new JButton();


    WelcomePage(String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hi " + "\n" +  userID);
        logoutbButton.setBounds(1420,0,100,25);
        logoutbButton.addActionListener(this);
        logoutbButton.setText("Log out");

        homeFrame.add(welcomeLabel);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setSize(1550,1200);
        homeFrame.setVisible(true);
        homeFrame.setLayout(null);
        homeFrame.add(logoutbButton);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== logoutbButton){
            homeFrame.dispose();
            @SuppressWarnings("unused")
            LoginPage loginPage = new LoginPage(null);
        }
    }
}
