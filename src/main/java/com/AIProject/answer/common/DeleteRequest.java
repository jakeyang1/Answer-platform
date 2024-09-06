package com.AIProject.answer.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author <a>元升</a>
 * @from <a>个人作品</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}