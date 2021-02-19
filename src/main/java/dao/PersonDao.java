package dao;

import beans.Person;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class PersonDao {
    private HibernateTemplate template;

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public void savePerson(Person person){
        template.save(person);
    }
}
