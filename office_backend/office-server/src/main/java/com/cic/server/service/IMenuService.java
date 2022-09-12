package com.cic.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cic.server.pojo.Menu;
import com.cic.server.pojo.Role;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface IMenuService extends IService<Menu> {


    /**
     * 通过管理员id获取菜单
     * @return
     */
    List<Menu> getMenusByAdminId();

    /**
     * 通过角色获取菜单列表
     * @return
     */
    List<Menu> getAllMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
