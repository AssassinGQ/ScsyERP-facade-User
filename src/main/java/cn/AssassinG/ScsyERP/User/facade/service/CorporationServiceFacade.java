package cn.AssassinG.ScsyERP.User.facade.service;

import cn.AssassinG.ScsyERP.User.facade.entity.Corporation;
import cn.AssassinG.ScsyERP.User.facade.entity.User;
import cn.AssassinG.ScsyERP.common.exceptions.BizException;
import cn.AssassinG.ScsyERP.common.exceptions.DaoException;

import java.util.Map;

public interface CorporationServiceFacade extends LoginableService<Corporation> {
    Long create(String token, User user, Map<String, Object> paramMap) throws DaoException, BizException;
}