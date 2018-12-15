package cn.AssassinG.ScsyERP.User.facade.service;

import cn.AssassinG.ScsyERP.User.facade.entity.Permission;
import cn.AssassinG.ScsyERP.User.facade.entity.Role;
import cn.AssassinG.ScsyERP.common.core.service.BaseService;

import java.util.List;
import java.util.Set;

public interface RoleServiceFacade extends BaseService<Role> {

    Role findRoleByRoleName(String roleName);
    List<Role> findAllRoles();
    Set<Permission> findRolePermissions(Long roleId);
    Set<Permission> findFatherRolePermissions(Long roleId);
    List<Role> findChildrenRoles(String superRoleName);
    void addRolePermission(Long roleId, Long permissionId);
    void removeRolePermission(Long roleId, Long permissionId);
}
