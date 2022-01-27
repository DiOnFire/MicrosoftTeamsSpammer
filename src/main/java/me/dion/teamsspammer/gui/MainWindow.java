package me.dion.teamsspammer.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

// I'm too lazy to write this using JavaFX :/

public class MainWindow extends JFrame {
    private JButton selectDriverButton, startButton, stopButton;
    private JFileChooser chooser;
    private JLabel selectedDriverLabel, enterLinkLabel;
    private JTextArea linkArea;
    private JTextField botAmount, delay;
    private File driverFile;
    private final Container container = new Container();

    public MainWindow() {
        super("Microsoft Teams Spammer");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(1280, 720);
        initWidgets();
        add(container);
        setVisible(true);
    }

    private void initWidgets() {
        chooser = new JFileChooser();
        linkArea = new JTextArea();
        botAmount = new JTextField();
        delay = new JTextField();

        JLabel count = new JLabel("Bot count");
        count.setBounds(10, 460, 200, 10);
        container.add(count);

        JLabel delay_ = new JLabel("Delay in ms");
        delay_.setBounds(10, 530, 200, 15);
        container.add(delay_);

        botAmount.setBounds(10, 475, 200, 50);
        container.add(botAmount);

        delay.setBounds(10, 552, 200, 50);
        container.add(delay);

        linkArea.setBounds(10, 300, 1245, 150);
        container.add(linkArea);

        enterLinkLabel = new JLabel("Enter conference link...");
        enterLinkLabel.setBounds(10, 285, 200, 10);
        container.add(enterLinkLabel);

        selectedDriverLabel = new JLabel("NONE");
        selectedDriverLabel.setBounds(250, 30, 1000, 10);
        container.add(selectedDriverLabel);



        selectDriverButton = new JButton("Select driver...");
        selectDriverButton.setBounds(10, 10, 200, 50);
        selectDriverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = chooser.showOpenDialog(MainWindow.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    driverFile = chooser.getSelectedFile();
                    selectedDriverLabel.setText(driverFile.getAbsolutePath());
                }
            }
        });
        container.add(selectDriverButton);

        startButton = new JButton("Start");
        startButton.setBounds(10, 620, 620, 50);
        container.add(startButton);

        stopButton = new JButton("Stop");
        stopButton.setBounds(630, 620, 620, 50);
        container.add(stopButton);
    }
}
