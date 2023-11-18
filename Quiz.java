

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizz/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "Indian experiences which type of climate.?";
        questions[0][1] = "Temperature climate";
        questions[0][2] = "Tropical Monsoon";
        questions[0][3] = "Temperature Continental Climate";
        questions[0][4] = "Mediterraranean climate";

        questions[1][0] = "The Deccan Plateau gets less rainfall than the Western Ghats because ";
        questions[1][1] = "it lies in the way of South West Monsoon winds";
        questions[1][2] = "it lies in the rainshadow area of the Himalayas";
        questions[1][3] = "it lies in the rainshadow area of the Western Ghats";
        questions[1][4] = "it is tringular in shape";

        questions[2][0] = "What cause the winter rain along the Coromandel Coast";
        questions[2][1] = "Sea breeze";
        questions[2][2] = "Retreating monsoon";
        questions[2][3] = "South-west monsoon";
        questions[2][4] = "Western disturbance";

        questions[3][0] = "Which of the following is NOT a source of rainfall for punjab and Haryana?";
        questions[3][1] = "Western disturbance";
        questions[3][2] = "Arabian Sea branch of South-west monsoon";
        questions[3][3] = "Bay of Bengal branch of South-west monsoon";
        questions[3][4] = "Retreating monsoon";

        questions[4][0] = "Which of the following factors does not affect the climate of place?";
        questions[4][1] = "Varied relief";
        questions[4][2] = "The Monsoon Winds";
        questions[4][3] = "Distance from the Sea";
        questions[4][4] = "Presence of Vegetation";

        questions[5][0] = "Western disturbances become active in the northern India during which season";
        questions[5][1] = "Summer";
        questions[5][2] = "Winter";
        questions[5][3] = "Spring";
        questions[5][4] = "Monsoon";

        questions[6][0] = "The Summer monsoon winds blows in which direction?";
        questions[6][1] = "North-East";
        questions[6][2] = "South-West";
        questions[6][3] = "North-West";
        questions[6][4] = "South-East";

        questions[7][0] = "Which of the following is the good for cultivation of tea and jute";
        questions[7][1] = "Mango showers";
        questions[7][2] = "Loo";
        questions[7][3] = "Kaal Baishakhi";
        questions[7][4] = "None of the above";

        questions[8][0] = "Where does the arabiab sea branch join the bay of bengal branch";
        questions[8][1] = "In punjab and haryana";
        questions[8][2] = "In western ghats";
        questions[8][3] = "In chota nagpur plateau";
        questions[8][4] = "In the Sahyadris";

        questions[9][0] = "What causes the 'october heat'";
        questions[9][1] = "High temperature and heavy rainfall";
        questions[9][2] = "reduce temperature amd heavy rainfall";
        questions[9][3] = "High tempearure and humidity";
        questions[9][4] = "Reduced temperature and humidity";

//Answers  of the above Questions
	 answers[0][1] = "Tropical Monsoon and climate";
        answers[1][1] = "it lies in the rainshadow area of the Western Ghats";
        answers[2][1] = "Retreating monsoon";
        answers[3][1] = "Retreating monsoon";
        answers[4][1] = "Presence of Vegetation";
        answers[5][1] = "Winter";
        answers[6][1] = "North-East";
        answers[7][1] = "Kaal Baishakhi";
        answers[8][1] = "In chota nagpur plateau";
        answers[9][1] = "High tempearure and humidity";
        //mcq select only one button
       opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);  //background color
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        groupoptions = new ButtonGroup();  //select only one option if select 1 rest will br disabled
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(0);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}
 