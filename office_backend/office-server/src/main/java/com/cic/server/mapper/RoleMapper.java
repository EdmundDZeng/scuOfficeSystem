package com.cic.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cic.server.pojo.Role;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id获取用户权限
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
