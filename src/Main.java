public class Main {
    //1 Задача
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.785;
    }
    //2 Задача
    public static int Callories(int time, int intensity)
    {
        return time * intensity;
    }
    //3 Задача
    public static int products(int box, int bag, int barrel)
    {
        return box*20 + bag*50 + barrel*100;
    }
    //4 Задача дорешать
    public static String triangle(int x,int y, int z)
    {
        if (x+y<z || x+z<y || y+z<x) {
            return "Не является треугольником";
        }
        else if (x == y && y == z) {
            return "Равносторонний треугольник";
        } else if (x == y || y == z || x == z) {
            return "Равнобедренный треугольник";
        } else if (x + y > z && y + z > x && x + z > y) {
            return "Разносторонний треугольник";
        } else {
            return "Треугольник не существует";
        }

    }
    //5 Задача
    public static int ternaryEvaluation(int a, int b)
    {
        return a>b ? a:b;
    }
    //6 Задача

    public static int Beds(double TextilleLength, double DetailWidth, double DetailHeight) {
        return (int)(TextilleLength/(2*DetailWidth*DetailHeight));
    }


    // 7 Задача
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    // 8 задача
    public static int gcd(int a, int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // 9 задача
    public static int Tickets(int a, int b){
        return (int)(a * b * 0.72);
    }
    //10 задача
    public static int Students(int a, int b){
        int i = (a-(b*2));
        if (i<=0){
            return 0;
        }
        else {
            return i;
        }
    }

    public static void main(String[] args) {
        double gallons1 = 5;
        double gallons2 = 3;
        double gallons3 = 8;
        System.out.println(gallons1);
        System.out.println(gallons2);
        System.out.println(gallons3);
        System.out.println();
        // Задача 2
        int time_1 = 15;
        int time_2 = 24;
        int time_3 = 41;
        int intensity_1 = 1;
        int intensity_2 = 2;
        int intensity_3 = 3;
        System.out.println(Callories(time_1, intensity_1));
        System.out.println(Callories(time_2, intensity_2));
        System.out.println(Callories(time_3, intensity_3));
        System.out.println();
        // 3 задача
        System.out.println(products(3, 4, 2));
        System.out.println(products(5, 0, 2));
        System.out.println(products(4, 1, 4));
        System.out.println();
        // 4 задача
        System.out.println(triangle(5, 5, 5));
        System.out.println(triangle(9, 4, 6));
        System.out.println(triangle(15, 15, 17));
        System.out.println(triangle(5, 5, 1));
        System.out.println();
        // 5 задача
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.out.println();
        // 6 задача
        // пропустили
        System.out.println(Beds(22,1.4,2));
        System.out.println(Beds(45,1.8,1.9));
        System.out.println(Beds(100,2,2));
        System.out.println();
        // 7 задача
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println();
        // 8 задача
        System.out.println(gcd(48,18));
        System.out.println(gcd(52,8));
        System.out.println(gcd(259,29));
        System.out.println();
        // 9 задача
        System.out.println(Tickets(70,1500));
        System.out.println(Tickets(24,950));
        System.out.println(Tickets(53,1250));
        System.out.println();
        //10 задача
        System.out.println(Students(5, 2));
        System.out.println(Students(31, 20));
        System.out.println(Students(123, 58));
    }
}
