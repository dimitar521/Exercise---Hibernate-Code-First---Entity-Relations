import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Blob;

@Entity
@Table(name = "teams")
public class Team extends BaseEntity{
    private String name;
    private byte[] logo;
    private String initials;
    private Color primaryColor;
    private Color secondaryColor;
    private Town town;
    private BigDecimal budget;

    public Team() {
    }
@Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Lob
@Column
    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }
@Column(length = 3)
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }
@ManyToOne
    public Color getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(Color primaryColor) {
        this.primaryColor = primaryColor;
    }
@ManyToOne
    public Color getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(Color secondaryColor) {
        this.secondaryColor = secondaryColor;
    }
@ManyToOne
    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    @Column
    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}
