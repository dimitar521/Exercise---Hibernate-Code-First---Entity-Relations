import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "patients")

public class Patient extends BaseEntity{
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private Date dateOfBirth;
    private Blob picture;
    private boolean isInsured;

    private Set<Visitation>visitations;
    private Set<Medicament> medicaments;
    private Set<Diagnose>diagnoses;

@OneToMany(mappedBy = "patient",targetEntity = Visitation.class)
    public Set<Visitation> getVisitations() {
        return visitations;
    }

    public void setVisitations(Set<Visitation> visitations) {
        this.visitations = visitations;
    }


@ManyToMany
@JoinTable(name = "patients_diagnoses",
        joinColumns = @JoinColumn(name="patient_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name="diagnoses_id", referencedColumnName = "id"))
    public Set<Diagnose> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<Diagnose> diagnoses) {
        this.diagnoses = diagnoses;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
@Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
@Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
@Column(name = "email",unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
@Column(name = "date_of_birth")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
@Column(name = "picture")

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }
@Column(name = "is_insured")
    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public Patient() {
    }
@ManyToMany
@JoinTable(name="patients_medicaments",
        joinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name="medicaments_id", referencedColumnName = "id"))
    public Set<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Set<Medicament> medicaments) {
        this.medicaments = medicaments;
    }
}
