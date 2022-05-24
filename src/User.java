public class User {
     private String FIO;
     private String login;
     private int age;
     private String password;
     private boolean banned;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "User " + "\n"+
                "FIO: " + FIO + "\n" +
                "login: " + login + "\n" +
                "age: " + age + "\n"+
                "password: " + password + "\n" +
                "banned: " + banned;
    }

    public User(String FIO, String login, int age, String password, boolean banned) {
        this.FIO = FIO;
        this.login = login;
        this.age = age;
        this.password = password;
        this.banned = banned;
    }
}
