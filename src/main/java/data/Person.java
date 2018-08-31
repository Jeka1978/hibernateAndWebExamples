package data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    @JsonIgnore
    private long id;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "person")
    @ManyToOne
    private Set<Event> events;

    public void printFirstEvent() {
        System.out.println(events.iterator().next());
    }

    private String name;
    private int salary;
    @Basic(fetch = FetchType.LAZY)
    private String picture;
    @Transient
    private int age;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


}






