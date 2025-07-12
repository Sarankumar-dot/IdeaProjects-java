package SOLIDprinciples.SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Employee saran = new Employee("saran" , 500000);

        System.out.println(saran.getName());

        saran.setName("kumar");
        saran.setSalary(1000000);

        System.out.println(saran.getName());


        CalculateSalary Hr = new CalculateSalary();
        System.out.println(Hr.CalculateSalary(saran));

        ReportGenerator HR = new ReportGenerator();
        HR.GenerateReport(saran);
    }
}
