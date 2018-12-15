package cn.AssassinG.ScsyERP.User.facade.service;

import cn.AssassinG.ScsyERP.User.facade.entity.Permission;
import cn.AssassinG.ScsyERP.common.core.service.BaseService;

import java.util.List;

public interface PermissionServiceFacade extends BaseService<Permission> {
    List<Permission> findAllPermission();
}
