package service;

import model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    void addRole(Role role);
    Role getById(long id);
    void removeById(long id);
}
