package orm_test;

import beans.Person;
import dao.PersonDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_Hibernate {
    ApplicationContext applicationContext;

    @Before
    public void readContext(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void insertionTest(){
        Person person = new Person("sepehr", "mollaei", 20, 985462);

        PersonDao personDao = (PersonDao) applicationContext.getBean("dao");

        personDao.savePerson(person);
    }

}
