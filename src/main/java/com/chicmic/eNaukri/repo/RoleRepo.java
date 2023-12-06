package com.chicmic.eNaukri.repo;

import com.chicmic.eNaukri.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Long> {
    Roles findByRoleName(String roleName);
}
