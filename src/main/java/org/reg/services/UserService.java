package org.reg.services;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;
import org.reg.model.User;

import java.util.List;

import static org.reg.services.FileSystemService.getPathToFile;

public class UserService {
    private static ObjectRepository<User> userRepository;
    private static Nitrite database;

    public static ObjectRepository<User> getUserRepository() {
        return userRepository;
    }

    public static void initDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathToFile("Airline Application.db").toFile())
                .openOrCreate("test", "test");

        userRepository = database.getRepository(User.class);
    }

    public static List<User> getAllUsers() {
        return userRepository.find().toList();
    }

    public static ObjectRepository<User> getUsers() {return userRepository;}



    public static Nitrite getDatabase() {
        return database;
    }
}

