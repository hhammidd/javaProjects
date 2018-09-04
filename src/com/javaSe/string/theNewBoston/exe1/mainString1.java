package com.javaSe.string.theNewBoston.exe1;

public class mainString1 {
    public static void main(String[] args) {
        String[] words = {"hamid","giac","roberto","francesco"};

        //startWith
        for (String w : words){
            if (w.startsWith("ha"))
                System.out.println(w + " starts with ha");
        }

        // endsWith
        for (String w : words){
            if (w.endsWith("to")){
                System.out.println(w + " ends with to");
            }
        }

        //indexOf
        System.out.println("=======indexOf=====");
        String s = "duckprogramming";
        System.out.println("First k: " + s.indexOf('k'));
        System.out.println("======indexOf not exist return -1");
        System.out.println("indexOf pro: " + s.indexOf("pro"));

        //Concatination
        System.out.println("========concatination Bacon + Monster=========");
        String a = "Bacon ";
        String b = "monster";
        System.out.println(a.concat(b));

        //Replace
        System.out.println("==========Replace ======");
        System.out.println(a.replace('B','F'));

        //To upper case
        System.out.println("====ToUpperCase=======");
        System.out.println(b.toUpperCase());

        //delete space
        System.out.println("======trim=======");
        String c = "             moni ";
        System.out.println(c.trim());

    }
}
