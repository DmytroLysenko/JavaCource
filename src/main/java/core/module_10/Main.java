package src.main.java.core.module_10;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String PHONES_RELATIVE_PATH = "src/main/resources/phones.txt";
    private static final String USERS_RELATIVE_PATH = "src/main/resources/users.txt";
    private static final String WORDS_RELATIVE_PATH = "src/main/resources/words.txt";

    public static void main(String[] args) {
        // Task 1
        System.out.println("--- TASK 1 ---");
        File phonesFile = new File(PHONES_RELATIVE_PATH);
        FileUtil.createIfNotAvailable(phonesFile);
        Phones.printValidPhonesFromFile(phonesFile);

        // Task 2
        System.out.println("--- TASK 2 ---");
        File usersFile = new File(USERS_RELATIVE_PATH);
        FileUtil.createIfNotAvailable(usersFile);
        List<User> users = UserUtils.getUsersFromFile(usersFile);
        File file = UserUtils.createUsersJsonFile(users);
        FileUtil.printFile(file);
        file.delete(); // delete file

        // Task 3
        System.out.println("--- TASK 3 ---");
        File wordsFile = new File(WORDS_RELATIVE_PATH);
        FileUtil.createIfNotAvailable(wordsFile);
        List<String> words = WordUtils.getAllWordsFromFile(wordsFile);
        Map<String, Integer> map = WordUtils.getWordFrequency(words);
        WordUtils.printSortedFrequency(map);
    }

}