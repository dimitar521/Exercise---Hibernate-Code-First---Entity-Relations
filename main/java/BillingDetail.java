import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public abstract class BillingDetail extends BaseEntity{
    private String number;
    private String owner;

    public BillingDetail() {
    }
@Column
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
@Column
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
