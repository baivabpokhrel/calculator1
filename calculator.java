/**
 * Created by Baivab on 10/17/16.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.geom.Arc2D;


public class Calculator extends JFrame
{

     static double  a=0;
    static int counter=0;
    static double b=0,result=0,memory=0;
    static int operator=0;
    static String b1,b2;

    public Calculator()
    {
        super("Calculator");






        JPanel buttonPanel = new JPanel(new GridLayout(5,5));
        add(buttonPanel, BorderLayout.CENTER);

        JButton oneButton = new JButton("1");



        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");

        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");

        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");

        JButton zeroButton = new JButton("0");
        JButton mutliplyButton = new JButton("*");
        JButton divisionButton = new JButton("/");
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton dotButton = new JButton(".");

        JButton mplusButton = new JButton("m+");
        JButton mminusButton = new JButton("m-");
        JButton mcButton = new JButton("mc");
        JButton backButton = new JButton("<=");
        JButton mrButton=new JButton("mr");
        JButton CButton = new JButton("C ");
        JButton emptyButton = new JButton(" ");
        JButton empty1Button = new JButton(" ");
        JButton empty2Button=new JButton("");
        JButton equalButton = new JButton("=");


        oneButton.setFont(new Font("Arial",Font.BOLD,32));
        twoButton.setFont(new Font("Arial",Font.BOLD,32));
        threeButton.setFont(new Font("Arial",Font.BOLD,32));
        fourButton.setFont(new Font("Arial",Font.BOLD,32));
        fiveButton.setFont(new Font("Arial",Font.BOLD,32));
        sixButton.setFont(new Font("Arial",Font.BOLD,32));
        sevenButton.setFont(new Font("Arial",Font.BOLD,32));
        eightButton.setFont(new Font("Arial",Font.BOLD,32));
        nineButton.setFont(new Font("Arial",Font.BOLD,32));
        zeroButton.setFont(new Font("Arial",Font.BOLD,32));
        dotButton.setFont(new Font("Arial",Font.BOLD,32));
        plusButton.setFont(new Font("Arial",Font.BOLD,32));
        minusButton.setFont(new Font("Arial",Font.BOLD,32));
        mutliplyButton.setFont(new Font("Arial",Font.BOLD,32));
        divisionButton.setFont(new Font("Arial",Font.BOLD,32));
        CButton.setFont(new Font("Arial",Font.BOLD,32));
        mcButton.setFont(new Font("Arial",Font.BOLD,32));
        mplusButton.setFont(new Font("Arial",Font.BOLD,32));
        mminusButton.setFont(new Font("Arial",Font.BOLD,32));
        mrButton.setFont(new Font("Arial",Font.BOLD,32));
        equalButton.setFont(new Font("Arial",Font.BOLD,32));
        backButton.setFont(new Font("Arial",Font.BOLD,32));



        buttonPanel.add(oneButton);
        buttonPanel.add(twoButton);
        buttonPanel.add(threeButton);

        buttonPanel.add(backButton);
        buttonPanel.add(CButton);

        buttonPanel.add(fourButton);
        buttonPanel.add(fiveButton);
        buttonPanel.add(sixButton);

        buttonPanel.add(plusButton);
        buttonPanel.add(minusButton);

        buttonPanel.add(sevenButton);
        buttonPanel.add(eightButton);
        buttonPanel.add(nineButton);

        buttonPanel.add(mutliplyButton);
        buttonPanel.add(divisionButton);

        buttonPanel.add(zeroButton);




        buttonPanel.add(mrButton);
        buttonPanel.add(mplusButton);
        buttonPanel.add(mminusButton);
        buttonPanel.add(mcButton);

        buttonPanel.add(dotButton);


        buttonPanel.add(emptyButton);
        buttonPanel.add(empty1Button);
        buttonPanel.add(empty2Button);
        buttonPanel.add(equalButton);








        JTextField textField = new JTextField();

        textField.setFont(new Font("Arial",Font.BOLD,32));

        textField.addActionListener( e -> System.out.println(textField.getText()));

        add(textField, BorderLayout.NORTH);


        textField.setHorizontalAlignment( SwingConstants.RIGHT);


        oneButton.addActionListener(
                e -> {

        textField.setText( textField.getText() + 1);
                });
        twoButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 2);
                });
        threeButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 3);
                });

        fourButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 4);
                });
        fiveButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 5);
                });
        sixButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 6);
                });

        sevenButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 7);
                });
        eightButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 8);
                });
        nineButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 9);
                });

        zeroButton.addActionListener(
                e -> {

                    textField.setText( textField.getText() + 0);
                });

        dotButton.addActionListener(
                e -> textField.setText( textField.getText() + '.'));


        plusButton.addActionListener(e -> {
            a=Double.parseDouble(textField.getText());
            operator=1;

            textField.setText(""+a+"+");

            String text = textField.getText();
            counter = text.length();


            });



        minusButton.addActionListener( e->{


             a=Double.parseDouble(textField.getText());
             operator=2;

            textField.setText(""+a+"-");
            String text = textField.getText();
            counter = text.length();});

       divisionButton.addActionListener(e -> {

            a=Double.parseDouble(textField.getText());
            operator=3;
           textField.setText(""+a+"/");


           String text = textField.getText();
           counter = text.length();});


        mutliplyButton.addActionListener(e -> {

            a=Double.parseDouble(textField.getText());
            operator=4;
            textField.setText(""+a+"*");

            String text = textField.getText();
            counter = text.length();});

            equalButton.addActionListener( e-> {
                String s = textField.getText();
                textField.setText("");

                for (int i = counter; i < s.length(); i++)
                    textField.setText(textField.getText() + s.charAt(i));


                b=Double.parseDouble(textField.getText());

                switch( operator)
                {
                    case 1: result=a+b;
                        break;

                    case 2: result=a-b;
                        break;
                    case 3: result=a/b;
                        break;
                    case 4: result=a*b;
                        break;



                    default: result=0;
                }

                textField.setText(""+result);
            });

    CButton.addActionListener(

        e ->{

        textField.setText( "");});

        backButton.addActionListener( e-> {


                String s = textField.getText();
                textField.setText("");
                for (int i = 0; i < s.length() - 1; i++)
                    textField.setText(textField.getText() + s.charAt(i));
            });
        mrButton.addActionListener(

                e ->{

                    textField.setText( ""+memory);});



        mplusButton.addActionListener( e->{


        a = Double.parseDouble(textField.getText());

        memory=memory+a;
            textField.setText("");
        });

        mminusButton.addActionListener( e->{


            a = Double.parseDouble(textField.getText());

          memory=memory-a;
            textField.setText("");
        });

        mcButton.addActionListener( e->{


            memory=0;});







        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(350, 500);
            setResizable(false);
            setVisible(true);

        }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}
