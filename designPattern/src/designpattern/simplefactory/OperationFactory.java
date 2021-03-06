/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operationFactory
 * @Description：
 * @Author: ZZZ
 */

public class OperationFactory {
    public static Operation createOperate(char operate) {
        Operation operation = null;

        switch (operate) {
            case '+':
                operation=new OperationAdd();
                break ;
            case '-':
                operation=new OperationSub();
                break ;
            case '*':
                operation=new OperationMul();
                break ;
            case '/':
                operation=new OperationDiv();
                break ;
            default:
                System.out.println("default");
        }

        return operation;
    }
}
