package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long sum = calculateSum(sales);
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int countSalesLessThenAverage(long[] sales) {
        long average = calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count += 1;
            }
        }
        return count;
    }

    public int countSalesMoreThenAverage(long[] sales) {
        long average = calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count += 1;
            }
        }
        return count;
    }
}