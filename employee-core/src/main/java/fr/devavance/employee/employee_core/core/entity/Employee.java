package fr.devavance.employee.employee_core.core.entity;

import fr.devavance.employee.employee_core.core.enumeration.Fonction;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String email;
    private String phone;
    private Fonction fonction;

    public Employee(){}

    public Employee(String name, String email, String phone, String address, Fonction fonction){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.fonction = fonction;
    }

}

