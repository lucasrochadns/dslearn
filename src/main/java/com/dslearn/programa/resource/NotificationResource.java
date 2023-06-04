package com.dslearn.programa.resource;


import com.dslearn.programa.domain.dto.NotificationDTO;
import com.dslearn.programa.domain.utilitarios.ModelMapperUtil;
import com.dslearn.programa.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {

	@Autowired
	private NotificationService service;

	@Autowired
	private ModelMapperUtil mapperUtil;
	@GetMapping
	public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(Pageable pageable) {
		
		Page<NotificationDTO> page = service.notificationsForCurrentUser(pageable)
				.map(x -> new NotificationDTO(x));
		return ResponseEntity.ok().body(page);
	}
}
