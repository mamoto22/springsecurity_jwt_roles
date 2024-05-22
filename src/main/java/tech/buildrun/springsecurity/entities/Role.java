package tech.buildrun.springsecurity.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_roles")
public class Role {
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;

    private String name;

    public enum Value{
        ADMIN(1L),
        BASIC(2L);

        long roleId;

        Value(long roleId) {
            this.roleId = roleId;
        }
        public long getRoleId() {
            return roleId;
        }
    }
}
