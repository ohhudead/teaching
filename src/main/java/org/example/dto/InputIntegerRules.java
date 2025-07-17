package org.example.dto;

public interface InputIntegerRules {

    void checkAndThrow(int integer);

    default void throwException(){
        throw new WrongInputException();
    }
}
