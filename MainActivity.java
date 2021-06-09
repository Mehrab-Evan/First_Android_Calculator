package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 0, y = 0;
    long ans = 0;
    int count = 0;
    int count2 = 0;
    Boolean jellybean = false;
    int check = 0;
    public Button one, two, three, four, five, six, seven, eight, nine, zero, ac, plus, minus, multiple, divide, equal;
    public TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.One);
        two = findViewById(R.id.Two);
        three = findViewById(R.id.Three);
        four = findViewById(R.id.Four);
        five = findViewById(R.id.Five);
        six = findViewById(R.id.Six);
        seven = findViewById(R.id.Seven);
        eight = findViewById(R.id.Eight);
        nine = findViewById(R.id.Nine);
        zero = findViewById(R.id.Zero);
        ac = findViewById(R.id.AC);
        plus = findViewById(R.id.Plus);
        minus = findViewById(R.id.Minus);
        multiple = findViewById(R.id.Multiply);
        divide = findViewById(R.id.Divide);
        equal = findViewById(R.id.Equal);
        answer = findViewById(R.id.ShowResult);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false) {
                    if (count == 0) {
                        x = 1;
                        count = count + 1;
                    } else {
                        x = x * 10;
                        x = x + 1;
                    }
                    answer.setText(""+x);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false)
                {
                    if(count == 0)
                    {
                        x = 2;
                        count ++;
                    }
                    else
                    {
                        x = x * 10;
                        x = x + 2;
                    }
                    answer.setText(""+x);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false) {
                    if (count == 0) {
                        x = 3;
                        count++;
                    } else {
                        x = x * 10;
                        x = x + 3;
                    }
                    answer.setText("" + x);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false) {
                    if (count == 0) {
                        x = 4;
                        count++;
                    } else {
                        x = x * 10;
                        x = x + 4;
                    }
                    answer.setText("" + x);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false) {
                    if (count == 0) {
                        x = 5;
                        count++;
                    } else {
                        x = x * 10;
                        x = x + 5;
                    }
                    answer.setText("" + x);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false) {
                    if (count == 0) {
                        x = 6;
                        count = count + 1;
                    } else {
                        x = x * 10;
                        x = x + 6;
                    }
                    answer.setText(""+x);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false)
                {
                    if(count == 0)
                    {
                        x = 7;
                        count ++;
                    }
                    else
                    {
                        x = x * 10;
                        x = x + 7;
                    }
                    answer.setText(""+x);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false) {
                    if (count == 0) {
                        x = 8;
                        count++;
                    } else {
                        x = x * 10;
                        x = x + 8;
                    }
                    answer.setText("" + x);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false) {
                    if (count == 0) {
                        x = 9;
                        count++;
                    } else {
                        x = x * 10;
                        x = x + 9;
                    }
                    answer.setText("" + x);
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jellybean == false)
                {
                    x = x * 10;
                    answer.setText(""+x);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check = 1;
                y = x;
                x = 0;
                //System.out.print(" ");
                answer.setText(" ");
                //System.out.print("+ ");
                answer.setText("+ ");
                //jellybean = true;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                y = x;
                x = 0;
                //System.out.print(" ");
                answer.setText(" ");
                //System.out.print("- ");
                answer.setText("- ");
                // jellybean = true;
                check = 2;
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                y = x;
                x = 0;
               // System.out.print(" ");
                answer.setText(" ");
              //  System.out.print("X ");
                answer.setText("X ");
                //jellybean = true;
                check = 3;
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                y = x;
                x = 0;
               // System.out.print(" ");
                answer.setText(" ");
              //  System.out.print("/ ");
                answer.setText("/ ");
                //jellybean = true;
                check = 4;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.out.print(" = ");
                if(check == 1)
                {
                    ans = x + y;
                    //System.out.println(ans);
                    answer.setText(""+ans);
                }
                else if(check == 2)
                {
                    ans = y - x;
                    //System.out.println(ans);
                    answer.setText(""+ans); // Printing in the display using setText takes parameter as string so that answer is taking as a string
                }
                else if(check == 3)
                {
                    ans = x * y;
                    //System.out.println(ans);
                    answer.setText(""+ans); // Printing in the display using setText takes parameter as string so that answer is taking as a string
                }
                else if(check == 4)
                {
                    double f = (double)y / x;
                    //System.out.println(f);
                    answer.setText(""+f);
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 0;
                y = 0;
                ans = 0;
                answer.setText(""+0);
            }
        });
    }
}