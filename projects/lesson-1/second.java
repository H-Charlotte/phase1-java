import java.util.Scanner;

public class second {

    // A small "Device Status" program
    public static void main(String[] args) {

        // Variables
        String deviceName = "AlphaBot";
        int batteryLevel = 100;
        double temperature = 36.5;
        boolean isActive = true;

        // Array of connected sensors
        String[] sensors = {"Ultrasonic", "Gyro", "ColorSensor"};

        // Simple interactive prompts
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter device name (press Enter to keep '" + deviceName + "'): ");
        String inputName = sc.nextLine();
        if (!inputName.isBlank()) {
            deviceName = inputName;
        }

        System.out.print("Enter battery usage to simulate (default 15): ");
        String inputUsed = sc.nextLine();
        int used = 15;
        if (!inputUsed.isBlank()) {
            try {
                used = Integer.parseInt(inputUsed.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, using default 15.");
            }
        }

        // Print device information
        System.out.println("=== Device Status ===");
        System.out.println("Device Name: " + deviceName);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Temperature: " + temperature + "C");
        System.out.println("Active: " + isActive);
        System.out.println("Sensors:");
        for (int i = 0; i < sensors.length; i++) {
            System.out.println("- " + sensors[i]);
        }

        // Call method to update battery
        batteryLevel = drainBattery(batteryLevel, used);
        System.out.println("Battery Level after usage: " + batteryLevel + "%");

        sc.close();

    }

    // Method to simulate battery usage
    public static int drainBattery(int currentLevel, int used) {
        int newLevel = currentLevel - used;
        return Math.max(newLevel, 0);
    }
}
