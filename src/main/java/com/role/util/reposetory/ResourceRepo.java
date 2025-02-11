package com.role.util.reposetory;

import com.role.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ResourceRepo extends JpaRepository<Resource, String> {
    Resource findByResource(String resource);
}
