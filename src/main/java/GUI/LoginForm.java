package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

import com.formdev.flatlaf.FlatDarculaLaf;

public class LoginForm extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfusername;
    JPasswordField pfPassword;

    public void initialize() {
        /******************* Form Panel **********************/
        JLabel lbLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
        lbLoginForm.setFont(mainFont);

        JLabel lbusername = new JLabel("username");
        lbusername.setFont(mainFont);

        tfusername = new JTextField();
        tfusername.setFont(mainFont);

        JLabel lbPassword = new JLabel("Password");
        lbPassword.setFont(mainFont);

        pfPassword = new JPasswordField();
        pfPassword.setFont(mainFont);

        JPanel formpanel = new JPanel();
        formpanel.setLayout(new GridLayout(0, 1, 10, 10));
        formpanel.add(lbLoginForm);
        formpanel.add(lbusername);
        formpanel.add(tfusername);
        formpanel.add(lbPassword);
        formpanel.add(pfPassword);
        /* buttons */
        JButton btnlogin = new JButton("Login");
        btnlogin.setFont(mainFont);
        btnlogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfusername.getText();
                String password = String.valueOf(pfPassword.getPassword());

                User user = getAuthenticatedUser(username, password);

                if (user != null) {
                    MainFrame mainframe = new MainFrame();
                    mainframe.initialize(user);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this,
                            "Username atau password invalid",
                            "coba lagi", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        JButton btncancel = new JButton("Cancel");
        btncancel.setFont(mainFont);
        btncancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 19, 0));
        buttonsPanel.add(btnlogin);
        buttonsPanel.add(btncancel);

        /* frame */
        add(formpanel, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.SOUTH);

        setTitle("Login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        setMinimumSize(new Dimension(350, 400));
        ;
        // setResizable(flase);
        setLocationRelativeTo(null);
        ;
        setVisible(true);
    }

    private User getAuthenticatedUser(String username, String password) {
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost/login?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            String sql = "SELECT * FROM login WHERE username=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.username = resultSet.getString("username");
                user.password = resultSet.getString("password");
            }

            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Database connection failed!");
        }

        return user;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        LoginForm loginForm = new LoginForm();
        loginForm.initialize();
    }

}
