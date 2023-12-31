package com.chicmic.eNaukri.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="userRoles")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    Roles roleId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    Users userId;
    @Column(name = "deleted")
    private boolean deleted = false;
}
