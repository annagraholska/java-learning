package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        int age = 30;
        int currentYear = 2024;
        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        double temperature = 36.6;
        double price = 19.99;

        System.out.println(temperature);
        System.out.println(price);

        char grade = 'A';
        char myInitial = 'N';
        char currencySymbol = '$';
        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer);

        long phoneNumber = 367864345;

        float interestRate = 4.5f;

        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result = m * n;
        System.out.println(result);


        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        int f = 12;
        int g = 5;
        int reminder = f % g;
        System.out.println(reminder);

        int number = 9;
        boolean isEven = (number % 2 ==0);
        System.out.println(isEven);


        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++;
        int preIncrement = ++counter;
        System.out.println(postIncrement);
        System.out.println(preIncrement);

    }
}
