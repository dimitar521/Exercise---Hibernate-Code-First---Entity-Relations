import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country{
    private String id;
    private String name;
    private Set<Continent> continents;
    private Set<Town>towns;

@OneToMany(mappedBy = "country")
    public Set<Town> getTowns() {
        return towns;
    }

    public void setTowns(Set<Town> towns) {
        this.towns = towns;
    }



@Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Country() {
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @Column(length = 3)
    public String getId() {
        return id;
    }
@ManyToMany
@JoinTable(name = "countries_continents",
        joinColumns = @JoinColumn(name = "country_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "continent_id", referencedColumnName = "id"))
    public Set<Continent> getContinents() {
        return continents;
    }

    public void setContinents(Set<Continent> continents) {
        this.continents = continents;
    }
}
