import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "games")
public class Game extends BaseEntity{
    private Team homeTeam;
    private Team awayTeam;
    private Integer homeGoals;
    private Integer awayGoals;
    private LocalDateTime gameDayTime;
    private Integer homeTeamWin;
    private Integer awayTeamWin;
    private Integer drawRate;
    private Round round;
    private Competition competition;

    public Game() {
    }
@OneToOne
    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }
@OneToOne
    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
@ManyToOne
    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }
@ManyToOne
    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    public LocalDateTime getGameDayTime() {
        return gameDayTime;
    }

    public void setGameDayTime(LocalDateTime gameDayTime) {
        this.gameDayTime = gameDayTime;
    }

    public Integer getHomeTeamWin() {
        return homeTeamWin;
    }

    public void setHomeTeamWin(Integer homeTeamWin) {
        this.homeTeamWin = homeTeamWin;
    }

    public Integer getAwayTeamWin() {
        return awayTeamWin;
    }

    public void setAwayTeamWin(Integer awayTeamWin) {
        this.awayTeamWin = awayTeamWin;
    }

    public Integer getDrawRate() {
        return drawRate;
    }

    public void setDrawRate(Integer drawRate) {
        this.drawRate = drawRate;
    }

}
