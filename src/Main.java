import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. Если 5 в 15 степени больше миллиарда, вывести - «Степень это мощь. Power is a power.»
        double result = Math.pow(5, 15);
        double billion = 1_000_000_000.0;
        if (result > billion) {
            System.out.println("Степень это мощь. Power is a power.");
        }

        //2. Задайте переменную. Если она больше 0, вывести «позитив», если меньше 0, вывести «отрицательно»
        int x1 = 10;
        if (x1 > 0) {
            System.out.println("позитив");
        } else if (x1 < 0) {
            System.out.println("отрицательно");
        }

        //3. Если квадратный корень из 15 миллионов меньше 5 тысяч, вывести - «два измерения лучше, чем одно»
        double result2 = Math.sqrt(15000000);
        if (result2 < 5000) {
            System.out.println("два измерения лучше, чем одно");
        }

        //4. Если 2 в 10 степени меньше 512 вывести - «Pentium 2», иначе вывести - «ARM»
        double result3 = Math.pow(2, 10);
        if (result3 < 512) {
            System.out.println("Pentium 2");
        } else {
            System.out.println("ARM");
        }

        //5. Задать две дробных переменных. Вывести наибольшую из них.
        double x2 = 2.6;
        double x3 = 1.2;
        if (x2 > x3) {
            System.out.println(x2);
        } else {
            System.out.println(x3);
        }

        //6. Задать две переменных - first и second. Вывести first в степени second, second в степени first.
        double first = 8;
        double second = 2;
        double res1 = Math.pow(first, second);
        double res2 = Math.pow(second, first);

        System.out.println(res1);
        System.out.println(res2);

        //7. Задать две переменных - икс и игрек. Вывести, что больше - икс в степени игрек, или наоборот.
        double x = 12;
        double y = 4;
        double res3 = Math.pow(x, y);
        double res4 = Math.pow(y, x);

        if (res3 > res4) {
            System.out.println(res3);
        } else {
            System.out.println(res4);
        }

        //8. Вывести числа от 1 до 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //9. Вывести числа от 50 до 100
        for (int i = 50; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //10. Вывести числа от 100 до 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //11. Вывести числа от 0 до -100
        for (int i = 0; i >= -100; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //12. Задать строковую переменную. Заменить в ней все буквы о на «обро»
        String str1 = "Это оригинальная строка с буквами о.";
        String str2 = str1.replace("о", "обро");

        System.out.println(str2);

        //13. Задать строковую переменную. Вывести ее в верхнем регистре.
        String str3 = "миша сказал мяу";
        String str4 = str3.toUpperCase();
        System.out.println(str4);

        //14. Задать строковую переменную. Заменить в ней буквы а на @, а буквы о на 0.
        String str5 = "Это оригинальная строка с буквами о.";
        String str6 = str5.replace("а", "@");
        str6 = str6.replace("о", "0");

        System.out.println(str6);

        //15. Задать две строковых переменных. Найти, какая из них длиннее. (Используйте .length() )
        String str7 = "Иваны сидели с 2000 года дома";
        String str8 = "Миша не был дома";

        int length1 = str7.length();
        int length2 = str8.length();

        if (length1 > length2) {
            System.out.println("Первая строка длиннее второй");
        } else if (length1 < length2) {
            System.out.println("Вторая строка длиннее первой");
        } else {
            System.out.println("Обе строки имеют одинаковую длину");
        }

        //16. Задать три переменных, найти наибольшую из них
        String str9 = "Коротенькая строка";
        String str10 = "Чуть длиннее строка";
        String str11 = "Слишком длинная строка";
        String max = "";

        if (str9.length() >= str10.length() && str9.length() >= str11.length()){
            max = str9;
            System.out.println("Первая строка длиннее");
        } else if (str10.length() >= str9.length() && str10.length() >= str11.length()) {
            max = str10;
            System.out.println("Вторая строка длиннее");
        } else {
            max = str11;
            System.out.println("Третья строка длиннее");
        }

        //17. Напишите программу, сохраняющую в файл статью из википедии «Проблема 2000 года». Прочитайте её.
        String url1 = "https://ru.wikipedia.org/wiki/Проблема_2000_года";
        String text_page = downloadWebPage(url1);
        saveFile(text_page, "page_17.html");

        //18. Напишите программу, сохраняющую в файл статью из википедии «Дональд Кнут». Перед сохранением в файл замените все слова Кнут на Пряник
        String url2 = "https://ru.wikipedia.org/wiki/Кнут,_Дональд_Эрвин";
        text_page = downloadWebPage(url2);
        text_page = text_page.replace("Кнут", "Пряник");
        saveFile(text_page, "page_18.html");

        //19
        String url3 = "https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";
        text_page = downloadWebPage(url3);
        saveFile(text_page, "page_19.html");


        //20
        for (int i = 1; i <= 50; i++) {
            url3 = "https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";
            text_page = downloadWebPage(url3);
            saveFile(text_page, "pages_" + i + ".html");
        }


    }

    private static void saveFile(String content, String fileName) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
            System.out.println("Строка успешно сохранена в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;

        URLConnection urlConnection = new URL(url).openConnection();

        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        }

        return result.toString();

    }
}