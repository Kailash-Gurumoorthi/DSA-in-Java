class Student {
    String name;
    int roll;

    // 1. CONSTRUCTOR CHAINING
    // If we only have a name, we call the other constructor and set roll to 0
    Student(String name) {
        this(name, 0); // This calls the constructor below
    }

    // 2. RESOLVING SHADOWING
    // Notice the parameters have the SAME names as the variables above
    Student(String name, int roll) {
        this.name = name; // "this.name" is the class variable; "name" is the parameter
        this.roll = roll; // Without "this", Java would just assign the parameter to itself
    }

    // 3. RETURNING 'THIS' (Fluent API)
    // This allows us to write student.setName("Ali").setRoll(10)
    public Student updateName(String name) {
        this.name = name;
        return this; // Returns the current object
    }

    void display() {
        System.out.println("Name: " + this.name + ", Roll: " + this.roll);
    }
}

public class oopsexample {
    public static void main(String[] args) {
        // Create student using the 2-arg constructor
        Student s1 = new Student("Kailash", 122);

        // Create student using the 1-arg constructor (which chains to the 2-arg one)
        Student s2 = new Student("Gemini");

        s1.display();
        s2.display();

        // Example of chaining after return this;
        s2.updateName("New Name").display();
    }
}