import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "completitions")
public class Competition extends BaseEntity {
    private String name;
    private CompetitionType competitionType;
    private Set<Game> games;

    public Competition() {
    }
@OneToMany(mappedBy = "competition")
    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "competition_type", referencedColumnName = "id")
    public CompetitionType getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(CompetitionType competitionType) {
        this.competitionType = competitionType;
    }
}

