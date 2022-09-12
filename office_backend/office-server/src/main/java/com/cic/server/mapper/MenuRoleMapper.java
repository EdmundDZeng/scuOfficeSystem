package com.cic.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cic.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     */
    Integer insertRecords(@Param("rid") Integer rid, Integer[] mids);
}
