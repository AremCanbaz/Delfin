import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class WelcomePage implements ActionListener {

    JFrame homeFrame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    JButton logoutButton = new JButton();
    JPanel topPanel = new JPanel();
    JButton createMemberButton = new JButton();
    JButton memberOverviewButton = new JButton();
    JButton paymentOverviewButton = new JButton();
    JButton recordsOverviewButton= new JButton();
    JButton createRecordButton = new JButton();
    JPanel createRecordFrame = new JPanel();
    JPanel recordFrame = new JPanel();
    JPanel memberFrame = new JPanel();
    JPanel paymentFrame = new JPanel();
    JPanel createMemberFrame = new JPanel();




    WelcomePage(String userID){

        topPanel.setVisible(true);
        topPanel.setBounds(0,0,1550,100);
        topPanel.setBackground(Color.blue);


        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hi " + "\n" +  userID);

        logoutButton.setBounds(1420,0,100,25);
        logoutButton.addActionListener(this);
        logoutButton.setText("Log out");

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

        createRecordFrame.setBounds(0,100,1550,1000);
        createRecordFrame.setVisible(false);
        createRecordFrame.setBackground(Color.PINK);

        createMemberFrame.setBounds(0,100,1550,1000);
        createMemberFrame.setVisible(false);
        createMemberFrame.setBackground(Color.BLACK);

        recordFrame.setBounds(0,100,1550,1000);
        recordFrame.setVisible(false);
        recordFrame.setBackground(Color.RED);

        memberFrame.setBounds(0,100,1550,1000);
        memberFrame.setVisible(false);
        memberFrame.setBackground(Color.BLUE);

        paymentFrame.setBounds(0,100,1550,1000);
        paymentFrame.setVisible(false);
        paymentFrame.setBackground(Color.yellow);




        topPanel.add(welcomeLabel);
        topPanel.add(createMemberButton);
        topPanel.add(memberOverviewButton);
        topPanel.add(paymentOverviewButton);
        topPanel.add(createRecordButton);
        topPanel.add(recordsOverviewButton);
        topPanel.add(logoutButton,BorderLayout.EAST);


        homeFrame.add(memberFrame);
        homeFrame.add(paymentFrame);
        homeFrame.add(recordFrame);
        homeFrame.add(createRecordFrame);
        homeFrame.add(createMemberFrame);
        homeFrame.add(topPanel);
        homeFrame.add(welcomeLabel);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setSize(1550,1200);
        homeFrame.setVisible(true);
        homeFrame.setLayout(null);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== logoutButton){
            homeFrame.dispose();
            @SuppressWarnings("unused")
            LoginPage loginPage = new LoginPage(null);
        }
        if(e.getSource()== createMemberButton){
            createMemberFrame.setVisible(true);
            createRecordFrame.setVisible(false);
            recordFrame.setVisible(false);
            paymentFrame.setVisible(false);
            memberFrame.setVisible(false);
        }
        if(e.getSource()== memberOverviewButton){
            memberFrame.setVisible(true);
            createMemberFrame.setVisible(false);
            createRecordFrame.setVisible(false);
            recordFrame.setVisible(false);
            paymentFrame.setVisible(false);
        }
        if(e.getSource()== paymentOverviewButton){
            memberFrame.setVisible(false);
            createMemberFrame.setVisible(false);
            createRecordFrame.setVisible(false);
            recordFrame.setVisible(false);
            paymentFrame.setVisible(true);
        }
        if(e.getSource()== recordsOverviewButton){
            memberFrame.setVisible(false);
            createMemberFrame.setVisible(false);
            createRecordFrame.setVisible(false);
            recordFrame.setVisible(true);
            paymentFrame.setVisible(false);
        }
        if(e.getSource()== createRecordButton){
            memberFrame.setVisible(false);
            createMemberFrame.setVisible(false);
            createRecordFrame.setVisible(true);
            recordFrame.setVisible(false);
            paymentFrame.setVisible(false);
        }

    }
}

