public class DataTypesExplorer {

    public static void main(String[] args) {

        String name = "Alex";
        int age = 0;
        double salary = 9500.50;
        boolean isActive = true;
        long companyId = 876543897L;

        // Explicit cast
        int salaryInt = (int) salary;

        // Parsing
        age = Integer.parseInt("36");

        System.out.println(name);
        System.out.println(age);
        System.out.println(salaryInt);
        System.out.println(isActive);
        System.out.println(companyId);

    }

}
