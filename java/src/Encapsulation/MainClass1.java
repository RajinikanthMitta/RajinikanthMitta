package Encapsulation;

class Class1 {
    // Private fields (data members)
    private String name;

    // Public methods to access and modify the private fields

    // Setter for name
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter for name
    public String getName()
    {
        return name;
    }

}

public class MainClass1 {
    public static void main(String[] args) {
       
        Class1 p = new Class1();
        p.setName("John Doe");
      
        // Get the values using the getters and print them
        System.out.println("Name: " + p.getName());
       
    }
}

