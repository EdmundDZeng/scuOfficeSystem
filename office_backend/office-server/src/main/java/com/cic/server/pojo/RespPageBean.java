package com.cic.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页公共返回对象
 *
 * @author zfr
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    //总条数
    private Long total;
    //数据list
    private List<?> data;
}
