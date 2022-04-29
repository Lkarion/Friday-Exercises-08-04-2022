package StringTransformerInterface;

import java.util.Locale;

public class ToLowerCaseTransform implements Transformable{

    @Override
    public boolean check(String str) {
        return str.length() == 2;
    }

    @Override
    public String transform(String str){
       return str.toLowerCase(Locale.ROOT);
    }
}
