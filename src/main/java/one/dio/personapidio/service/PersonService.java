package one.dio.personapidio.service;

import one.dio.personapidio.dto.MessageResponseDTO;
import one.dio.personapidio.dto.request.PersonDTO;
import one.dio.personapidio.entity.Person;
import one.dio.personapidio.exception.PersonNotFoundException;
import one.dio.personapidio.mapper.PersonMapper;
import one.dio.personapidio.repository.IPersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private IPersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public PersonService(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {

        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);

        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);

        return personMapper.toDTO(person);
    }

    public void delete(Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);

        personRepository.deleteById(id);
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }
}
