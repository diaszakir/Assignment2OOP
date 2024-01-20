public class Employee extends Person{
    static int id;
    String name;
    String surname;
    String position;
    double salary;
    public String toString(){
        return "Employee: " + super.toString();
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getPosition(){
        return position;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setPosition(String position){
        this.surname = surname;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public Employee(){

    }

    public Employee(String name, String surname, String position, double salary){
        super(name,surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
