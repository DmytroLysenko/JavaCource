package src.main.java.core.module_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserUtils {
    private static final String USER_FILE_SEPARATOR = " ";
    private static final String USERS_JSON_RELATIVE_PATH = "src/main/resources/users.json";

    public static final List<User> getUsersFromFile(File file) {
        List<User> users = new ArrayList<User>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int lineCount = 0;
            String line = reader.readLine();
            while (line != null) {
                if (lineCount == 0 && !isFileHeadersValid(line)) {
                    return users; // Headers are not valid - return empty list
                }

                if (lineCount == 0) {
                    // Headers are validated - just go to the next line

                } else {
                    String[] arr = line.split(USER_FILE_SEPARATOR);
                    String name = arr[0];
                    int age = Integer.parseInt(arr[1]);
                    users.add(new User(name, age));
                }

                lineCount++;
                line = reader.readLine();

            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return users;
    }

    public static final File createUsersJsonFile(List<User> users) {
        File usersJson = new File(USERS_JSON_RELATIVE_PATH);
        usersJson.delete(); // each time remove the file
        FileUtil.createIfNotAvailable(usersJson); // and then create it again to be sure the file is empty

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(usersJson))) {
            class JSONCreator {
                private static final String getWrappedItem(String str) {
                    return "\"" + str + "\"";
                }

                public static final String getLine(String str, boolean isFirstLine) {
                    String line = isFirstLine ? "" : "\n";
                    return line + str;
                }

                public static final String getLine(String str) {
                    return "\n" + str;
                }

                public static final String getLine(String key, String value, boolean isLast) {
                    return "\n" + getWrappedItem(key) + ": " + getWrappedItem(value) + (isLast ? "" : ",");
                }

                public static final String getLine(String key, int value, boolean isLast) {
                    return "\n" + getWrappedItem(key) + ": " + value + (isLast ? "" : ",");
                }
            }
            writer.write(JSONCreator.getLine("[", true));
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                writer.write(JSONCreator.getLine("{"));
                writer.write(JSONCreator.getLine("name", user.getName(), false));
                writer.write(JSONCreator.getLine("age", user.getAge(), true));
                writer.write(JSONCreator.getLine("}") + (i == users.size() - 1 ? "" : ","));
            }
            writer.write(JSONCreator.getLine("]"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return usersJson;
    }

    private static final boolean isFileHeadersValid(String headers) {
        String[] arr = headers.split(USER_FILE_SEPARATOR);
        if (arr.length != 2)
            return false;
        return arr[0].matches("name") && arr[1].matches("age");
    }

}
