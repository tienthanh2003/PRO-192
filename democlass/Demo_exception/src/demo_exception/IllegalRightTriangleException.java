/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_exception;

/**
 *
 * @author PC
 */
public class IllegalRightTriangleException extends Exception {
     public IllegalRightTriangleException(String message) {
        super(message);
    }
}
