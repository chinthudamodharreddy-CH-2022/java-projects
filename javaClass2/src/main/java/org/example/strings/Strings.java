package org.example.strings;

public class Strings {
    public static void main(String[] args) {
        String str = "hello";
        //new string object is created but there is no ref, hence if you print str you will see hello
        str.concat("there");
        //here the new string is given ref str, now str will point to the new string. hence the old string is immutable.
        //str = str.concat("there");
        System.out.println(str);

        //scp memory dont allow duplicates, both str3 & str4 is same, string directly assigned will literal will be created in scp
        String str3 = "namasthe";
        String str4 = "namasthe";
        System.out.println(str3 == str4);

        //heap memory allow duplicates, Strings created with new keyword will be created in heap memory
        String str5 = new String("hola");
        str5.concat("people");
        //System.out.println(str5);
        String str6 = new String("hola");
        System.out.println(str5 == str6);
        //System.out.println(str5.equals(str6));

    }
}
