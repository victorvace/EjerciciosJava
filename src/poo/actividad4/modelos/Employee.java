package poo.actividad4.modelos;

public class Employee {

    private String name, lasName, birthday, contractDate;

    public Employee() {
    }

    public Employee(String name, String lastName, String birthday, String contractDate) {
        this.name = name;
        this.lasName = lastName;
        this.birthday = birthday;
        this.contractDate = contractDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lasName;
    }

    public void setLastName(String lastName) {
        this.lasName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "Nombre:\t" + name + '\n' +
                "Apellidos:\t" + lasName + '\n' +
                "Fecha de nacimiento\t" + birthday + '\n' +
                "Fecha de contrato:\t" + contractDate + "\n";
    }

}
