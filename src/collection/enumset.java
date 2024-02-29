package collection;

import java.util.EnumSet;

public class enumset {

    enum Lang{ JAVA, CSHARP, PYTHON}
    public static void main(String[] args) {
        EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
        System.out.println(langs);

    }
}
