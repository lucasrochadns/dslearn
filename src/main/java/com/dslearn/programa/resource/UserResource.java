package com.dslearn.programa.resource;


import com.dslearn.programa.domain.dto.UserDTO;
import com.dslearn.programa.domain.utilitarios.ModelMapperUtil;
import com.dslearn.programa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@Autowired
	private ModelMapperUtil mapperUtil;
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(mapperUtil.mapTo(service.findById(id), UserDTO.class));
	}
}
