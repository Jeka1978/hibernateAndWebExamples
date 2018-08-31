package data;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Repository
public class PersonDao {
    @PersistenceContext
    private EntityManager entityManager;


    public List<Person> getPersons() {
        Query query = entityManager.createQuery("from Person where name=:name");
        query.setParameter("name", "Vasya").setFirstResult(10).setMaxResults(5);
        List<Person> persons = query.getResultList();
        for (Person person : persons) {
            person.getEvents().forEach(System.out::println);
            person.printFirstEvent();
        }
        return persons;

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void savePerson(Person person) {
        entityManager.persist(person);
        person.setName(person.getName().toUpperCase());
    }
}




