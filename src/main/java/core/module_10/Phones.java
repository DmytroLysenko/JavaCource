package src.main.java.core.module_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Phones {

    public static final void printValidPhonesFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String phone = reader.readLine();
            while (phone != null) {
                if (Phones.isPhoneValid(phone)) {
                    System.out.println(phone);
                }
                phone = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static final boolean isPhoneValid(String phone) {
        return phone.matches("\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\) \\d{3}-\\d{4}");
    }

}
