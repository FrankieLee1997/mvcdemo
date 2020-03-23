package com.lfy.mvcdemo.dao;

import com.lfy.mvcdemo.bean.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface taskDao {
    @Insert("insert into task(id,content,createdTime) values (#{id},#{content},#{createdTime})")
    void addTask(Task task);

    @Update("update task set id=#{id},content=#{content},createdTime=#{createdTime}")
    void updateTask(Task task);

    @Delete("delete from task where id=#{id}")
    void deleteTask(Task task);

    @Select("select id,content,createdTime from task where id=#{taskId}")
    Task searchTaskById(@Param("taskId") int taskId);

    @Select("select id,content,createdTime from task")
    List<Task> searchAll();
}
