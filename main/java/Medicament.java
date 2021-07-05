import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "medicaments")

public class Medicament extends BaseEntity{
    private String medicamentName;
    private Set<Patient>patients;
@ManyToMany(mappedBy = "medicaments",targetEntity = Patient.class)
public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public Medicament() {
    }
@Column(name = "medicament_name")
    public String getMedicamentName() {
        return medicamentName;
    }

    public void setMedicamentName(String medicamentName) {
        this.medicamentName = medicamentName;
    }
}
