package data;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Evgeny Borisov
 */
@Entity
@Data
public class Event {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "foreignKey")
    private Person person;
}
