package in.ratheesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//establishing the connection between entity class & database
@Entity
@Table(name = "empdata")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String name;
    private String gender;
    private Integer contactno;
    //private Integer phno;

    public Employee() {

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

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public Integer getContactno() {

        return contactno;
    }

    public void setContactno(Integer contactno) {

        this.contactno = contactno;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", contactno=" + contactno + "]";
    }

    public Employee(Integer id, String name, String gender, Integer contactno) {

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.contactno = contactno;
    }


}
