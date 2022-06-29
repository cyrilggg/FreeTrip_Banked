package com.example.freetrip_banked.bean;

public class BlogBean {
        /**
         * blog id
         */
        private int id;
        /**
         * 用户id
         */
        private int user_id;

        /**
         * blog标题
         */
        private String title;

        /**
         * blog 内容
         */
        private String content;

        /**
         * blog 时间
         */
        private String build_time;

        /**
         * blog 获赞数
         */
        private String praise;

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setBuild_time(String build_time) {
            this.build_time = build_time;
        }

        public void setPraise(String praise) {
            this.praise = praise;
        }

        public int getId() {
            return id;
        }
        public String getContent() {
            return content;
        }
        public String getBuild_time() {
            return build_time;
        }
        public String getTitle() {
            return title;
        }
        public String getPraise() {
            return praise;
        }
}
