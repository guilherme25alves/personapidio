package one.dio.personapidio.service;

import one.dio.personapidio.dto.MessageResponseDTO;
import one.dio.personapidio.entity.Person;
import one.dio.personapidio.repository.IPersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private IPersonRepository personRepository;

    public PersonService(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
