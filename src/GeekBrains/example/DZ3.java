package GeekBrains.example;

import java.util.Random;
import java.util.Scanner;

public class DZ3 {

    public static void gamecifra() {
        int uans = 0;
        do {
            int i = 1;
            boolean pr = false;
            Random rnd = new Random();
            int randx = rnd.nextInt(9);
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Компьютер загадал число от 0 до 9. Сможете угадать c 3х попыток? Введите число: " + randx);
                int cifra = sc.nextInt();
                if (cifra == randx) {
                    System.out.println("Поздравляю! Вы угадали с " + i + " раза!");
                    pr = true;
                } else
                    System.out.println("Не верно! У вас осталось " + (3 - i) + " попытки!");
                i++;
            } while (i < 4 && !pr);
            do {
                System.out.println("Желаете сыграть еще раз? 1 - да, 0 - нет.");
                uans = sc.nextInt();
                if (uans != 1 && uans != 0)
                    System.out.println("Ваш выбор не ясен, повторите, пожалуйста!");
            }while(uans != 1 && uans != 0);
        }while(uans == 1);

    }

    public static void gameslovo(){
        Random rnd = new Random();
        boolean pr = false;
        int randx = rnd.nextInt(25);
        String tempstr = "";
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String ZagSl = words[randx];
        System.out.println(ZagSl);
        System.out.println("Компьютер загадал слово. Попробуете угадать? Играем до победы! Вводите слово!");
            do{
                tempstr = "";
                System.out.printf("\\>");
                String str = sc.nextLine();
                if (str.length() < ZagSl.length())
                    for(int i = 0; i < ZagSl.length(); i++)
                        str += " ";
                    if (str.equals(ZagSl))
                        pr = true;
                    else{
                        for(int i = 0;i < ZagSl.length();i++) {
                            if (ZagSl.charAt(i) == str.charAt(i)) {
                                tempstr += str.charAt(i);
                            } else
                                tempstr += "#";
                         }
                        for(int i = tempstr.length(); i < 15; i++) {
                            tempstr += "#";
                        }
                        System.out.println(tempstr);
                        System.out.println("Пытайтесь снова! Дорогу осилит идущий!");
                    }
            }while(!pr);
        System.out.println("Вы угадали слово! Якубович одобряет!");
    }

}
