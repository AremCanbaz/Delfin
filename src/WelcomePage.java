import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class WelcomePage implements ActionListener {

    JFrame homeFrame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    JButton logoutbButton = new JButton();
    JPanel topPanel = new JPanel();
    JButton createMemberButton = new JButton();
    JButton memberOverviewButton = new JButton();
    JButton paymentOverviewButton = new JButton();
    JButton  recordsOverviewButton= new JButton();
    JButton createRecordButton = new JButton();



    WelcomePage(String userID){

        topPanel.setVisible(true);
        topPanel.setBounds(0,0,1550,100);
        topPanel.setBackground(Color.blue);


        welcomeLabel.setBounds(100,100,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hi " + "\n" +  userID);

        logoutbButton.setBounds(1420,0,100,25);
        logoutbButton.addActionListener(this);
        logoutbButton.setText("Log out");

        createMemberButton.setBounds(100,100,100,35);
        createMemberButton.addActionListener(this);
        createMemberButton.setText("Create Member");

        memberOverviewButton.setBounds(100,100,100,35);
        memberOverviewButton.addActionListener(this);
        memberOverviewButton.setText("Member Overview");

        paymentOverviewButton.setBounds(100,100,100,35);
        paymentOverviewButton.addActionListener(this);
        paymentOverviewButton.setText("Payment Overview");

        recordsOverviewButton.setBounds(100,100,100,35);
        recordsOverviewButton.addActionListener(this);
        recordsOverviewButton.setText("Records Overview");

        createRecordButton.setBounds(100,100,100,35);
        createRecordButton.addActionListener(this);
        createRecordButton.setText("Create Record");



        topPanel.add(welcomeLabel);
        topPanel.add(createMemberButton);
        topPanel.add(memberOverviewButton);
        topPanel.add(paymentOverviewButton);
        topPanel.add(createRecordButton);
        topPanel.add(recordsOverviewButton);
        topPanel.add(logoutbButton,BorderLayout.EAST);


        homeFrame.add(topPanel);
        homeFrame.add(welcomeLabel);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setSize(1550,1200);
        homeFrame.setVisible(true);
        homeFrame.setLayout(null);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== logoutbButton){
            homeFrame.dispose();
            @SuppressWarnings("unused")
            LoginPage loginPage = new LoginPage(null);
        }
        if(e.getSource()== createMemberButton){
            CreateMember createMember = new CreateMember();
        }
    }
}

