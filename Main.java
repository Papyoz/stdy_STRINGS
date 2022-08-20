package com.company;

import java.awt.desktop.SystemEventListener;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        System.out.printf("Chumba \nHEHE\n");

        String str1 = "Ku! ";
        String str2 = "chikibambony ";
        String str = str1 + str2;
        System.out.print(str+"\n\n");

        String strnew = String.join("  ",str1,str1,str2);//Раставляет элементы на определенном расстоянии.
        System.out.print(strnew + "\n\n\n");

        char c = str1.charAt(2);//Вытаскивает нужный символ Char
        String str3 = str2.toUpperCase();//Переводит все символы в строке в Caps
        String str4 = str2.concat(str1);//Соединяет символы
        System.out.printf("%s\n%s\n%s",c,str3,str4);//То же самое что в С и С++

        String whitespace = "       Oy...   shitttt!!!";
        String str5 = whitespace.strip();//Удаляет пробелы до первыого символа
        String str6 = whitespace.stripIndent();//Удаляет пробелы до первого символа
        String str7 = whitespace.stripLeading();//Удаляет пробелы до первого символа
        String str8 = whitespace.stripTrailing();//Похоже бесполезная херня

        System.out.printf("\n\n%s\n\n%s\n%s\n%s\n%s\n",whitespace,str5,str6,str7,str8);

        String str9 = str2.repeat(3);
        String str10 = str2.replace("iki","upu");
        System.out.printf("\n\n%s\n%s\n",str9,str10);

        Stream<String> STR= whitespace.lines();//Вытаскивает строки
        System.out.print(STR);
    }
}
