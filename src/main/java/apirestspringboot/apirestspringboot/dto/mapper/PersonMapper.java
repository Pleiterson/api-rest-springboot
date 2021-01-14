package apirestspringboot.apirestspringboot.dto.mapper;

import apirestspringboot.apirestspringboot.dto.request.PersonDTO;
import apirestspringboot.apirestspringboot.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public class PersonMapper {
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
