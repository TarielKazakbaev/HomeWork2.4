public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user1 = new User("Kazakbaev Tariel Sharshenbekovich","Tariel",33,"Tari",false);
        if(user1.getAge()<=0){
            System.out.println("Введите положительное число");
        }
        computer.setUser(user1);
        System.out.println(user1);
    }
}
