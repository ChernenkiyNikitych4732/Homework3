public class Main {
    public static void main(String[] args) {
        // 1 задача
        int i = 1;
        byte b = 2;
        short s = 3;
        long l = 4;
        float f = 0.1f;
        double d = 2.2;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        // 2 задача
        byte byte2 = 67;
        short short2 = -159;
        int int2 = 27897;
        long long2 = 987678965549L;
        float float2 = 27.12f;
        double double2 = 2.786;
        char char2 = 569;
        boolean boolean2 = false;

        // 3 задача
        int Ludmila_Pavlovna = 23;
        int Anna_Sergeevna = 27;
        int Ekaterina_Andreevna = 30;
        int totalPaper = 480;
        int paperEach = (totalPaper / (Ludmila_Pavlovna + Anna_Sergeevna + Ekaterina_Andreevna));
        System.out.println("На каждого ученика рассчитано " + paperEach + " листов бумаги");

        // 4 задача
        int min2 = 16;
        int min20 = min2 * 10;
        int h24 = min20 * 3 * 24;
        int days3 = h24 * 3;
        int month = h24 * 30;
        System.out.println("За 20 минут машина произвела бутылок - " + min20 + " штук ");
        System.out.println("За сутки машина произвела бутылок - " + h24 + " штук ");
        System.out.println("За 3 дня машина произвела бутылок - " + days3 + " штук ");
        System.out.println("За месяц машина произвела бутылок - " + month + " штук ");

        // 5 задача
        int white = 2;
        int brown = 4;
        int total = 120;
        int totalClasses = total / (white + brown);
        int totalWhite = white * totalClasses;
        int totalBrown = brown * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        // 6 задача
        int banana = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int gWeight = banana + milk + iceCream + eggs;
        double kgWeight = gWeight / 1000.0;
        System.out.println("Вес такого спорт-завтрака в кг - " + kgWeight);

        // 7 задача
        int targetKg = 7;
        int minGramPerDay = 250;
        int maxGramPerDay = 500;
        int targetGram = targetKg * 1000;
        int ifMin = targetGram / minGramPerDay;
        int ifMax = targetGram / maxGramPerDay;
        int daysAverage = (ifMin + ifMax) / 2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм - " + ifMin);
        System.out.println("если спортсмен будет терять каждый день по 500 грамм - " + ifMax);
        System.out.println("если в среднем - " + daysAverage);

        // 8 задача
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashaUp = Masha / 100 * 10;
        int DenisUp = Denis / 100 * 10;
        int KristinaUp = Kristina / 100 * 10;
        int MashaNew = Masha + MashaUp;
        int DenisNew = Denis + DenisUp;
        int KristinaNew = Kristina + KristinaUp;
        int MashaYearUp = MashaUp * 12;
        int DenisYearUp = DenisUp * 12;
        int KristinaYearUp = KristinaUp * 12;
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaYearUp + " рублей");
        System.out.println("Маша теперь получает " + DenisNew + " рублей. Годовой доход вырос на " + DenisYearUp + " рублей");
        System.out.println("Маша теперь получает " + KristinaNew + " рублей. Годовой доход вырос на " + KristinaYearUp + " рублей");
    }
}