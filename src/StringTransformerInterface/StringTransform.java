package StringTransformerInterface;

public class StringTransform {
    public static void main(String[] args) {
        Transformable t = new ToLowerCaseTransform();
        Transformable t1 = new ToUpperCaseTransform();
        System.out.println(modifyString("aaa BB ccccc", t));
        System.out.println(modifyString("aaa BB ccccc", t1));
    }

    public static String modifyString(String s, Transformable t){
        if (s == null) return "";
        String[] strings = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String str : strings) {
            if (t.check(str))
                res.append(t.transform(str)).append(" ");
            else res.append(str).append(" ");
        }
        return res.toString().trim();
    }
}
