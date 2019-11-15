package com.read.core.service;

import com.read.core.page.PageRequest;
import com.read.core.page.PageResult;

import java.sql.SQLException;
import java.util.List;

public interface CurdService<T> {
    /**
     * 保存操作
     * @param record
     * @return
     */
    int save(T record);

    /**
     * 删除操作
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 批量删除操作
     * @param record
     * @return
     */
    int delete(List<T> record);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    PageResult findPage(PageRequest pageRequest);
}
