package cn.AssassinG.ScsyERP.User.facade.service;

import cn.AssassinG.ScsyERP.User.facade.entity.Permission;
import cn.AssassinG.ScsyERP.User.facade.entity.Role;
import cn.AssassinG.ScsyERP.User.facade.entity.User;
import cn.AssassinG.ScsyERP.common.core.service.BaseService;

import java.util.List;
import java.util.Set;

public interface UserServiceFacade extends BaseService<User> {
    User findUserByUname(String username);
    User findUserByPhone(String phone);
    String getVcode(String phone);
    boolean login(String userName, String password);
    void ChangePSW(String phone, String vcode, String newPassWord);
    void ChangeUserName(Long userId, String Vcode, String newUserName);
    void ChangeUserName(User user, String Vcode, String newUserName);
    void ChangePhone(Long userId, String Vcode, String newPhone);
    void ChangePhone(User user, String Vcode, String newPhone);

    Role findRoleByRoleName(String rolename);
    Set<Role> findUserRoles(Long userid);
    List<Role> findAllRoles();
    Set<Permission> findRolePermissions(Long roleid);
    Set<Permission> findFatherRolePermissions(Long roleid);
    List<Permission> findAllPermission();
    Set<Permission> findUserPermissions(Long userid);
    void addUserRole(Long userid, Long roleid);
    void removeUserRole(Long userid, Long roleid);
    void addRolePermission(Long roleid, Long permissionid);
    void removeRolePermission(Long roleid, Long permissionid);
    void addUserPermission(Long userId, Long permissionId);
    void removeUserPermission(Long userId, Long permissionId);
}
