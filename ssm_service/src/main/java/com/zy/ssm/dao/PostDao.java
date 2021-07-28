package com.zy.ssm.dao;

import com.zy.ssm.entity.Post;
import com.zy.ssm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao {
    int insert(Post post);
    Post selectByName(String ptitle);
    List<Post> selectById(@Param("id")int id, @Param("end_id")int end_id);
    int updateByName(@Param("ptitle")String ptitle, @Param("pcontext")String pcontext);
    List<Post> selectByType(@Param("ptype")String ptype);

}
