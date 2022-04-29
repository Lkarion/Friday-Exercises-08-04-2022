package StringDifLength;

import java.util.Locale;

public class ToUpperCaseTransform extends Transformation{

    @Override
    public String transform(String str){
        if (str.length() == 3) return str.toUpperCase(Locale.ROOT);
        return str;
    }
}
