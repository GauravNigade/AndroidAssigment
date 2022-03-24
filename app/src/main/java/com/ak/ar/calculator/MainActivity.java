package com.ak.ar.calculator;

import static java.sql.Types.NULL;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    double no1 = 0, no2 = 0;
    TextView editText;
    boolean add, sub, divide, multiply, remainder, decimal;
    Button button_zero, button_one, button_two, button_three, button_four, button_five, button_six, button_seven, button_eight, button_nine,
            button_clearText, button_add, button_multiply, button_sub, button_divide, button_remainder, button_dot, button_equalTo, button_back, button_plusminus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button_one = findViewById(R.id.one);
        button_two = findViewById(R.id.two);
        button_three = findViewById(R.id.three);
        button_four = findViewById(R.id.four);
        button_five = findViewById(R.id.five);
        button_six = findViewById(R.id.six);
        button_seven = findViewById(R.id.seven);
        button_eight = findViewById(R.id.eight);
        button_nine = findViewById(R.id.nine);
        button_dot = findViewById(R.id.dot);
        button_add = findViewById(R.id.plus);
        button_sub = findViewById(R.id.minus);
        button_multiply = findViewById(R.id.multiply);
        button_divide = findViewById(R.id.divide);
        button_remainder = findViewById(R.id.remainder);
        button_equalTo = findViewById(R.id.equalto);
        button_clearText = findViewById(R.id.clear_text);
        button_back = findViewById(R.id.back);
        button_zero = findViewById(R.id.zero);
        button_plusminus = findViewById(R.id.plusminus);

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        button_plusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length() == 0) {
                    editText.setText(editText.getText() + "-");
                }
            }

        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    no1 = Float.parseFloat(editText.getText() + "");
                    add = true;
                    decimal = false;
                   editText.setText(null);   // by using this we can take another num for add
                }
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    no1 = Float.parseFloat(editText.getText() + "");
                    sub = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    no1 = Float.parseFloat(editText.getText() + "");
                    multiply = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    no1 = Float.parseFloat(editText.getText() + "");
                    divide = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });
        button_remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    no1 = Float.parseFloat(editText.getText() + "");
                    remainder = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });
        button_equalTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add || sub || multiply || divide || remainder) {

                    no2 = Float.parseFloat(editText.getText() + "");

                    if (add) {

                        editText.setText(no1 + no2 + "");
                        add = false;
                    }

                    if (sub) {
                        editText.setText(no1 - no2 + "");
                        sub = false;
                    }
                    if (multiply) {
                        editText.setText(no1 * no2 + "");
                        multiply = false;
                    }
                    if (divide) {
                        editText.setText(no1 / no2 + "");
                        divide = false;
                    }
                    if (remainder) {
                        editText.setText(no1 % no2 + "");
                        remainder = false;
                    }

                }
            }
        });
        button_clearText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                no1 = 0.0;
                no2 = 0.0;
            }
        });
        button_back.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               String s = editText.getText().toString();    //remove last digit in result
                                               if (s.length() != 0) {
                                                   s = s.substring(0, s.length() - 1);
                                                   editText.setText(s);
                                               }
                                           }
                                       }
        );
    }
}