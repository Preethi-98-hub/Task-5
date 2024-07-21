package com.Task5;
import java.util.Scanner;
public class Hoteltariffcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Read the input values
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the room rent per day: ");
        float roomRentPerDay = scanner.nextFloat();
        
        System.out.print("Enter the number of days stayed in the hotel: ");
        int numberOfDays = scanner.nextInt();

        // Calculate the total tariff
        float totalTariff = calculateTariff(month, roomRentPerDay, numberOfDays);

        // Print the total tariff
        System.out.printf("The total hotel tariff to be paid is: %.2f\n", totalTariff);
        
        scanner.close();
    }

    public static float calculateTariff(int month, float roomRentPerDay, int numberOfDays) {
        // Check if the month is a peak season month
        boolean isPeakSeason = (month >= 4 && month <= 6) || (month >= 11 && month <= 12);

        // If it's peak season, increase the room rent by 20%
        if (isPeakSeason) {
            roomRentPerDay *= 1.20;
        }

        // Calculate the total tariff
        return roomRentPerDay * numberOfDays;
    }

	}


