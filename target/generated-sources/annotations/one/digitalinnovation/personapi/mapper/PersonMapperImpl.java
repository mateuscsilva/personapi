package one.digitalinnovation.personapi.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Address;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.entity.Pet;
import one.digitalinnovation.personapi.entity.Phone;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-24T11:49:25-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        if ( personDTO.getBirthDate() != null ) {
            person.setBirthDate( LocalDate.parse( personDTO.getBirthDate(), DateTimeFormatter.ofPattern( "dd-MM-yyyy" ) ) );
        }
        person.setId( personDTO.getId() );
        person.setFirstName( personDTO.getFirstName() );
        person.setLastName( personDTO.getLastName() );
        person.setCpf( personDTO.getCpf() );
        List<Phone> list = personDTO.getPhones();
        if ( list != null ) {
            person.setPhones( new ArrayList<Phone>( list ) );
        }
        List<Address> list1 = personDTO.getAddresses();
        if ( list1 != null ) {
            person.setAddresses( new ArrayList<Address>( list1 ) );
        }
        List<Pet> list2 = personDTO.getPets();
        if ( list2 != null ) {
            person.setPets( new ArrayList<Pet>( list2 ) );
        }

        return person;
    }

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( person.getId() );
        personDTO.setFirstName( person.getFirstName() );
        personDTO.setLastName( person.getLastName() );
        personDTO.setCpf( person.getCpf() );
        if ( person.getBirthDate() != null ) {
            personDTO.setBirthDate( DateTimeFormatter.ISO_LOCAL_DATE.format( person.getBirthDate() ) );
        }
        List<Phone> list = person.getPhones();
        if ( list != null ) {
            personDTO.setPhones( new ArrayList<Phone>( list ) );
        }
        List<Address> list1 = person.getAddresses();
        if ( list1 != null ) {
            personDTO.setAddresses( new ArrayList<Address>( list1 ) );
        }
        List<Pet> list2 = person.getPets();
        if ( list2 != null ) {
            personDTO.setPets( new ArrayList<Pet>( list2 ) );
        }

        return personDTO;
    }
}
