package com.cic.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cic.server.mapper.MenuRoleMapper;
import com.cic.server.pojo.MenuRole;
import com.cic.server.pojo.RespBean;
import com.cic.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * @param rid 角色id
     * @param mids 菜单id
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>()
                                .eq("rid", rid));
        if (null == mids || 0 == mids.length)
            return  RespBean.success("更新成功");

        Integer result = menuRoleMapper.insertRecords(rid,mids);
        if (mids.length==result){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
