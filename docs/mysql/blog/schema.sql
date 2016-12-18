-- Coder Blog Schema.sql

DROP TABLE IF EXISTS `blog_articles`;
CREATE TABLE `blog_articles` (
  `id`            INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` INT(10) UNSIGNED NOT NULL
  COMMENT '用户 ID',
  `title`         VARCHAR(64)      NOT NULL
  COMMENT '文章标题',
  `content`       LONGTEXT         NOT NULL
  COMMENT '文章内容',
  `html_content`  LONGTEXT         NOT NULL
  COMMENT 'content 编译成的 html',
  `description`   TEXT             NOT NULL,
  COMMENT '文章摘要',
  `type`          TINYINT(4)       NOT NULL DEFAULT '1'
  COMMENT '文章类型(1 -- 原创, 2 -- 翻译, 3 -- 转载)',
  `original_address`               NOT NULL
  COMMENT '原文地址(翻译、转载必需注明原文地址, 原创则此字段为本文地址)',
  `category_id`   INT(10) UNSIGNED NOT NULL
  COMMENT '分类 ID',
  `article_class` INT(10) UNSIGNED NOT NULL
  COMMENT '首页分类 ID',
  `thumb_num`     INT(10) UNSIGNED NOT NULL DEFAULT '0'
  COMMENT '点赞人数',
  `read_num`      BIGINT(20)       NOT NULL DEFAULT '1'
  COMMENT '阅读(点击)人数',
  `hidden`        TINYINT(2)       NOT NULL DEFAULT '0'
  COMMENT '是否隐藏',
  `created_at`    DATETIME         NOT NULL,
  `updated_at`    DATETIME         NOT NULL,
  `deleted_at`    DATETIME         NOT NULL DEFAULT '1970-01-01 00:00:00'
)
  ENGINE = InnoDB
  COMMENT = '悬赏报名';

DROP TABLE IF EXISTS `article_categories`;
CREATE TABLE `article_categories` (
  `id`         INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`       VARCHAR(10)      NOT NULL
  COMMENT '分类名称',
  `sequence`   INT(3)           NOT NULL
  COMMENT '排序',
  `created_at` DATETIME         NOT NULL,
  `updated_at` DATETIME         NOT NULL,
  `deleted_at` DATETIME         NOT NULL DEFAULT '1970-01-01 00:00:00'
)
  ENGINE = InnoDB
  COMMENT = '文章分类';

DROP TABLE IF EXISTS `article_tags`;
CREATE TABLE `article_tags` (
  `id`         INT(12) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`       VARCHAR(10)      NOT NULL,
  `created_at` DATETIME         NOT NULL,
  `updated_at` DATETIME         NOT NULL,
  `deleted_at` DATETIME         NOT NULL DEFAULT '1970-01-01 00:00:00'
)
  ENGINE = InnoDB
  COMMENT = '标签';

DROP TABLE IF EXISTS `article_with_tags`;
CREATE TABLE `article_width_tags` (
  `id`         INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `article_id` INT(10) UNSIGNED NOT NULL
  COMMENT '文章 ID',
  `tag_id`     INT(12) UNSIGNED NOT NULL
  COMMENT '标签 ID',
  `created_at` DATETIME         NOT NULL,
  `updated_at` DATETIME         NOT NULL,
  `deleted_at` DATETIME         NOT NULL DEFAULT '1970-01-01 00:00:00'
)
  ENGINE = InnoDB
  COMMENT = '文章标签关系表';

DROP TABLE IF EXISTS `article_comments`;
CREATE TABLE `article_comments` (
  `id`         INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` INT(10) UNSIGNED NOT NULL
  COMMENT '用户 ID',
  `content` LONGTEXT NOT NULL
  COMMENT '回复内容 (MD)',
  `html_content` LONGTEXT NOT NULL
  COMMENT '回复内容 html',
  `thumb_num` INT(10) UNSIGNED NOT NULL
  COMMENT '点赞数量',
  `floor` INT(10) UNSIGNED NOT NULL
  COMMENT '楼层',
  `device_type` VARCHAR(50) DEFAULT NULL
  COMMENT '设备类型',
  `created_at` DATETIME         NOT NULL,
  `updated_at` DATETIME         NOT NULL,
  `deleted_at` DATETIME         NOT NULL DEFAULT '1970-01-01 00:00:00'
)
  ENGINE = InnoDB
  COMMENT = '文章评论表';

DROP TABLE IF EXISTS `thumbs`;
CREATE TABLE `thumbs` (
  `id`         INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` INT(10) UNSIGNED NOT NULL
  COMMENT '用户 ID',
  `type` TINYINT(4) UNSIGNED NOT NULL
  COMMENT '评论类型, 1 -- 文章, 2 -- 评论',
  `entity_id` INT(10) UNSIGNED NOT NULL
  COMMENT '实体 ID (文章、评论 ID)',
  `vote_type` TINYINT(4) UNSIGNED NOT NULL
  COMMENT '点赞类型',
  `created_at` DATETIME         NOT NULL,
  `updated_at` DATETIME         NOT NULL,
  `deleted_at` DATETIME         NOT NULL DEFAULT '1970-01-01 00:00:00'
)
  ENGINE = InnoDB
  COMMENT = '文章、评论点赞关系表'

