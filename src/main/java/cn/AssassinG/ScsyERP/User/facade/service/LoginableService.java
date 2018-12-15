package cn.AssassinG.ScsyERP.User.facade.service;

import cn.AssassinG.ScsyERP.User.facade.entity.User;
import cn.AssassinG.ScsyERP.common.core.service.BaseService;
import cn.AssassinG.ScsyERP.common.entity.LoginableEntity;
import cn.AssassinG.ScsyERP.common.exceptions.BizException;
import cn.AssassinG.ScsyERP.common.exceptions.DaoException;

public interface LoginableService<T extends LoginableEntity> extends BaseService<T> {
    Long createWithUser(T entity, User user) throws DaoException, BizException;
    void deleteByUserId(Long userId);
}
