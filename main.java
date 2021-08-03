//Author: Robert Aimes
//Date: 08032021

package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws FileNotFoundException, IOException  {

        //Strings for each of the 11 questions

        String q1 = "What is your stance on abortion?\n" +
                "(a)I am Pro-Life\n(b)I am Pro-Choice\n(c)It should be judged on a case by case basis\n(d)No opinion";

        String q2 = "What is your stance on the Second Amendment (The Right to Bear Arms)?\n" +
                "(a)We should implement stricter gun control\n(b)I don't believe in any form of gun control policy\n(c)Gun control should only limit Assault Rifles\n(d)No opinion";

        String q3 = "Should the government impose higher taxes on The Rich?\n" +
                "(a)Yes, they should pay their fair share\n(b)No\n(c)It depends on where the tax money would be used\n(d)No opinion";

        String q4 = "What should be done to prevent climate change?\n" +
                "(a)Invest in The Green New Deal\n(b)Nothing\n(c)Reduce fracking and fossil fuel use\n(d)No opinion";

        String q5 = "Should illegal immigrants have the right to vote?\n" +
                "(a)Yes\n(b)No\n(c)If they are currently pursuing citizenship\n(d)No opinion";

        String q6 = "What is your stance on de-funding the police?\n" +
                "(a)We should de-fund the police\n(b)We should invest more in the police\n(c)We should de-fund the police and increase spending on social issues\n(d)No opinion";

        String q7 = "Do you support the legalization of same sex marriage?\n" +
                "(a)Yes\n(b)No\n(c)Take the government out of marriage\n(d)No opinion";

        String q8 = "What is your stance on Student Loan Forgiveness?\n" +
                "(a)All student loans should be forgiven\n(b)All students should be responsible to pay off their loans\n(c)A percentage of student loans should be forgiven for each borrower\n(d)Make all college free";

        String q9 = "Do you support a Universal Basic Income?\n" +
                "(a)Yes\n(b)No\n(c)Yes, enough to cover living expenses\n(d)No, it would incentive people to not work at all";

        String q10 = "Do you support the Affordable Health Care Act (Obamacare)\n" +
                "(a)Yes\n(b)No\n(c)Government should not be involved in healthcare\n(d)No opinion";

        String q11 = "Which Political Party do you affiliate with?\n" +
                "(a)Democratic Party\n(b)Republican Party\n(c)Green Party\n(d)Libertarian Party";

        //Array of questions
        Question [] questions = {
                new Question(q1),
                new Question(q2),
                new Question(q3),
                new Question(q4),
                new Question(q5),
                new Question(q6),
                new Question(q7),
                new Question(q8),
                new Question(q9),
                new Question(q10),
                new Question(q11)
        };

        //Calling the method to take the test
        takeTest(questions);


    }

    //Method to produce test and store data into text files for each political party
    public static void takeTest(Question[] questions) throws FileNotFoundException {
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();

            //if statements to check answer and send data to corresponding text file.
                if(answer.equals("a")){
                    PrintWriter dem = new PrintWriter("democrat.txt");
                    dem.println(answer);
                    dem.close();
                }

                if(answer.equals("b")){
                    PrintWriter dem = new PrintWriter("republican.txt");
                    dem.println(answer);
                    dem.close();
                }
                if(answer.equals("c")){
                    PrintWriter dem = new PrintWriter("green.txt");
                    dem.println(answer);
                    dem.close();
                }
                if(answer.equals("d")){
                    PrintWriter dem = new PrintWriter("libertarian.txt");
                    dem.println(answer);
                    dem.close();
                }

                //This is successful in sending the answers to q11 to it's corresponding party storage.
                //Having difficulty targeting q11's answers and sending all question answer data to the text files.
        }

    }

}
