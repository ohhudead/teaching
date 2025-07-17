package org.example.dto.rules;

import org.example.dto.InputIntegerRules;

public class MaximumValueRule implements InputIntegerRules {

    @Override
    public void checkAndThrow(int integer) {
        int MAXIMUM_VALUE = 100;
        if (integer > MAXIMUM_VALUE) {
            throwException();
        }
    }
}
