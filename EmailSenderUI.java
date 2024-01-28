package viewmodel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EmailSenderUI extends JFrame{

    private JTextField smtpServerField;
    private JTextField portField;
    private JTextArea recipientListArea;
    private JTextArea emailContentArea;

    public EmailSenderUI() {
        setTitle("Automated Email Sender");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(400, 400));

        initComponents();
        addComponents();
        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void initComponents() {
        smtpServerField = new JTextField();
        smtpServerField.setToolTipText("SMTP Server");

        portField = new JTextField();
        portField.setToolTipText("Port");

        recipientListArea = new JTextArea();
        recipientListArea.setToolTipText("Enter recipient emails (one per line)");

        emailContentArea = new JTextArea();
        emailContentArea.setToolTipText("Enter email content");
    }

    private void addComponents() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Email Details Form
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("SMTP Server:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(smtpServerField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Port:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(portField, gbc);

        // Recipient List Form
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Recipient List:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridheight = 2;
        add(new JScrollPane(recipientListArea), gbc);
        gbc.gridheight = 1;

        // Email Content Form
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Email Content:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridheight = 2;
        add(new JScrollPane(emailContentArea), gbc);
        gbc.gridheight = 1;

        // Send Button
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        JButton sendButton = new JButton("Send Emails");
        add(sendButton, gbc);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to send emails using entered details
                // You may want to handle errors and provide feedback to the user
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmailSenderUI();
            }
        });
    }
}
