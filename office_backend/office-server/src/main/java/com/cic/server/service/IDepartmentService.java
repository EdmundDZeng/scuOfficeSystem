package com.cic.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cic.server.pojo.Department;
import com.cic.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);

    /**
     * 删除部门
     * @param id
     * @return
     */
    RespBean deleteDep(Integer id);
}
