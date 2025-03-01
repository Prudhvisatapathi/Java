import java.util.Scanner;

class Pizza {
    private int basePrice;
    private boolean isVeg;
    private int extraCheesePrice = 0;
    private int extraToppingsPrice = 0;
    private int takeAwayPrice = 0;
    private int totalPrice = 0;
    private boolean isDeluxe;

    // Constructor
    public Pizza(boolean isVeg, boolean isDeluxe) {
        this.isVeg = isVeg;
        this.isDeluxe = isDeluxe;
        if (isVeg) {
            this.basePrice = isDeluxe ? 500 : 300;
        } else {
            this.basePrice = isDeluxe ? 650 : 400;
        }
    }

    public void addExtraCheese() {
        if (!isDeluxe) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Want extra cheese (y/n)?");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("y")) {
                extraCheesePrice = 100;
            }
        }
    }

    public void addExtraToppings() {
        if (!isDeluxe) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Want extra toppings (y/n)?");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("y")) {
                extraToppingsPrice = 150;
            }
        }
    }

    public void takeAway() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Want take away (y/n)?");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("y")) {
            takeAwayPrice = 20;
        }
    }

    public void getBill() {
        totalPrice = basePrice + extraCheesePrice + extraToppingsPrice + takeAwayPrice;
        StringBuilder bill = new StringBuilder();
        bill.append("╔══════════════════════════════════════════╗\n");
        bill.append(String.format("║ %-40s ║%n", "Pizza: " + basePrice));
        if (extraCheesePrice > 0) {
            bill.append(String.format("║ %-40s ║%n", "Extra Cheese: " + extraCheesePrice));
        }
        if (extraToppingsPrice > 0) {
            bill.append(String.format("║ %-40s ║%n", "Extra Toppings: " + extraToppingsPrice));
        }
        if (takeAwayPrice > 0) {
            bill.append(String.format("║ %-40s ║%n", "Take Away: " + takeAwayPrice));
        }
        bill.append(String.format("║ %-40s ║%n", "Total Amount: " + totalPrice));
        bill.append("╚══════════════════════════════════════════╝\n");
        bill.append("Thank you!!!! Visit again.................");
        System.out.println(bill.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("------------------------------------------------Welcome to Pizzamania-----------------------------------------------");
            System.out.println("Which Pizza: 1. Veg Pizza 2. Non-Veg Pizza 3. Delux Veg Pizza 4. Delux Non-Veg Pizza (type 'exit' to quit)");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
                System.out.println("Exiting... Thank you for visiting Pizzamania!");
            } else {
                int choice;
                try {
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid choice! Please try again.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        Pizza vegPizza = new Pizza(true, false);
                        vegPizza.addExtraToppings();
                        vegPizza.addExtraCheese();
                        vegPizza.takeAway();
                        vegPizza.getBill();
                        break;
                    case 2:
                        Pizza nonVegPizza = new Pizza(false, false);
                        nonVegPizza.addExtraToppings();
                        nonVegPizza.addExtraCheese();
                        nonVegPizza.takeAway();
                        nonVegPizza.getBill();
                        break;
                    case 3:
                        Pizza deluxVegPizza = new Pizza(true, true);
                        deluxVegPizza.takeAway();
                        deluxVegPizza.getBill();
                        break;
                    case 4:
                        Pizza deluxNonVegPizza = new Pizza(false, true);
                        deluxNonVegPizza.takeAway();
                        deluxNonVegPizza.getBill();
                        break;
                    default:
                        System.out.println("║ Invalid choice! Please try again. ║");
                        break;
                }
                
            }
        }
        sc.close();
    }
}
