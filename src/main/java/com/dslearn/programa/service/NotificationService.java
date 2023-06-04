package com.dslearn.programa.service;


import com.dslearn.programa.domain.entities.Notification;
import com.dslearn.programa.domain.entities.User;
import com.dslearn.programa.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<Notification> notificationsForCurrentUser(Pageable pageable) {
        User user = authService.authenticated();
        return repository.findByUser(user, pageable);
    }
}
