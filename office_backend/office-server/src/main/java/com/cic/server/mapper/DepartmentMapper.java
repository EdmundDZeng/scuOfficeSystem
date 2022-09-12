package com.cic.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cic.server.pojo.Department;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zfr
 * @since 2022-09-08
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments(Integer parentId);

    /**
     * 添加部门
     * @param dep
     */
    void addDep(Department dep);

    /**
     * 删除部门
     * @param dep
     */
    void deleteDep(Department dep);
}
