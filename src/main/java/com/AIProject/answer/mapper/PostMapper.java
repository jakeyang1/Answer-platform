package com.AIProject.answer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AIProject.answer.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author <a>元升</a>
 * @from <a>个人作品</a>
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




