import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * @author Hermann Nji Ndeh
 * 11/22/2021
 * this creates the GUI and has all controls for the buttons
 */
public class RockPaperScissorsGUI {

    String[] announce = {"TIE", "CPU WINS", "PLAYER WINS"};

    //declartion for the frames and buttons
    private JFrame frame;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JButton quitButton;

    //declaratiuons for the width, height, value, and verdict of the game
    private int width;
    private int height;
    public int value;
    private String verdict;

    //this declares the scoreboard variables
    public int playerScore;
    public int cpuScore;
    public int tieScore;

    /**
     * 
     * @param w
     * @param h
     */
    public RockPaperScissorsGUI(int w, int h) {
        
        //
        frame = new JFrame();

        //container for the buttons
        Container panel = frame.getContentPane();
            panel.setLayout(null);

        //location, size, name, and color for the rock button
        rockButton = new JButton("ROCK");
        rockButton.setBackground(Color.gray);
        rockButton.setBounds(110, 140, 100, 100);

        //location, size, name, and color for the paper button
        paperButton = new JButton("PAPER");
        paperButton.setBackground(Color.white);
        paperButton.setBounds(280, 40, 100, 100);

        //location, size, name, and color for the scissors button
        scissorsButton = new JButton("SCISSORS");
        scissorsButton.setBackground(Color.CYAN);
        scissorsButton.setBounds(450, 140, 100, 100);

        //location, size, name, and color for the quit button
        quitButton = new JButton("QUIT");
        quitButton.setBounds(280, 300, 100, 50);

        //this adds the buttons to the panel and make them visibale not fill up the whole screen
        panel.add(rockButton);
        panel.add(paperButton);
        panel.add(scissorsButton);
        panel.add(quitButton);

        width = w;
        height = h;

        
    }


    


    /**
     * this sets up the GUI with the buttons and title for the game
     */
    public void setUpGUI() {
        frame.setSize(width, height);
        frame.setTitle("Rock, Paper, Scissors");
        frame.add(rockButton);
        frame.add(paperButton);
        frame.add(scissorsButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * this sets up the button listeners for all buttons in the GUI
     */
    public void setUpButtonListeners() {
        //
        //this is the action listener for the rock button
        //all actions here will be performed when the rock button is clicked
        //
        ActionListener rockListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                value = 1;

                Random rand = new Random();
                int cpu = rand.nextInt(3) + 1;

                if (cpu == 1) {
                    verdict = announce[0];
                    JOptionPane.showMessageDialog(null, "cpu threw rock too", "TIE", 1);
                }
                else if (cpu == 2) {
                    verdict = announce[1];
                    JOptionPane.showMessageDialog(null, "cpu threw paper", "CPU WINS", 1);
                }
                else if (cpu == 3) {
                    verdict = announce[2];
                    JOptionPane.showMessageDialog(null, "cpu threw scissors", "PLAYER WINS", 1);
                }


                //adds to tie, cpuscore, playerscore based on outcome and also changes position of buttons
                if (verdict.equals("PLAYER WINS")) {
                    playerScore++;
                    rockButton.setBounds(450, 140, 100, 100);
                    paperButton.setBounds(110, 140, 100, 100);
                    scissorsButton.setBounds(280, 40, 100, 100);
                }
                if (verdict.equals("CPU WINS")) {
                    cpuScore++;
                    rockButton.setBounds(280, 40, 100, 100);
                    paperButton.setBounds(450, 140, 100, 100);
                    scissorsButton.setBounds(110, 140, 100, 100);
                }
                if (verdict.equals("TIE")) {
                    tieScore++;
                    rockButton.setBounds(110, 140, 100, 100);
                    paperButton.setBounds(280, 40, 100, 100);
                    scissorsButton.setBounds(450, 140, 100, 100);
                }

                
            }
        };

        //
        //this is the action listener for the paper button
        //all actions here will be performed when the paper button is clicked
        //
        ActionListener paperListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //System.out.println("PAPER");
                
                value = 2;

                Random rand = new Random();
                int cpu = rand.nextInt(3) + 1;
                //System.out.println(cpu);

                if (cpu == 2) {
                    verdict = announce[0];
                    JOptionPane.showMessageDialog(null, "cpu threw paper too", "TIE", 1);
                }
                else if (cpu == 1) {
                    verdict = announce[2];
                    JOptionPane.showMessageDialog(null, "cpu threw rock", "PLAYER WINS", 1);
                }
                else if (cpu == 3) {
                    verdict = announce[1];
                    JOptionPane.showMessageDialog(null, "cpu threw scissors", "CPU WINS", 1);
                }


                //adds to tie, cpuscore, playerscore based on outcome and also changes position of buttons
                if (verdict.equals("PLAYER WINS")) {
                    playerScore++;
                    rockButton.setBounds(450, 140, 100, 100);
                    paperButton.setBounds(110, 140, 100, 100);
                    scissorsButton.setBounds(280, 40, 100, 100);
                }
                if (verdict.equals("CPU WINS")) {
                    cpuScore++;
                    rockButton.setBounds(280, 40, 100, 100);
                    paperButton.setBounds(450, 140, 100, 100);
                    scissorsButton.setBounds(110, 140, 100, 100);
                }
                if (verdict.equals("TIE")) {
                    tieScore++;
                    rockButton.setBounds(110, 140, 100, 100);
                    paperButton.setBounds(280, 40, 100, 100);
                    scissorsButton.setBounds(450, 140, 100, 100);
                }

            }
        };

        //
        //this is the action listener for the scissors button
        //all actions here will be performed when the scissors button is clicked
        //
        ActionListener scissorsListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                value = 3;

                Random rand = new Random();
                int cpu = rand.nextInt(3) + 1;

                if (cpu == 3) {
                    verdict = announce[0];
                    JOptionPane.showMessageDialog(null, "cpu threw scissors too", "TIE", 1);
                }
                else if (cpu == 1) {
                    verdict = announce[1];
                    JOptionPane.showMessageDialog(null, "cpu threw rock", "CPU WINS", 1);
                }
                else if (cpu == 2) {
                    verdict = announce[2];
                    JOptionPane.showMessageDialog(null, "cpu threw paper", "PLAYER WINS", 1);
                }


                //adds to tie, cpuscore, playerscore based on outcome and also changes position of buttons
                if (verdict.equals("PLAYER WINS")) {
                    playerScore++;
                    rockButton.setBounds(450, 140, 100, 100);
                    paperButton.setBounds(110, 140, 100, 100);
                    scissorsButton.setBounds(280, 40, 100, 100);
                }
                if (verdict.equals("CPU WINS")) {
                    cpuScore++;
                    rockButton.setBounds(280, 40, 100, 100);
                    paperButton.setBounds(450, 140, 100, 100);
                    scissorsButton.setBounds(110, 140, 100, 100);
                }
                if (verdict.equals("TIE")) {
                    tieScore++;
                    rockButton.setBounds(110, 140, 100, 100);
                    paperButton.setBounds(280, 40, 100, 100);
                    scissorsButton.setBounds(450, 140, 100, 100);
                }

                
            }
        };

        //
        //this is the action listener for the quit button
        //all actions here will be performed when the quit button is clicked
        //
        ActionListener quitListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                //dialog box for when the game is over
                JOptionPane.showMessageDialog(null, "               Thank you for playing!!!     \n     The results of your gameplay will be in a text file, Score.txt ", "GAME OVER", 1);
                
                //creates and stores file wioth scoreboard
                PrintWriter write;
                try {
                    write = new PrintWriter("Score.txt");
                    write.println(" ____________________________");
                    write.println("| Results from previous game |");
                    write.println(" ____________________________");
                    write.println("     Player wins: " + playerScore);
                    write.println("     CPU wins: " + cpuScore);
                    write.println("     TIES: " + tieScore);
                    write.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                
                //then exits the app
                System.exit(0);

            }
        };
        
        //these connect the buttons to the action listeners so the actions can be performed when it is clicked
        rockButton.addActionListener(rockListener);
        paperButton.addActionListener(paperListener);
        scissorsButton.addActionListener(scissorsListener);
        quitButton.addActionListener(quitListener);
    }


    
}