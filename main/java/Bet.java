import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bets")
public class Bet extends BaseEntity{
    private BigDecimal betMoney;
    private LocalDateTime dateTime;
    private User1 user1;

    public Bet() {
    }
@Column(name = "bet_money")
    public BigDecimal getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(BigDecimal betMoney) {
        this.betMoney = betMoney;
    }
@Column(name = "data_time")
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
@ManyToOne(targetEntity = User1.class)
@JoinColumn(name = "user_id", referencedColumnName = "id")
    public User1 getUser1() {
        return user1;
    }

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }
}
