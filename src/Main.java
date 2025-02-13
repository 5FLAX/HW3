public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int a = -342342;
        System.out.println("Значение переменной a = " + a);
        byte b = 124;
        System.out.println("Значение переменной b = " + b);
        short c = 32123;
        System.out.println("Значение переменной c = " + c);
        long d = 929596955;
        System.out.println("Значение переменной d = " + d);
        float e = -3.3f;
        System.out.println("Значение переменной e = " + e);
        double f = -1.1;
        System.out.println("Значение переменной f = " + f);

        System.out.println("Задание 2");
        float eas = 27.12F;
        System.out.println("Значение переменной ea = " + eas);
        long da = 987678965549L;
        System.out.println("Значение переменной da = " + da);
        double fa = 2.786;
        System.out.println("Значение переменной fa = " + fa);
        short ca = 569;
        System.out.println("Значение переменной ca = " + ca);
        int aa = -159;
        System.out.println("Значение переменной aa = " + aa);
        short ga = 27897;
        System.out.println("Значение переменной ga = " + ga);
        byte eac = 67;
        System.out.println("Значение переменной eac = " + eac);

        System.out.println("Задание 3");
        byte lp = 23;
        System.out.println("Людмила Павловна - " + lp + " ученика");
        byte as = 27;
        System.out.println("Анна Сергеевна - " + as + " ученика");
        byte ea = 30;
        System.out.println("Екатерина Андреевна - " + ea + " ученика");
        int allS = lp + as + ea;
        System.out.println("Общее колл-во студентов = " + allS);
        short paper = 480;
        System.out.println("Бумага на всех учеников = " + paper + " листов");
        int onePaper = paper / allS;
        System.out.println("На кадого учника расчитанно " + onePaper + " листов бумаги");

        System.out.println("Задание 4");
        byte bottle = 8;
        System.out.println("За 1 минуту машина произвела " +  bottle + " штук бутылок");
        int bottle1 = bottle * 20;
        System.out.println("За 20 минуту машина произвела " +  bottle1 + " штук бутылок");
        int bottel2 = bottle * 1440;
        System.out.println("В сутки машина произвела " +  bottel2 + " штук бутылок");
        int bottel3 = bottle * 1440 * 3;
        System.out.println("За 3 дня машина произвела " +  bottel3 + " штук бутылок");
        int bottel4 = bottle * 1440 * 30;
        System.out.println("За 1 месяц машина произвела " +  bottel4 + " штук бутылок");


        System.out.println("Задание 5");
        int totalCans = 120;
        System.out.println("Общее количество банок краски " + totalCans);
        int whitePaint = 2;
        int brownPaint = 4;
        System.out.println("Количество банок белой " + whitePaint + " и коричневой " +brownPaint + " краски на один класс");
        int numberOfClasses = totalCans / (whitePaint + brownPaint);
        System.out.println("Количесво классов " + numberOfClasses);
        int whitePaintAll = whitePaint * numberOfClasses;
        int brownPainAll = brownPaint * numberOfClasses;
        System.out.println("Количество банок белой " + whitePaintAll + " и коричневой красски " + brownPainAll);

        System.out.println("В школе где уходит " + whitePaint + " банки краски, нужно " + whitePaintAll + " банок белой краски");
        System.out.println("В школе где уходит " + brownPaint + " банки краски, нужно " + brownPainAll + " банок коричневой краски");

        System.out.println("Задание 6");
        int bananas = 5;
        System.out.println("Количество бананов " + bananas);
        int bananaWeight = 80;
        System.out.println("Вес одного банана в граммах " + bananaWeight);

        int milkVolume = 200;
        System.out.println("Объем молока " + milkVolume + " мл");
        int milkWeight100ml = 105;
        System.out.println("Вес 100мл молока " + milkWeight100ml + " г");

        int iceCreamCount = 2;
        System.out.println("Количество брикетов мороженого-пломбир " + iceCreamCount);
        int iceCreamWeight = 100;
        System.out.println("Вес одного брикета мороженого-пломбир " + iceCreamWeight + " г");

        int eggsCount = 4;
        System.out.println("Количество яиц " + eggsCount + " шт");
        int eggWeight = 70;
        System.out.println("Вес одно яйца " + eggWeight + " г");

        int totalBananaWeight = bananas * bananaWeight;
        System.out.println("Общий вес бананов " + totalBananaWeight + " г");
        int totalMilkWeight = (milkVolume / 100) * milkWeight100ml;
        System.out.println("Общий вес молока " + totalMilkWeight + " г");
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        System.out.println("Общий вес мороженного-пламбир " + totalIceCreamWeight + " г");
        int totalEggsWeight = eggsCount * eggWeight;
        System.out.println("Общий вес яиц " + totalEggsWeight + " г");

        int totalBreakfastWeight = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        System.out.println("Общий вес завтрака " + totalBreakfastWeight + " г");

        double totalBreakfastWeightKg = totalBreakfastWeight / 1000.0;
        System.out.println("В килограммах: " + totalBreakfastWeightKg + " кг");

        System.out.println("Задание 7");
        int totalWeightLoss = 7000;
        System.out.println("Общий вес для сброса 7 кг = " +totalWeightLoss + " г");

        int minLossPerDay = 250;
        System.out.println("Минимальная потеря веса " + minLossPerDay + " г");
        int maxLossPerDay = 500;
        System.out.println("Максимальная потеря веса " + maxLossPerDay + " г");

        int daysMinLoss = totalWeightLoss / minLossPerDay;
        System.out.println("Количесво дней для минимальной потери веса: " + daysMinLoss);
        int daysMaxLoss = totalWeightLoss / maxLossPerDay;
        System.out.println("Количество дней для максимальной потери веса: " +daysMaxLoss);

        double averageLossPerDay = (minLossPerDay + maxLossPerDay) / 2.0;
        int daysAverage = (int) Math. round (totalWeightLoss / averageLossPerDay);
        System.out.println("Среднее количесво дней: " + daysAverage);

        System.out.println("Если терять 250 грамм в день, потребуется дней: " + daysMinLoss);
        System.out.println("Если терять 500 грамм в день, потребуется дней: " + daysMaxLoss);
        System.out.println("В среднем потребуется дней: " + daysAverage);

        System.out.println("Задание 8");
        double mashaSalary = 67760;
        System.out.println("Зарплата Маши " + mashaSalary + " рублей в месяц");
        double denisSalary = 83690;
        System.out.println("Зарплата Дениса " + denisSalary + " рублей в месяц");
        double kristinaSalary = 76230;
        System.out.println("Зарплата Кристины " + kristinaSalary + " рублей в месяц");

        double mashaNewSalary = mashaSalary * 1.10;
        System.out.println("Повышени зарплаты Маши на 10% " + "= " + mashaNewSalary + " рублей в месяц");
        double denisNewSalary = denisSalary * 1.10;
        System.out.println("Повышени зарплаты Дениса на 10% " + "= " + denisNewSalary + " рублей в месяц");
        double kristinaNewSalary = kristinaSalary * 1.10;
        System.out.println("Повышени зарплаты Кристины на 10% " + "= " + kristinaNewSalary + " рублей в месяц");

        double mashaAnnualBefore = mashaSalary * 12;
        System.out.println("Годовой доход Маши до повышения = " + mashaAnnualBefore + " рублей в месяц");
        double mashaAnnualAfter = mashaNewSalary * 12;
        System.out.println("Годовой доход Маши после повышения = " + mashaAnnualAfter + " рублей в месяц");
        double mashaDifference = mashaAnnualAfter - mashaAnnualBefore;
        System.out.println("Разница между годовым доходом с нынешней зарплатой Маши и после повышения = " + mashaDifference);

        double denisAnnualBefore = denisSalary * 12;
        System.out.println("Годовой доход Дениса до повышения = " + denisAnnualBefore + " рублей в месяц");
        double denisAnnualAfter = denisNewSalary * 12;
        System.out.println("Годовой доход Дениса после повышения = " + denisAnnualAfter + " рублей в месяц");
        double denisDifference = denisAnnualAfter - denisAnnualBefore;
        System.out.println("Разница между годовым доходом с нынешней зарплатой Дениса и после повышения = " + denisDifference);

        double kristinaAnnualBefore = kristinaSalary * 12;
        System.out.println("Годовой доход Кристины до повышения = " + kristinaAnnualBefore + " рублей в месяц");
        double kristinaAnnualAfter = kristinaNewSalary * 12;
        System.out.println("Годовой доход Кристины после повышения = " + kristinaAnnualAfter + " рублей в месяц");
        double kristinaDifference = kristinaAnnualAfter - kristinaAnnualBefore;
        System.out.println("Разница между годовым доходом с нынешней зарплатой Кристины и после повышения = " + kristinaDifference);

        System.out.println("Итог: ");
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей.");




    }
}