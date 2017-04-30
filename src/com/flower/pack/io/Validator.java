package com.flower.pack.io;

import com.flower.pack.excptions.CodeException;
import com.flower.pack.model.Store;

/**
 * TODO: tatianaermolaeva, добавь описание класса
 */
public class Validator {
    public static void validateCode(String code) throws CodeException {
       if(!Store.flowers.containsKey(code)) {
           throw new CodeException(code);
       }
    }
}
