package com.altees.account.security.domain;

import com.altees.account.entity.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "roles",schema = "public")
public class Role extends BaseEntity {
    @Id
    private Integer id;

    private String roleName;
}