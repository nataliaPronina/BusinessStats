package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = salesAmount(sales);
        long aver = totalSale / 12;
        return aver;

    }

    public int maxMonthSale(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int minMonthSale(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        long aver = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < aver) {
                counter++;
            }
        }
        return counter;

    }

    public int overAverage(long[] sales) {
        long aver = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > aver) {
                counter++;
            }
        }
        return counter;
    }
}