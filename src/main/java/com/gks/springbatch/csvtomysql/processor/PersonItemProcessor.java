package com.gks.springbatch.csvtomysql.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

import com.gks.springbatch.csvtomysql.model.Person;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

  @Override
  public Person process(Person person) throws Exception {
    final String firstName = person.getFirstName().toUpperCase();
    final String lastName = person.getLastName().toUpperCase();
    final Person transformedPerson = new Person(firstName, lastName);
    log.info("Converting (" + person + ") into (" + transformedPerson + ")");

    return transformedPerson;
  }
}