package nemo1.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView res, whatHappened;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,divBtn,mulBtn,subBtn,addBtn,equalBtn;
    Button clearBtn,memoClearBtn,memoRecallBtn,saveToMemoBtn,backBtn,negBtn;
    Integer operand1,operand2;
    String operation;
    String inMemory;
    boolean setOperationOn, equalOn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res =(TextView) findViewById(R.id.scrnTxtView);
        whatHappened = (TextView) findViewById(R.id.whatHappendtxtView);
        btn0 = (Button) findViewById(R.id.zeroBtn);
        btn1 = (Button) findViewById(R.id.oneBtn);
        btn2 = (Button) findViewById(R.id.twoBtn);
        btn3 = (Button) findViewById(R.id.threeBtn);
        btn4 = (Button) findViewById(R.id.foreBtn);
        btn5 = (Button) findViewById(R.id.fiveBtn);
        btn6 = (Button) findViewById(R.id.sixBtn);
        btn7 = (Button) findViewById(R.id.sevenBtn);
        btn8 = (Button) findViewById(R.id.eightBtn);
        btn9 = (Button) findViewById(R.id.nineBtn);
        divBtn = (Button) findViewById(R.id.divBtn);
        mulBtn = (Button) findViewById(R.id.mulBtn);
        subBtn = (Button) findViewById(R.id.subBtn);
        addBtn = (Button) findViewById(R.id.addBtn);
        equalBtn = (Button) findViewById(R.id.equalBtn);
        clearBtn = (Button) findViewById(R.id.clearBtn);
        memoClearBtn = (Button) findViewById(R.id.memoClearBtn);
        memoRecallBtn = (Button) findViewById(R.id.memoRecallBtn);
        saveToMemoBtn = (Button) findViewById(R.id.saveToMemoBtn);
        backBtn = (Button) findViewById(R.id.backBtn);
        negBtn = (Button) findViewById(R.id.negativeBtn);
        operand1=operand2=0;
        operation=null;
        inMemory=null;
        setOperationOn = equalOn =false;
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!res.getText().equals(0 + "")){
                    res.append("0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0 + ""))
                    res.setText(1+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(1+"");
                }
                else{
                    res.append(1+"");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0 + ""))
                    res.setText(2+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(2+"");
                }
                else {
                    res.append(2+"");
                    }
                }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0 + ""))
                    res.setText(3+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(3+"");
                }
                else{
                    res.append(3+"");

                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0 + ""))
                    res.setText(4+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(4+"");
                }
                else {
                    res.append(4+"");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0+""))
                    res.setText(5+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(5+"");
                }
                else {
                    res.append(5+"");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0+""))
                    res.setText(6+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(6+"");
                }
                else {
                    res.append(6+"");
                    }
                }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0+""))
                    res.setText(7+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(7+"");
                }
                else {
                    res.append(7+"");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0+""))
                    res.setText(8+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(8+"");
                }
                else {
                    res.append(8+"");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().equals(0+""))
                    res.setText(9+"");
                else if(equalOn) {
                    equalOn = false;
                    res.setText(9+"");
                }
                else{
                    res.append(9+"");
                }
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!res.getText().equals("0")) {
                    if (!setOperationOn) {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "/";
                        setOperationOn = true;
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    } else {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "/";
                        calculate(v);
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    }
                }
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!res.getText().equals("0")) {
                    if (!setOperationOn) {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "*";
                        setOperationOn = true;
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    } else {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "*";
                        calculate(v);
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    }
                }
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!res.getText().equals("0")) {
                    if (!setOperationOn) {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "-";
                        setOperationOn = true;
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    } else {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "-";
                        calculate(v);
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    }
                }
            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!res.getText().equals("0")) {
                    if (!setOperationOn) {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "+";
                        setOperationOn = true;
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    } else {
                        operand1 = Integer.parseInt(res.getText() + "");
                        operation = "+";
                        calculate(v);
                        whatHappened.setText(operand1 + operation + "");
                        res.setText("");
                    }
                }
            }
        });
        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalOn = true;
                operand2 = Integer.parseInt(res.getText() + "");
                whatHappened.setText(operand1 + operation + operand2);
                try{
                    switch (operation){
                        case "+":
                            operand1 = operand1 + operand2;
                            res.setText(operand1 + "");
                            break;
                        case "-":
                            operand1 = operand1 - operand2;
                            res.setText(operand1 + "");
                            break;
                        case "*":
                            operand1 = operand1 * operand2;
                            res.setText(operand1 + "");
                            break;
                        case "/":
                            operand1 = operand1 / operand2;
                            res.setText(operand1 + "");
                            break;
                    }
                }catch (NumberFormatException nfe){
                    System.out.println("Cannot parse " + nfe);
                }
                setOperationOn = false;
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(String.valueOf(0));
                whatHappened.setText("");
                operand1=operand2 = 0;
                operation=null;
                setOperationOn=false;
            }
        });
        memoClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inMemory = null;
            }
        });
        memoRecallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!inMemory.equals("")) {
                    res.setText(inMemory);
                }
            }
        });
        saveToMemoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inMemory = res.getText()+"";
                res.setText("0");
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().length()==1)
                    res.setText(0+"");
                else
                    res.setText(res.getText().subSequence(0, res.getText().length()-1));
            }
        });
        negBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText().toString().startsWith("-")){
                    res.setText(res.getText().subSequence(1,res.getText().length()));
                }else{
                    res.setText("-" + res.getText());
                }
            }
        });
    }
    private void calculate(View v){
        operand2 = Integer.parseInt(res.getText() + "");
        whatHappened.setText(operand1 + operation + operand2);
        try{
        switch (operation){
            case "+":
                operand1 = operand1 + operand2;
                res.setText(operand1 + "");
                break;
            case "-":
                operand1 = operand1 - operand2;
                res.setText(operand1 + "");
                break;
            case "*":
                operand1 = operand1 * operand2;
                res.setText(operand1 + "");
                break;
            case "/":
                operand1 = operand1 / operand2;
                res.setText(operand1 + "");
                break;
        }}catch (NumberFormatException nfe){
            System.out.println("Cannot parse " + nfe);
        }
    }
}
