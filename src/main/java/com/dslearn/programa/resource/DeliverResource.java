package com.dslearn.programa.resource;


import com.dslearn.programa.domain.dto.DeliverRevisionDTO;
import com.dslearn.programa.domain.entities.Deliver;
import com.dslearn.programa.domain.utilitarios.ModelMapperUtil;
import com.dslearn.programa.service.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {

	@Autowired
	private DeliverService service;

	@Autowired
	private ModelMapperUtil mapperUtil;

	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto) {
		service.saveRevision(id, mapperUtil.mapTo(dto, Deliver.class));
		return ResponseEntity.noContent().build();
	}
}
