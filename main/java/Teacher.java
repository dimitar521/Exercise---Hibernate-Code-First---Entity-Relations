import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "teachers")

public class Teacher extends User{
    private String email;
    private Float salaryPerHour;
    private Set<Course>courses;
@OneToMany(mappedBy = "teacher")
    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(Float salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public Teacher() {
    }
}
