import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends BaseEntity{
    private String name;
    private Integer squadNumber;
    private Team team;
    private Position position;
    private Boolean isCurrentlyInjured;

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Column(name = "squad_number")
    public Integer getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(Integer squadNumber) {
        this.squadNumber = squadNumber;
    }
@ManyToOne
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
@ManyToOne
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Column(name = "currently_injured")
    public Boolean getCurrentlyInjured() {
        return isCurrentlyInjured;
    }

    public void setCurrentlyInjured(Boolean currentlyInjured) {
        isCurrentlyInjured = currentlyInjured;
    }

    public Player() {
    }
}
