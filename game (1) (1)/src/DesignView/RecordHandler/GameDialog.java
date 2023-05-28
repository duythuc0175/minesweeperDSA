package DesignView.RecordHandler;
import DesignView.Frames.GUI;


import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameDialog extends JFrame {
    private JTextArea textArea;

    public GameDialog() {
        setTitle("Game Records");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16)); // Set a larger font size
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);


        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {
            dispose();
            GUI gui = new GUI();
            gui.setVisible(true);
        });
        buttonPanel.add(backButton);


        loadRecords();
        printRecords();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void printRecords() {
        ArrayList<RecordItem> recordItems = GameRecords.getRecordItems();
        StringBuilder sb = new StringBuilder();
        for (RecordItem item : recordItems) {
            sb.append("Name: ").append(item.getName()).append(", Score: ").append(item.getRecord()).append("\n");
        }
        textArea.setText(sb.toString());
    }

    private void loadRecords() {
        GameRecords.loadRecords();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameDialog::new);
    }
}
