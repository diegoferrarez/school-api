package br.edu.school.future.util.mapper;

import br.edu.school.future.domain.CurricularStructure;
import br.edu.school.future.domain.RegisterStudents;
import br.edu.school.future.domain.dto.response.RegisterResponse;
import br.edu.school.future.domain.dto.response.StructureResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperConfig {

    private final ObjectMapper mapper;

    @SneakyThrows
    public RegisterResponse toResponse(HttpStatus ok, RegisterStudents students) {
        var json = this.mapper.writeValueAsString(students);
        return this.mapper.readValue(json, RegisterResponse.class);
    }

    @SneakyThrows
    public StructureResponse toResponseSubject(HttpStatus ok, CurricularStructure subject) {
        var json = this.mapper.writeValueAsString(subject);
        return this.mapper.readValue(json, StructureResponse.class);
    }
}
