package com.assignment4;

public class Armstrong {

    public static void main(String[] args) throws BadRequestException {

        int number = 123, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        try {
            if (result == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                throw new BadRequestException(404, "not an armstrong number");

            }
        } catch (BadRequestException e) {
            System.out.println("status:" + e.status + " message:" + e.message);

        }

    }
}
