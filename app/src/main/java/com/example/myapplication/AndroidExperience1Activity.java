package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class AndroidExperience1Activity extends AppCompatActivity implements View.OnClickListener{
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,
            btn_7,btn_8,btn_9,btn_clear,btn_percent,
            btn_del,btn_leftbra,btn_rightbra,btn_PandM,
            btn_squ2,btn_sin,btn_cos,btn_tan,btn_div,btn_mul,
            btn_sub,btn_add,btn_equ,btn_p;
    EditText text;

    static int sign = 100;//全局变量sign表示一些异常错误,如除数为0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experience1_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_percent.setOnClickListener(this);

        btn_del = (Button) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(this);

        btn_leftbra = (Button) findViewById(R.id.btn_leftbra);
        btn_leftbra.setOnClickListener(this);

        btn_rightbra = (Button) findViewById(R.id.btn_rightbra);
        btn_rightbra.setOnClickListener(this);

        btn_PandM = (Button) findViewById(R.id.btn_PandM);
        btn_PandM.setOnClickListener(this);

        btn_squ2 = (Button) findViewById(R.id.btn_squ2);
        btn_squ2.setOnClickListener(this);

        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener(this);

        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_cos.setOnClickListener(this);

        btn_tan = (Button) findViewById(R.id.btn_tan);
        btn_tan.setOnClickListener(this);

        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);

        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);

        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        btn_equ = (Button) findViewById(R.id.btn_equ);
        btn_equ.setOnClickListener(this);

        btn_p = (Button) findViewById(R.id.btn_p);
        btn_p.setOnClickListener(this);

        text=(EditText) findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        String str = text.getText().toString();
        switch(v.getId()){
            case R.id.btn_del:
                if(str.length()>1){
                    str=str.substring(0,str.length()-1);
                }
                else{
                    str="0";
                }
                text.setText(str);
                break;
            case R.id.btn_clear:
                str="0";
                text.setText(str);
                break;
            case R.id.btn_0:
                if (str.equals("0")){
                    str="0";
                }
                else{
                    str+="0";
                }
                text.setText(str);
                break;
            case R.id.btn_1:
                if (str.equals("0")){
                    str="1";
                }
                else{
                    str+="1";
                }
                text.setText(str);
                break;
            case R.id.btn_2:
                if (str.equals("0")){
                    str="2";
                }
                else{
                    str+="2";
                }
                text.setText(str);
                break;
            case R.id.btn_3:
                if (str.equals("0")){
                    str="3";
                }
                else{
                str+="3";
            }
                text.setText(str);
                break;
            case R.id.btn_4:
                if (str.equals("0")){
                    str="4";
                }
                else{
                    str+="4";
                }
                text.setText(str);
                break;
            case R.id.btn_5:
                if (str.equals("0")){
                    str="5";
                }
                else{
                    str+="5";
                }
                text.setText(str);
                break;
            case R.id.btn_6:
                if (str.equals("0")){
                    str="6";
                }
                else{
                    str+="6";
                }
                text.setText(str);
                break;
            case R.id.btn_7:
                if (str.equals("0")){
                    str="7";
                }
                else{
                    str+="7";
                }
                text.setText(str);
                break;
            case R.id.btn_8:
                if (str.equals("0")){
                    str="8";
                }
                else{
                    str+="8";
                }
                text.setText(str);
                break;
            case R.id.btn_9:
                if (str.equals("0")){
                    str="9";
                }
                else{
                    str+="9";
                }
                text.setText(str);
                break;
            case R.id.btn_p:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(AndroidExperience1Activity.this,"输入错误!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+=".";
                    text.setText(str);
                }
                break;
            case R.id.btn_add:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(AndroidExperience1Activity.this,"输入错误!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="+";
                    text.setText(str);
                }
                break;
            case R.id.btn_sub:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(AndroidExperience1Activity.this,"输入错误!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "-";
                    text.setText(str);
                }
                break;
            case R.id.btn_mul:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(AndroidExperience1Activity.this,"输入错误!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "×";
                    text.setText(str);
                }
                break;
            case R.id.btn_div:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(AndroidExperience1Activity.this,"输入错误!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "÷";
                    text.setText(str);
                }
                break;
            case R.id.btn_leftbra:
                if (str.length()==1){
                    str="(";
                }
                else if(!str.contains("+")&&!str.contains("-")&&!str.contains("×")&&!str.contains("÷")){
                    str="("+str;
                }
                else {
                    str += "(";
                }
                text.setText(str);
                break;
            case R.id.btn_rightbra:
                if (str.length()==1){
                    str="0";
                }
                else {
                    str += ")";
                }
                text.setText(str);
                break;
            case R.id.btn_equ:

                char[] chars = str.toCharArray();
                List<String> suffixList = nifToSuf(chars);
                // 计算后缀表达式
                BigDecimal res = calcSuffixExpression(suffixList);
                if(sign == 0) {
                    Toast.makeText(AndroidExperience1Activity.this,"0不能做除数!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                    sign = 100;
                }
                else if(sign == 1) {
                    Toast.makeText(AndroidExperience1Activity.this,"没有操作数!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                    sign = 100;
                }
                else{
                    text.setText(res.toString());
                }
                break;
            case R.id.btn_squ2:
                if(str.charAt(0)=='-'){
                    Toast.makeText(AndroidExperience1Activity.this,"负数不可以开根号!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else if(str.contains("+")||str.contains("-")||str.contains("×")||str.contains("÷")){
                    Toast.makeText(AndroidExperience1Activity.this,"Symbols cannot be squared!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else{
                    double x=Double.parseDouble(str);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
            case R.id.btn_percent:
                double per=Double.parseDouble(str);
                per=per/100;
                String per1=""+per;
                per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(per1);
                break;
            case R.id.btn_sin:
                double sinn=Double.parseDouble(str);
                sinn=Math.toRadians(sinn);
                sinn=Math.sin(sinn);
                String sinn1=String.format("%.9f",sinn);//规避极小误差
                sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(sinn1);
                break;
            case R.id.btn_cos:
                double coss=Double.parseDouble(str);
                coss=Math.toRadians(coss);
                coss=Math.cos(coss);
                String coss1=String.format("%.9f",coss);//规避极小误差
                coss1 = coss1.replaceAll("0+?$", "");//去掉多余的0
                coss1 = coss1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(coss1);
                break;
            case R.id.btn_tan:
                double tann=Double.parseDouble(str);
                tann=Math.toRadians(tann);
                tann=Math.tan(tann);
                String tann1=String.format("%.9f",tann);//规避极小误差
                tann1 = tann1.replaceAll("0+?$", "");//去掉多余的0
                tann1 = tann1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(tann1);
                break;
            case R.id.btn_PandM:
                if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                    if(str.equals("0")){
                        text.setText("0");
                    }
                    else{
                        text.setText("-"+str);
                    }
                }
                else if(str.charAt(0)=='-')
                    text.setText(str.substring(1,str.length()));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }

    /**
     * 中缀表达式转化为后缀表达式
     * @param chars 中缀表达式
     * @return 返回后缀表达式
     */
    public static List<String> nifToSuf(char[] chars) {
        List<String> exp = new ArrayList<>();
        Stack<Character> op = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {

            // 如果是数字
            if ((i == 0 && chars[i] != '(') || (i != 0 && isDigit(chars[i], chars[i - 1]))) {
                sb.append(chars[i]);
                // 如果是最后一位 或者下一位是字符，数字添加到exp队列,sb清空
                if (i == chars.length - 1 || (i + 1 < chars.length && isSymbol(chars[i + 1]))) {
                    exp.add(sb.toString());
                    sb = new StringBuilder("");
                }
                // 如果是括号
            } else if (isBracket(chars[i])) {
                // 如果是左括号 直接入op栈
                if (chars[i] == '(') {
                    op.push(chars[i]);
                } else {
                    // 右括号
                    // 将op栈出栈 添加到exp直到遇到'(',将这一对 '(' ')' 舍去
                    char temp;
                    while ((temp = op.pop()) != '(') {
                        exp.add(temp + "");
                    }
                }
                // 如果是操作符
            } else if (isOperation(chars[i])) {
                while (true) {
                    // 空的栈直接入栈
                    if (op.isEmpty()) {
                        op.push(chars[i]);
                        break;
                        // 如果栈顶的符号优先级小于 扫描到的符号 入栈
                    } else if (getPriority(op.peek()) < getPriority(chars[i])) {
                        op.push(chars[i]);
                        break;
                        // 栈顶的符号优先级大于等于 扫描到的符号 出栈给exp,并继续扫描栈顶下一个符号
                    } else {
                        exp.add(op.pop() + "");
                    }
                }
            }
        }
        // 将剩余的符号全部入exp
        while (!op.isEmpty()) {
            exp.add(op.pop() + "");
        }
        return exp;
    }

     /**
     * 计算后缀表达式
     * @param suffixExp 输入后缀表达式
     * @return @code{BigDecimal}
     */
    public static BigDecimal calcSuffixExpression(List<String> suffixExp) {
        Stack<BigDecimal> numStack = new Stack<>();
        for (String str : suffixExp) {
            // 如果是操作符
            if (str.length() == 1 && isOperation(str.charAt(0))) {
                BigDecimal num2 = numStack.pop();
                BigDecimal num1 = numStack.pop();
                numStack.push(calcValueOfTwoNum(num1, num2, str));

            } else {
                numStack.push(new BigDecimal(str));
            }
        }
        return numStack.peek();
    }

    public static BigDecimal calcValueOfTwoNum(BigDecimal num1, BigDecimal num2, String op) {
        switch (op) {
            case "+":
                return num1.add(num2);
            case "-":
                return num1.subtract(num2);
            case "×":
                return num1.multiply(num2);
            case "÷":
                if (num2.signum() == 0) {
                    sign = 0;//
                    return new BigDecimal(0);
                }
                // 除法保留2位小数，四舍五入
                else return num1.divide(num2, 2, RoundingMode.HALF_UP);
            default:
                sign = 1;
                return new BigDecimal(0);
        }
    }

    // 获取优先级
    public static int getPriority(char ch) {
        switch (ch) {
            case '(':
                return 0;
            case '+':
            case '-':
                return 1;
            case '×':
            case '÷':
                return 2;
        }
        throw new RuntimeException("不是加减乘除或者(");
    }

    public static boolean isSymbol(char ch) {
        return isOperation(ch) || isBracket(ch);
    }

    public static boolean isOperation(char ch) {
        return ch == '+' || ch == '-' || ch == '×' || ch == '÷';
    }

    public static boolean isBracket(char ch) {
        return ch == '(' || ch == ')';
    }

    public static boolean isDigit(char ch, char leftBracket) {
        // 如果前一个是左括号 右边的数字可能带有正负号
        if (leftBracket == '(') {
            return ch == '-' || ch == '+' || (ch >= 48 && ch <= 57);
        }
        // 前一个符号不是左括号只能是数字或小数点
        return (ch >= 48 && ch <= 57) || ch == '.';

    }
}

