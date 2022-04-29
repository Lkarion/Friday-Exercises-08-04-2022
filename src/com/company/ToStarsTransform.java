package com.company;

public class ToStarsTransform extends Transformation{

    @Override
    public String transform(String str){
        if (str.length() == 5) return "*****";
        return str;
    }
}
