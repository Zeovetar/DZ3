

public class Main {


    byte bt = 25;
    short shrt = 32000;
    int nt = 214000000;
    long lng = 90000000000000L;
    float flt = 100.2F;
    double dbl = 3.1415;
    boolean trig = true;
    char chr = 'a';
    int a,b,c,d = 0;
    int sum1;
    int sum2;

    /* int a = 2;
    int b = 2;
    int c = 10;
    int d = 2; */

    public static void main(String[] args) {
        System.out.println("результат выражения=" + virajenie(4,2,10,2));
        System.out.println("Сумма лежит в диапазоне 10<=x<=20? " + check(10,7));
        negpos(29);
        System.out.println("Вернули: " + negpos2(-1));
        privet("Костя");
        years(2004);
    }



        public static int virajenie (int a, int b, int c, int d) {
            return (a*(b+(c/d)));
        }

        public static boolean check (int sum1, int sum2) {
            int summtwin = sum1+sum2;
            if (summtwin >=10 && summtwin <=20){
                return(true);
            }
            return(false);
        }

        public static void negpos(int vhod){
            //сделать проверку приведение к int
            if (vhod < 0){System.out.println("Число отрицательное!");}
            else {System.out.println("Число положительное!");}
        }

    public static boolean negpos2(int vhod){
        //сделать проверку приведение к int
        if (vhod < 0){return(true);}
    return(false);
    }

    public static void privet(String name){

        System.out.println("Привет, " + name + "!");
    }

    public static void years(int yearnum){
        String str = "zero";
        boolean flg = false;
        if (yearnum%100 == 0 && yearnum%400 !=0){
            flg = false;
        }
        else if (yearnum%400 == 0 || yearnum%4 == 0) {
            flg = true;
        }
        else flg = false;

        if (flg) {
            str = "високосный";
        } else{
            str="не високосный";
        }
        System.out.println("Год " + str);
    }
    }