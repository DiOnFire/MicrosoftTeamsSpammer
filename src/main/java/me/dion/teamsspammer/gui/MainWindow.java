package me.dion.teamsspammer.gui;

import me.dion.teamsspammer.bot.BotManager;

import javax.swing.*;
import java.awt.*;
import java.io.File;

// I'm too lazy to write this using JavaFX :/

public class MainWindow extends JFrame {
    private JFileChooser chooser;
    private JLabel selectedDriverLabel;
    private JTextArea linkArea;
    private BotManager manager;
    private JTextField botAmount;
    private File driverFile, audioFile, videoFile;
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
        JTextField delay = new JTextField();

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

        JLabel enterLinkLabel = new JLabel("Enter conference link...");
        enterLinkLabel.setBounds(10, 285, 200, 10);
        container.add(enterLinkLabel);

        selectedDriverLabel = new JLabel("NONE");
        selectedDriverLabel.setBounds(250, 30, 1000, 10);
        container.add(selectedDriverLabel);

        JLabel selectedAudio = new JLabel("NONE");
        selectedAudio.setBounds(250, 90, 1000, 10);
        container.add(selectedAudio);

        JLabel selectedVideo = new JLabel("NONE");
        selectedVideo.setBounds(250, 150, 1000, 10);
        container.add(selectedVideo);

        JButton selectDriverButton = new JButton("Select driver...");
        selectDriverButton.setBounds(10, 10, 200, 50);
        selectDriverButton.addActionListener(e -> {
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = chooser.showOpenDialog(MainWindow.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                driverFile = chooser.getSelectedFile();
                selectedDriverLabel.setText(driverFile.getAbsolutePath());
            }
        });
        container.add(selectDriverButton);

        JButton selectAudioButton = new JButton("Select audio file (WAV)");
        selectAudioButton.setBounds(10, 70, 200, 50);
        selectAudioButton.addActionListener(e -> {
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = chooser.showOpenDialog(MainWindow.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                audioFile = chooser.getSelectedFile();
                selectedAudio.setText(audioFile.getAbsolutePath());
            }
        });
        container.add(selectAudioButton);

        JButton selectVideoButton = new JButton("Select video file (Y4M)");
        selectVideoButton.setBounds(10, 130, 200, 50);
        selectVideoButton.addActionListener(e -> {
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = chooser.showOpenDialog(MainWindow.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                videoFile = chooser.getSelectedFile();
                selectedVideo.setText(videoFile.getAbsolutePath());
            }
        });
        container.add(selectVideoButton);

        JButton startButton = new JButton("Connect!");
        startButton.setBounds(10, 620, 620, 50);
        startButton.addActionListener(e -> {
            manager = new BotManager(linkArea.getText(), driverFile.getAbsolutePath(), audioFile.getAbsolutePath(), videoFile.getAbsolutePath());
            manager.createBots(Short.parseShort(botAmount.getText()));
            manager.connect();
        });
        container.add(startButton);

        JButton toggleMicro = new JButton("Toggle microphones");
        toggleMicro.setBounds(630, 560, 620, 50);
        toggleMicro.addActionListener(e -> manager.toggleMicro());
        container.add(toggleMicro);

        JButton toggleCam = new JButton("Toggle cameras");
        toggleCam.setBounds(630, 500, 620, 50);
        toggleCam.addActionListener(e -> manager.toggleCam());
        container.add(toggleCam);

        JButton stopButton = new JButton("Disconnect");
        stopButton.setBounds(630, 620, 620, 50);
        stopButton.addActionListener(e -> manager.disconnect());
        container.add(stopButton);
    }
}
