package com.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    //create all the buttons of the calculator
    Button btnEqual,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinas,btnX,btnDivision,btn0,btnC;
    //create a text field to view the inputs and the output
    TextField txtResult ;
    //3 integers to carry both the numbers and the operation to be done
    Integer numstate, num1,num2=null;
    //indicates which number is being typed by the user now
    boolean isnum1=true;
    //Strings to carry the shown to the user
    String output,mark=" ";

    @Override
    public void start(Stage primaryStage){
        //initialize all the buttons and set the text shown in them
        btn1=new Button("1");
        btn2=new Button("2");
        btn3=new Button("3");
        btn4=new Button("4");
        btn5=new Button("5");
        btn6=new Button("6");
        btn7=new Button("7");
        btn8=new Button("8");
        btn9=new Button("9");
        btnC=new Button("C");
        btnDivision=new Button("/");
        btnEqual=new Button("=");
        btnMinas=new Button("-");
        btnPlus=new Button("+");
        btnX=new Button("*");
        btn0=new Button("0");
        //initialize the TextField
        txtResult=new TextField();
        // prevent the user from manually typing in the TextField
        txtResult.setEditable(false);
        //set the min sizes for all the components of the gui
        txtResult.setMinSize(100,20);
        btn1.setMinSize(70,25);
        btn2.setMinSize(70,25);
        btn3.setMinSize(70,25);
        btn4.setMinSize(70,25);
        btn5.setMinSize(70,25);
        btn6.setMinSize(70,25);
        btn7.setMinSize(70,25);
        btn8.setMinSize(70,25);
        btn9.setMinSize(70,25);
        btnPlus.setMinSize(70,25);
        btnMinas.setMinSize(70,25);
        btnX.setMinSize(70,25);
        btnDivision.setMinSize(70,25);
        btnC.setMinSize(70,25);
        btnEqual.setMinSize(70,25);
        btn0.setMinSize(70,25);
        //all btn7, btn8, btn9 and btnPlus to the same row
        HBox row1=new HBox(btn7,btn8,btn9,btnPlus);
        //set the spacing among the buttons in the row
        row1.setSpacing(5);
        //all btn4, btn5, btn6 and btnMinas to the same row
        HBox row2=new HBox(btn4,btn5,btn6,btnMinas);
        //set the spacing among the buttons in the row
        row2.setSpacing(5);
        //all btn1, btn2, btn3 and btnX to the same row
        HBox row3=new HBox(btn1,btn2,btn3,btnX);
        //set the spacing among the buttons in the row
        row3.setSpacing(5);
        //all btnC, btn0, btnEqual and btnDivision to the same row
        HBox row4=new HBox(btnC,btn0,btnEqual,btnDivision);
        //set the spacing among the buttons in the row
        row4.setSpacing(5);
        //add the textfield andd all the row to the application
        VBox root = new VBox(txtResult,row1,row2,row3,row4);
        //set the spacing among the rows in the application
        root.setSpacing(5);
        //set the padding around the vbox
        root.setPadding(new Insets(15));
        //set the title of the application
        primaryStage.setTitle("Calculator");
        //setup the Stage and set it's size then show it
        primaryStage.setScene(new Scene(root, 325, 225));
        primaryStage.show();
        //action listener for btn0 to handle it's click by the user
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(0);
            }
        });

        //action listener for btn1 to handle it's click by the user
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(1);
            }
        });

        //action listener for btn2 to handle it's click by the user
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(2);
            }
        });

        //action listener for btn3 to handle it's click by the user
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(3);
            }
        });

        //action listener for btn4 to handle it's click by the user
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(4);
            }
        });

        //action listener for btn5 to handle it's click by the user
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(5);
            }
        });

        //action listener for btn6 to handle it's click by the user
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(6);
            }
        });

        //action listener for btn7 to handle it's click by the user
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(7);
            }
        });

        //action listener for btn8 to handle it's click by the user
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(8);
            }
        });

        //action listener for btn9 to handle it's click by the user
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //call worker method and pass the value of the button the user entered
                worker(9);
            }
        });

        //action listener for btnDivision to handle it's click by the user
        btnDivision.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //check if the user already entered the first number
                if(num1!=null) {
                    //if the two numbers already entered do the calculation and use it for the next step
                    if (num2 != null)
                        calculate();
                    //tell the worker it's /
                    numstate = 10;
                    worker(numstate);
                }
            }
        });

        //action listener for btnX to handle it's click by the user
        btnX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //check if the user already entered the first number
                if(num1!=null) {
                    //if the two numbers already entered do the calculation and use it for the next step
                    if (num2 != null)
                        calculate();
                    //tell the worker it's *
                    numstate = 11;
                    worker(numstate);
                }
            }
        });

        //action listener for btnMinus to handle it's click by the user
        btnMinas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //check if the user already entered the first number
                if(num1!=null) {
                    //if the two numbers already entered do the calculation and use it for the next step
                    if (num2 != null)
                        calculate();
                    //tell the worker it's -
                    numstate = 12;
                    worker(numstate);
                }
            }
        });

        //action listener for btnPlus to handle it's click by the user
        btnPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //check if the user already entered the first number
                if(num1!=null) {
                    //if the two numbers already entered do the calculation and use it for the next step
                    if (num2 != null)
                        calculate();
                    //tell the worker it's +
                    numstate = 13;
                    worker(numstate);
                }
            }
        });

        //action listener for btnEqual to handle it's click by the user
        btnEqual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //calculate the operation required and show the result
                calculate();
            }
        });

        //action listener for btnC to handle it's click by the user
        btnC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //just reset everything
                num1=null;
                num2=null;
                mark=" ";
                isnum1=true;
                txtResult.setText("");
            }
        });
    }

    public void worker(int n){
        //if n >9 then the user pressed an operation button
        if(n>9){
            //10 means division
            if(n==10)
                mark="/ ";
            //11 means multiplication
            if(n==11)
                mark="* ";
            //12 means minus
            if(n==12)
                mark="- ";
            //13 means plus
            if(n==13)
                mark="+ ";
            //when user enters the sign then the first number is already entered
            isnum1=false;
            //construct what to be shown to the user
            output=num1.toString()+mark;
        }
        //if not >9 and is first number
        else if(isnum1){
            //if its the first digit of the first number then it is the first number
            if(num1==null)
                num1=n;
            else
                //else then it's the first digit to the right
                num1=num1*10+n;
            //construct what to be shown to the user
            output=num1.toString()+mark;
            //it it's not >9 and not first number then it's second number
        }else{
            //if its the first digit of the second number then it is the second number
            if(num2==null)
                num2=n;
            else
                //else then it's the first digit to the right
                num2=num2*10+n;
            //construct what to be shown to the user
            output=num1.toString()+mark+num2.toString();
        }
        //show the output to the user
        txtResult.setText(output);
    }

    public void calculate(){
        //check which sign is entered and do the right operation
        if(numstate==10)
            num1=num1/num2;
        if(numstate==11)
            num1=num1*num2;
        if(numstate==12)
            num1=num1-num2;
        if(numstate==13)
            num1=num1+num2;
        //show the result
        txtResult.setText(num1.toString());
        //remove the second number and sign
        num2=null;
        numstate=null;
        mark=" ";
        //set the marker to first number
        isnum1=true;
    }
    public static void main(String[] args) {
        launch(args);
    }

}
