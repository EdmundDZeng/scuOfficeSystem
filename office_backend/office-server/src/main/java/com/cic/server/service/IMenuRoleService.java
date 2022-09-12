package com.cic.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cic.server.pojo.MenuRole;
import com.cic.server.pojo.RespBean;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid 角色id
     * @param mids 菜单id
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
