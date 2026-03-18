package model_entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Seller implements Serializable{
    private Integer id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private Double baseSalary;

    private Department department = new Department();

    public Seller(){
    }
    public Seller(Integer id, String name, String email, LocalDate birthDate, Double baseSalary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;
        return id.equals(seller.id) && name.equals(seller.name) && email.equals(seller.email) && birthDate.equals(seller.birthDate) && baseSalary.equals(seller.baseSalary);
    }
    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + baseSalary.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "Seller" +
                "id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", birthDate=" + birthDate +
                ", baseSalary=" + baseSalary;
    }
}
