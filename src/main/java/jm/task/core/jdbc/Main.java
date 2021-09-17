package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {

    public static void main(String[] args) {
        UserDaoJDBCImpl ud = new UserDaoJDBCImpl();
        ud.createUsersTable();
        ud.saveUser("name1", "lastname1", (byte) 1);
        ud.saveUser("name2", "lastname2", (byte) 2);
        ud.saveUser("name3", "lastname3", (byte) 3);
        ud.saveUser("name4", "lastname4", (byte) 4);
        ud.getAllUsers();
        ud.cleanUsersTable();
        ud.dropUsersTable();
    }
}
