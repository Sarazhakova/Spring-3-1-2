package dao;

import model.Role;

import java.util.List;

public interface RoleDAO {
    List<Role> getAllRoles();
    void addRole(Role role);
    Role getById(long id);
    void removeById(long id);
}
