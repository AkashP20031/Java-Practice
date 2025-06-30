package OOPS.Encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        BookDetails b1 = new BookDetails();
        b1.setId(1);
        b1.setName("JAVA");
        b1.setDepartment("CSE");
        b1.setWriter("Jhon");
        b1.setAddedon("01-02-2006");
        System.out.println("Book Id : "+b1.getId());
        System.out.println("Book Name : "+b1.getName());
        System.out.println("Department : "+b1.getDepartment());
        System.out.println("writer name : "+b1.getWriter());
        System.out.println("Added on : "+b1.getAddedon());
    }
}
