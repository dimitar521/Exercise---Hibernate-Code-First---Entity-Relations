import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "completition_types")
public class CompetitionType extends BaseEntity{
    private String name;

    public CompetitionType() {
    }
@Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
