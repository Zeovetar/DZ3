package GeekBrains.example;

public class DZ2 {


    public static int[] arrr() {
        int[] array = {1,1,0,1,1,0,1,1,0,1};
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1:
                    array[i] = 0;
                    break;
                case 0:
                    array[i] = 1;
                    break;
            }
        }
        return (array);
    }

    public static int[] ar8(){
        int[] array = new int[8];
        for(int i =0; i <= 6; i++){
            array[i+1] = 2*i+(3+i);
            }
        return(array);
    }

    public static int[] doublear(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i<array.length; i++){
            if (array[i] < 6){
                array[i] = array[i]*2;
            }
        }
        return(array);
    }



    public static int[][] diag(){
        int j = 0;
        int[][] array = new int[7][7];
        for(int i = 0; i < array.length; i++) {
            array[i][j] = array[6-i][j] = 1;
            j++;
        }
        return(array);
    }

    public static String minmax2(){
        int[] array = {-1,4,22,12,-5,3,9,2};
        int j = 0;
        String str = "";
        boolean pr = true;
        do {
            pr = false;
            for(int i = 0; i < array.length-1; i++){
                if (array[i] < array[i+1]) {
                    j = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = j;
                    pr = true;
                }
            }
        }while (pr);
        str = "Min= " + array[array.length-1] + ", " + "max= " + array[0];

    return(str);
    }

    public static boolean balanced(int [] arr){
        int sum = 0;
        boolean pr;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if (sum%2 == 0)
            pr = true;
        else
            pr = false;
        return(pr);
    }


    //{1,5,2,3,4,7,5,8,9}
    public static int[] ln13(int [] arr, int n){
        if (n%arr.length == 0){
            n = arr.length + n;
        }
        else
        {
            n = arr.length + n%arr.length;
        }
        int tempj = 0, tempk = 0, counter = 0;
        while (counter < n) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (i <= arr.length - 1) {
                    if (i == 0) {
                        tempj = arr[i + 1];
                        arr[i + 1] = arr[i];
                    } else if (i % 2 != 0) {
                        tempk = arr[i + 1];
                        arr[i + 1] = tempj;
                    } else {
                        tempj = arr[i + 1];
                        arr[i + 1] = tempk;
                    }
                    if (i%2 == 0)
                        arr[0] = tempj;
                    else
                        arr[0] = tempk;
                }
            }
            counter++;
        }
            return(arr);
    }
}