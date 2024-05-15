import javax.swing.*;
import java.awt.*;

public class CreateMember {
    public JPanel createMemberPanel() {
        // Set up panel
        JPanel createMemberPanel = new JPanel();
        createMemberPanel.setLayout(new GridLayout(0, 2, 10, 10)); // GridLayout with 2 columns and 10px horizontal and vertical gap
        createMemberPanel.setBackground(Color.BLUE);
        createMemberPanel.setBorder(BorderFactory.createTitledBorder("Create Member"));

        // Initialize components
        JTextField memberFirstName = new JTextField("Enter First Name", 20);
        JTextField memberLastName = new JTextField("Enter Last Name", 20);
        JComboBox<Integer> birthDay = new JComboBox<>(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}); // Example dropdown
        JComboBox<Integer> birthMonth = new JComboBox<>(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12}); // Example dropdown
        JComboBox<Integer> birthYear = new JComboBox<>(new Integer[]{1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017}); // Example dropdown
        JComboBox<String> gender = new JComboBox<>(new String[]{"Male", "Female"}); // Example dropdown

        // Add components to panel
        createMemberPanel.add(new JLabel("First Name:"));
        createMemberPanel.add(memberFirstName);
        createMemberPanel.add(new JLabel("Last Name:"));
        createMemberPanel.add(memberLastName);
        createMemberPanel.add(new JLabel("Birth Day:"));
        createMemberPanel.add(birthDay);
        createMemberPanel.add(new JLabel("Birth Month:"));
        createMemberPanel.add(birthMonth);
        createMemberPanel.add(new JLabel("Birth Year:"));
        createMemberPanel.add(birthYear);
        createMemberPanel.add(new JLabel("Gender:"));
        createMemberPanel.add(gender);

        return createMemberPanel;
    }
    public void createMember(){
        System.out.println("Hi Welcome to create new Member Menu");

    }
}
