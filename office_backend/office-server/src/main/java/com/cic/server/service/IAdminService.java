package com.cic.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cic.server.pojo.Admin;
import com.cic.server.pojo.RespBean;
import com.cic.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     *
     * @param password
     * @param username
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);

    /**
     * 根据用户id获取用户权限
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 获取所有操作员
     *
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(String keywords);

    /**
     * 更新操作员的角色
     *
     * @param adminId
     * @param rids
     * @return
     */
    RespBean updateAdminRole(Integer adminId, Integer[] rids);

    /**
     * 更新用户密码
     *
     * @param oldPass
     * @param pass
     * @param adminId
     * @return
     */
    RespBean updatePassword(String oldPass, String pass, Integer adminId);
}
