public class Main {
    public static void main(String[] args) {
    task1() ;
    task2() ;
    task3() ;
    task4() ;
    task5() ;
    task6() ;
    task7() ;
    }
    public static void   task1 () {
        byte b = 67;
        System.out.println(b);
        short s = 569;
        System.out.println(s);
        short sh = -159;
        System.out.println(sh);
        int i = 27897;
        System.out.println(i);
        long l = 987678965549L;
        System.out.println(l);
        float f = 27.12F;
        System.out.println(f);
        double d = 2.786;
        System.out.println(d);
    }
    public static void   task2 () {
        byte lydmilaPavlovna = 23;
        byte annaSergrvna = 27;
        byte ekaterinaAndreevna = 30;
        short listy = 480;
        int a = listy / ( lydmilaPavlovna + annaSergrvna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитан " + a + " листов бумаги»");
    }

    public static void   task3() {
        byte a = 16;
        byte b = 2;
        int c = 20 / b * a;
        int d = c * 3 * 24;
        int r = d * 3;
        int t = r * 10;
        System.out.println("«За 20 минут машина произвела " + c + " штук бутылок»");
        System.out.println("«За сутки машина произвела " + d + " штук бутылок»");
        System.out.println("«За 3 дня машина произвела " + r + " штук бутылок»");
        System.out.println("«За месяц машина произвела " + t + " штук бутылок»");
    }
    public static void   task4() {
        byte a = 120;
        byte b = 2;
        byte c = 4;
        int q = a / (b + c);
        int e = q * b;
        int w = a - e;
        System.out.println("«В школе, где " + q + " классов, нужно" + e + "  банок белой краски и" + w + "  банок коричневой краски»");
    }

    public static void   task5() {
        byte q = 5;
        byte w = 80;
        byte e = 200 / 100;
        byte r = 105;
        byte t = 2;
        byte y = 100;
        byte u = 4;
        byte i = 70;
        int a = q * w + e * r + t * y + u * i;
        float s = a / 1000f;
        System.out.println(a);
        System.out.println(s);
    }
    public static void   task6() {
        short q = 7 * 1000;
        short w = 250;
        short e = 500;
        int r = q / w;
        int t = q / e;
        int y = (r + t) / 2;
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
    }
    public static void   task7() {
        int m = 67760;
        int d = 83690;
        int k = 76230;
        int ma = m / 100 * 110;
        int da = d / 100 * 110;
        int ka = k / 100 * 110;
        int ds = da - d;
        int ms = ma - m;
        int ks = ka - k;
        System.out.println("«Маша теперь получает  " + ma + "  рублей. Годовой доход вырос на    " + ms + "   рублей»");
        System.out.println("«Денис теперь получает  " + da + "  рублей. Годовой доход вырос на    " + ds + "   рублей»");
        System.out.println("«Кристина теперь получает  " + ka + "  рублей. Годовой доход вырос на    " + ks + "   рублей»");
    }













    }











