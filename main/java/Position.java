



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "positions")
public class Position{
    private String id;
    private String positionDescription;
    private Set<Player> players;

@OneToMany(mappedBy = "position")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
@Id
    @Column(length = 2)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position() {
    }

@Column(name = "positiion_description")
    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }
}
