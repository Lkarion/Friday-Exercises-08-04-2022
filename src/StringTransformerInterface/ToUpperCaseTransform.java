package StringTransformerInterface;

import java.util.Locale;

public class ToUpperCaseTransform implements Transformable{


    @Override
    public boolean check(String str) {
        return str.length() == 3;
    }

    @Override
    public String transform(String str){
        return str.toUpperCase(Locale.ROOT);
    }
}
