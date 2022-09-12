package com.cic.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回结果对象
 *
 * @author zfr
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    //状态码
    private long code;
    //提示信息
    private String message;
    //返回对象
    private Object obj;

    /**
     * 成功返回结果
     *
     * @param message
     * @return
     */
    public static RespBean success(String message) {
        return success(message, null);
    }

    /**
     * 成功返回结果
     *
     * @param message
     * @param obj
     * @return
     */
    public static RespBean success(String message, Object obj) {
        return new RespBean(200, message, obj);
    }

    /**
     * 失败返回结果
     *
     * @param message
     * @return
     */
    public static RespBean error(String message) {
        return error(message, null);
    }

    /**
     * 失败返回结果
     *
     * @param message
     * @param obj
     * @return
     */
    public static RespBean error(String message, Object obj) {
        return new RespBean(500, message, obj);
    }

}
