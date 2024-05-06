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
    JPanel createRecordPanel = new JPanel();
    JPanel recordPanel = new JPanel();
    JPanel memberPanel = new JPanel();
    JPanel paymentPanel = new JPanel();
    JPanel createMemberPanel = new JPanel();




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

        createRecordPanel.setBounds(0,100,1550,1000);
        createRecordPanel.setVisible(false);
        createRecordPanel.setBackground(Color.PINK);

        createMemberPanel.setBounds(0,100,1550,1000);
        createMemberPanel.setVisible(false);
        createMemberPanel.setBackground(Color.BLACK);

        recordPanel.setBounds(0,100,1550,1000);
        recordPanel.setVisible(false);
        recordPanel.setBackground(Color.RED);

        memberPanel.setBounds(0,100,1550,1000);
        memberPanel.setVisible(false);
        memberPanel.setBackground(Color.BLUE);

        paymentPanel.setBounds(0,100,1550,1000);
        paymentPanel.setVisible(false);
        paymentPanel.setBackground(Color.yellow);




        topPanel.add(welcomeLabel,BorderLayout.WEST);
        topPanel.add(createMemberButton);
        topPanel.add(memberOverviewButton);
        topPanel.add(paymentOverviewButton);
        topPanel.add(createRecordButton);
        topPanel.add(recordsOverviewButton);
        topPanel.add(logoutButton,BorderLayout.EAST);


        homeFrame.add(memberPanel);
        homeFrame.add(paymentPanel);
        homeFrame.add(recordPanel);
        homeFrame.add(createRecordPanel);
        homeFrame.add(createMemberPanel);
        homeFrame.add(topPanel);
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
            createMemberPanel.setVisible(true);
            createRecordPanel.setVisible(false);
            recordPanel.setVisible(false);
            paymentPanel.setVisible(false);
            memberPanel.setVisible(false);
        }
        if(e.getSource()== memberOverviewButton){
            memberPanel.setVisible(true);
            createMemberPanel.setVisible(false);
            createRecordPanel.setVisible(false);
            recordPanel.setVisible(false);
            paymentPanel.setVisible(false);
        }
        if(e.getSource()== paymentOverviewButton){
            memberPanel.setVisible(false);
            createMemberPanel.setVisible(false);
            createRecordPanel.setVisible(false);
            recordPanel.setVisible(false);
            paymentPanel.setVisible(true);
        }
        if(e.getSource()== recordsOverviewButton){
            memberPanel.setVisible(false);
            createMemberPanel.setVisible(false);
            createRecordPanel.setVisible(false);
            recordPanel.setVisible(true);
            paymentPanel.setVisible(false);
        }
        if(e.getSource()== createRecordButton){
            memberPanel.setVisible(false);
            createMemberPanel.setVisible(false);
            createRecordPanel.setVisible(true);
            recordPanel.setVisible(false);
            paymentPanel.setVisible(false);
        }

    }
}

