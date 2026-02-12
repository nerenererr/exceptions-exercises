public class Throw {

    public int calculateAge(int birthYear) {
        try {
            int age = 2026 - birthYear;

        } catch (IllegalArgumentException e) {
            System.out.println("Not valid");
        }
        return "You are " + age + " years old.";
    }
}
