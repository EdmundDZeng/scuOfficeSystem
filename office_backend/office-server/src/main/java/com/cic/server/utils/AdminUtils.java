package com.cic.server.utils;

import com.cic.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author zfr
 * @version 1.0
 */
public class AdminUtils {
    /**
     * 获取当前登录操作员
     * @return
     */
    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
