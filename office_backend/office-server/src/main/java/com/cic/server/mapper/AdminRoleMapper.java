package com.cic.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cic.server.pojo.AdminRole;
import com.cic.server.pojo.RespBean;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
    Integer updateAdminRole(@Param("adminId") Integer adminId, Integer[] rids);
}
