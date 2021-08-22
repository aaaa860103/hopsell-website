package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.util.Date;

@TableName("news")
@Data
public class News {

    @TableId(type = IdType.AUTO)    // 資料庫 table 名稱不同的話 要補 value
    private Integer id;
    private String title;
    private String content;
    private String author;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")      // 時間
    private Date time;


}
