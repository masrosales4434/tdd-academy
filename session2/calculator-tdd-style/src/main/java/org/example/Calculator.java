package org.example;

public class Calculator {
    public boolean status = false;

    public boolean isOn(){
        return status;
    }

    public void turnOn(){
        status = true;
    }

    public void turnOff(){
        status = false;

    }

    public boolean isOff(){
        return !status;
    }

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public float add(float num1, float num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public float subtract(float num1, float num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }


}
