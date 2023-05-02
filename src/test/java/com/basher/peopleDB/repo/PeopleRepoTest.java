package com.basher.peopleDB.repo;

import com.basher.peopleDB.model.Person;
import org.junit.jupiter.api.Test;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeopleRepoTest {
    @Test
    Person john= new Person("john","smith",ZonedDateTime.of(1990,11,25,11,50,45,999,ZoneId.of("+3")));

    public void CanTest(){
        PEOPLERePo Repo= new  PEOPLERePo();


       Person  Repo.save(john);
    }

}
