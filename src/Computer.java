public class Computer {
    private User user;

    @Override
    public String toString() {
        return  "Computer " + "\n"+
                "user: " + user ;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
