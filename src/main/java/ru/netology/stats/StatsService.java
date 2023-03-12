package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale = totalSale + sales[i];
        }
        return totalSale;
    }

    public long mean(long[] sales) {
        return sumOfAllSales(sales) / sales.length;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthlySalesBelowMean(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < mean(sales))
                result++;
        }
        return result;
    }

    public int monthlySalesAboveMean(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > mean(sales))
                result++;
        }
        return result;
    }
}
