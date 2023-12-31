package br.edu.school.future.contoller;

import br.edu.school.future.domain.dto.request.StructureRequest;
import br.edu.school.future.domain.dto.response.StructureResponse;
import br.edu.school.future.service.SubjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/subjects/")
public class SubjectsController {

    @Autowired
    private SubjectService service;

    @GetMapping("searchAllSubjects")
    public List<StructureResponse> searchAll(){
        return service.findAll();
    }

    @PostMapping("insertNewSubject")
    public StructureResponse insertSubject(@RequestBody StructureRequest request){
        return service.insertSubject(request);
    }
}
