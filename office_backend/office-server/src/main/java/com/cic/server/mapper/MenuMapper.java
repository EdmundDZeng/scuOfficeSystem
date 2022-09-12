package com.cic.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cic.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 通过管理员id获取菜单列表
     *
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);


    /**
     * 通过角色获取菜单列表
     *
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
