import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class WelcomePage implements ActionListener{

    JFrame homeFrame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    JButton logoutButton = new JButton();
    JPanel topPanel = new JPanel();
    JButton createMemberButton = new JButton();
    JButton memberOverviewButton = new JButton();
    JButton paymentOverviewButton = new JButton();
    JButton recordsOverviewButton= new JButton();
    JButton createRecordButton = new JButton();
    JPanel contentPanel;
    CreateMember createMember;




    public WelcomePage(String userID) {
        welcomeLabel.setText("Welcome " + userID);
        homeFrame.setLayout(new FlowLayout());
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setVisible(true);
        homeFrame.add(topPanel);

        createMember = new CreateMember();

        topPanel.setLayout(new FlowLayout());
        topPanel.add(createMemberButton);
        topPanel.add(memberOverviewButton);
        topPanel.add(paymentOverviewButton);
        topPanel.add(recordsOverviewButton);
        topPanel.add(createRecordButton);
        topPanel.add(welcomeLabel);


        createRecordButton.setText("Create Record");
        createRecordButton.addActionListener(this);
        logoutButton.setText("Logout");
        logoutButton.addActionListener(this);
        createMemberButton.setText("Create Member");
        memberOverviewButton.setText("Member Overview");
        memberOverviewButton.addActionListener(this);
        paymentOverviewButton.setText("Payment Overview");
        paymentOverviewButton.addActionListener(this);
        recordsOverviewButton.setText("Records Overview");
        recordsOverviewButton.addActionListener(this);



            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            homeFrame.dispose();

        }
        if (e.getSource() == createMemberButton) {
            JPanel memberPanel = createMember.createMemberPanel();
            contentPanel.removeAll();
            contentPanel.add(memberPanel);
            contentPanel.revalidate();
            contentPanel.repaint();
        }
    }
}


