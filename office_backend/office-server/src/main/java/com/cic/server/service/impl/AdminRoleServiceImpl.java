package com.cic.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cic.server.mapper.AdminRoleMapper;
import com.cic.server.pojo.AdminRole;
import com.cic.server.service.IAdminRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
