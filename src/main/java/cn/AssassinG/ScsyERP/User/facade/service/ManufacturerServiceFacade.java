package cn.AssassinG.ScsyERP.User.facade.service;

import cn.AssassinG.ScsyERP.User.facade.entity.Manufacturer;
import cn.AssassinG.ScsyERP.common.exceptions.BizException;
import cn.AssassinG.ScsyERP.common.exceptions.DaoException;

public interface ManufacturerServiceFacade extends LoginableService<Manufacturer> {
    void addWorkshops(Long entityId, String jsonArrayStr) throws BizException, DaoException;
    void removeWorkshop(Long entityId, Long workshopId);
}
