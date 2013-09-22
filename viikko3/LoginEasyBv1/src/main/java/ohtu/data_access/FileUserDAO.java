/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.data_access;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ohtu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author alpa
 */
@Component
public class FileUserDAO implements UserDao {

    FileWriter writer;
    Scanner scanner;
    private List<User> users;

    @Autowired
    public FileUserDAO(String file) throws IOException {
        scanner = new Scanner(new FileReader(f));
        users = new ArrayList<User>();
        add(new User("pekka", "akkep"));
    }

    @Override
    public List<User> listAll() {
        return users;
    }

    @Override
    public User findByName(String name) {

        return null;
    }

    @Override
    public void add(User user) {
     
    }

    private void writeIntoList() throws IOException {
    }

    private void loadList() {
    }
}
