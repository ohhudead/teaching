package org.example.dto.rules;

import org.example.dto.InputIntegerRules;

public class MoreThanZeroRule implements InputIntegerRules {

    @Override
    public void checkAndThrow(int integer) {
        int ZERO = 0;
        if(integer < ZERO){
            throwException();
        }
    }
}
