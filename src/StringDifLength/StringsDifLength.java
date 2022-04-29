package StringDifLength;

public class StringsDifLength {
    public static void main(String[] args) {
        Transformation t = new ToLowerCaseTransform();
        Transformation t1 = new ToUpperCaseTransform();
        Transformation t2 = new ToStarsTransform();
        System.out.println(modifyString("aaa BBBB ccccc", t));
        System.out.println(modifyString("aaa BBBB ccccc", t1));
        System.out.println(modifyString("aaa BBBB ccccc", t2));
    }

    public static String modifyString(String s, Transformation t){
        if (s == null) return "";
        String[] strings = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String str : strings) {
            res.append(t.transform(str)).append(" ");
           // str = t.transform(str);
        }
        return res.toString().trim();
       // return String.join(" ", strings);
    }
}
