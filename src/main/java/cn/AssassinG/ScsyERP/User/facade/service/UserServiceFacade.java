package cn.AssassinG.ScsyERP.User.facade.service;

import cn.AssassinG.ScsyERP.User.facade.entity.Permission;
import cn.AssassinG.ScsyERP.User.facade.entity.Role;
import cn.AssassinG.ScsyERP.User.facade.entity.User;
import cn.AssassinG.ScsyERP.User.facade.entity.User_Permission;
import cn.AssassinG.ScsyERP.common.core.service.BaseService;

import java.util.List;
import java.util.Set;

public interface UserServiceFacade extends BaseService<User> {
    User findUserByUname(String username);
    User findUserByPhone(String phone);
    List<User> findAllUser();
    String getVcode(String phone);
    boolean login(String userName, String password);
    void ChangePSW(String phone, String vcode, String newPassWord);
    void ChangeUserName(Long userId, String Vcode, String newUserName);
    void ChangeUserName(User user, String Vcode, String newUserName);
    void ChangePhone(Long userId, String Vcode, String newPhone);
    void ChangePhone(User user, String Vcode, String newPhone);

    Set<Role> findUserRoles(Long userId);
    Set<Permission> findUserFinalPermissions(Long userId);
    List<User_Permission> findUserPermissions(Long userId);
    void addUserRole(Long userId, Long roleId);
    void removeUserRole(Long userId, Long roleId);
    void addUserPermission(Long userId, Long permissionId, Integer type);
    void removeUserPermission(Long userId, Long permissionId, Integer type);
}
