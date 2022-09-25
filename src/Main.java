public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        byte varByte = 127;
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        short varShort = 32767;
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        int varInt = 2147483647;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        long varLong = 9223372036854775807L;
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        float varFloat = 3.4f;
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        double varDouble = 1.7;
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        // Задание 2
        System.out.println("Задание 2");
        float value1 = 27.12f;
        System.out.println("Значение 1 с типом float равно " + value1);
        long value2 = 987678965549L;
        System.out.println("Значение 2 с типом long равно " + value2);
        byte value3 = 2;
        System.out.println("Значение 3 с типом byte равно " + value3);
        short value4 = 786;
        System.out.println("Значение 4 с типом short равно " + value4);
        boolean value5 = false;
        System.out.println("Значение 5 с типом boolean равно " + value5);
        short value6 = 569;
        System.out.println("Значение 6 с типом short равно " + value6);
        short value7 = -159;
        System.out.println("Значение 7 с типом short равно " + value7);
        int value8 = 27897;
        System.out.println("Значение 8 с типом int равно " + value8);
        byte value9 = 67;
        System.out.println("Значение 9 с типом byte равно " + value9);
        double varDouble1 = 1.7777777777;
        System.out.println("Инициализирована переменная double " + varDouble1);
        char varChar = 35;
        System.out.println("Инициализирована переменная char " + varChar);
        // Задание 3
        System.out.println("Задание 3");
        short studentsOfLyudmilaPavlovna = 23;
        short studentsOfAnnaSergeevna = 27;
        short studentsOfEkaterinaAndreevna = 30;
        short totalSheets = 480;
        int SheetsPerStudent = totalSheets / (studentsOfLyudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna);
        System.out.println("На одного ученика рассчитано " + SheetsPerStudent + " листов бумаги");
        // Задание 4
        System.out.println("Задание 4");
        byte bottles = 16;
        byte minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int machineWorkTime = 20;
        int machineProductivity = machineWorkTime * bottlesPerMinute;
        System.out.println("За 20 минут работы машина произвела бутылок " + machineProductivity + " штук");
        machineWorkTime = 1440;
        machineProductivity = machineWorkTime * bottlesPerMinute;
        System.out.println("За сутки работы машина произвела бутылок " + machineProductivity + " штук");
        machineWorkTime = 1440 * 3;
        machineProductivity = machineWorkTime * bottlesPerMinute;
        System.out.println("За 3 дня работы машина произвела бутылок " + machineProductivity + " штук");
        machineWorkTime = 1440 * 30;
        machineProductivity = machineWorkTime * bottlesPerMinute;
        System.out.println("За месяц работы машина произвела бутылок " + machineProductivity + " штук");
        // Задание 5
        System.out.println("Задание 5");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = totalPaint / (whitePaint + brownPaint);
        int whitePaintTotal = totalClasses * whitePaint;
        int brownPaintTotal = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");
        // Задание 6
        System.out.println("Задание 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte sundaeWeight = 100;
        byte eggWeight = 70;
        byte totalBananas = 5;
        byte totalMilk = 2;
        byte totalSundae = 2;
        byte totalEggs = 4;
        int totalWeight = bananaWeight * totalBananas + milkWeight * totalMilk + sundaeWeight * totalSundae + eggWeight * totalEggs;
        double weightKg = totalWeight * 0.001;
        System.out.println("Вес такого спорт-завтрака " + weightKg + " кг");
        // Задание 7
        System.out.println("Задание 7");
        int weightLoss = 7000;
        short lossPerDay1 = 250;
        short lossPerDay2 = 500;
        int weightLossDays1 = weightLoss / lossPerDay1;
        System.out.println(weightLossDays1 + " дней уйдет на похудение, если спортсмен будет терять по 250 грамм в день");
        int weightLossDays2 = weightLoss / lossPerDay2;
        System.out.println(weightLossDays2 + " дней уйдет на похудение, если спортсмен будет терять по 500 грамм в день");
        int averageLossPerDay = (lossPerDay1 + lossPerDay2) / 2;
        int averageWeightLoss = weightLoss / averageLossPerDay;
        System.out.println(averageWeightLoss + " дней уйдет на похудение, если спортсмен будет терять по 250-500 грамм в день");
        // Задание 8
        System.out.println("Задание 8");
        int mashaSalary = 67760;
        int mashaAnnualIncome = mashaSalary * 12;
        double mashaSalaryRaise = mashaSalary + mashaSalary * 0.1;
        double mashaAnnualIncomeRaise = mashaSalaryRaise * 12;
        double mashaAnnualIncomeIncrease = mashaAnnualIncomeRaise - mashaAnnualIncome;
        System.out.println("Маша теперь получает " + mashaSalaryRaise + " рублей. Годовой доход вырос на " + mashaAnnualIncomeIncrease + " рублей");
        int denisSalary = 83690;
        int denisAnnualIncome = denisSalary * 12;
        double denisSalaryRaise = denisSalary + denisSalary * 0.1;
        double denisAnnualIncomeRaise = denisSalaryRaise * 12;
        double denisAnnualIncomeIncrease = denisAnnualIncomeRaise - denisAnnualIncome;
        System.out.println("Денис теперь получает " + denisSalaryRaise + " рублей. Годовой доход вырос на " + denisAnnualIncomeIncrease + " рублей");
        int kristinaSalary = 76230;
        int kristinaAnnualIncome = kristinaSalary * 12;
        double kristinaSalaryRaise = kristinaSalary + kristinaSalary * 0.1;
        double kristinaAnnualIncomeRaise = kristinaSalaryRaise * 12;
        double kristinaAnnualIncomeIncrease = kristinaAnnualIncomeRaise - kristinaAnnualIncome;
        System.out.println("Кристина теперь получает " + kristinaSalaryRaise + " рублей. Годовой доход вырос на " + kristinaAnnualIncomeIncrease + " рублей");
    }
}