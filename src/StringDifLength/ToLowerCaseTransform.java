package StringDifLength;

import java.util.Locale;

public class ToLowerCaseTransform extends Transformation{

    @Override
    public String transform(String str){
        if (str.length() == 4) return str.toLowerCase(Locale.ROOT);
        return str;
    }
}
