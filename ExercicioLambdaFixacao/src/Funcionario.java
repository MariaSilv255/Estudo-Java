public class Funcionario {

    private String name;
    private String email;
    private Double salario;

    public Funcionario(){

    }

    public Funcionario(String name, String email, Double salario) {
        this.name = name;
        this.email = email;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
