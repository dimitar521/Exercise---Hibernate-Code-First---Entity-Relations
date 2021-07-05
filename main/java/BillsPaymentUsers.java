import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bills_payment_users")
public class BillsPaymentUsers extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String billingDetails;

    public BillsPaymentUsers() {
    }
@Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstNam) {
        this.firstName = firstNam;
    }
@Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
@Column(name = "email",unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
@Column(name = "password",nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
@Column(name = "billing_details")
    public String getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(String billingDetails) {
        this.billingDetails = billingDetails;
    }
}
