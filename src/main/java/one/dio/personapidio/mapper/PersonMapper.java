package one.dio.personapidio.mapper;

import one.dio.personapidio.dto.request.PersonDTO;
import one.dio.personapidio.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}



/*
*   Temos que criar o método com o nome toModel, é uma conversão do próprio map struct para correto funcionamento
*       da biblioteca
*
* */