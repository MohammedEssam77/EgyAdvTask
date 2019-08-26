package com.example.test.model;

import com.example.test.interfaces.MyCallback;

import java.util.List;

public class LoginModel  {
    /**
     * status : 1
     * message : تم تسجيل الدخول
     * data : {"user":{"user_id":4,"role_id":"3","city_id":"1","user_firstname":"Mohamed","user_lastname":"A","user_email":"v@dm.com","user_mobile":"123456789","is_active":"1","user_lat":"30.108689399861362","user_lng":"31.368483850726307","email_verified_at":null,"created_at":"2018-10-26 03:13:54","updated_at":"2019-08-24 21:44:54","user_rate":"0","user_rate_count":"0","extra_mobile":null,"user_bio":null,"confirm_code":null,"is_confirmed":"0","is_accepted":"1","user_img":"1540758508.jpg","user_header":null,"role":null,"upload_id":null,"proff":null,"sub_proff":null,"price_id":null,"user_credit":"0","lang":"ar","recover":null,"my_followers":"0","following":"0","is_verified":"0","city":{"id":1,"name":"الرياض"}}}
     * extra : []
     */

    private int status;
    private String message;
    private DataBean data;
    private List<?> extra;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public List<?> getExtra() {
        return extra;
    }

    public void setExtra(List<?> extra) {
        this.extra = extra;
    }


    public static class DataBean {
        /**
         * user : {"user_id":4,"role_id":"3","city_id":"1","user_firstname":"Mohamed","user_lastname":"A","user_email":"v@dm.com","user_mobile":"123456789","is_active":"1","user_lat":"30.108689399861362","user_lng":"31.368483850726307","email_verified_at":null,"created_at":"2018-10-26 03:13:54","updated_at":"2019-08-24 21:44:54","user_rate":"0","user_rate_count":"0","extra_mobile":null,"user_bio":null,"confirm_code":null,"is_confirmed":"0","is_accepted":"1","user_img":"1540758508.jpg","user_header":null,"role":null,"upload_id":null,"proff":null,"sub_proff":null,"price_id":null,"user_credit":"0","lang":"ar","recover":null,"my_followers":"0","following":"0","is_verified":"0","city":{"id":1,"name":"الرياض"}}
         */

        private UserBean user;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * user_id : 4
             * role_id : 3
             * city_id : 1
             * user_firstname : Mohamed
             * user_lastname : A
             * user_email : v@dm.com
             * user_mobile : 123456789
             * is_active : 1
             * user_lat : 30.108689399861362
             * user_lng : 31.368483850726307
             * email_verified_at : null
             * created_at : 2018-10-26 03:13:54
             * updated_at : 2019-08-24 21:44:54
             * user_rate : 0
             * user_rate_count : 0
             * extra_mobile : null
             * user_bio : null
             * confirm_code : null
             * is_confirmed : 0
             * is_accepted : 1
             * user_img : 1540758508.jpg
             * user_header : null
             * role : null
             * upload_id : null
             * proff : null
             * sub_proff : null
             * price_id : null
             * user_credit : 0
             * lang : ar
             * recover : null
             * my_followers : 0
             * following : 0
             * is_verified : 0
             * city : {"id":1,"name":"الرياض"}
             */

            private int user_id;
            private String role_id;
            private String city_id;
            private String user_firstname;
            private String user_lastname;
            private String user_email;
            private String user_mobile;
            private String is_active;
            private String user_lat;
            private String user_lng;
            private Object email_verified_at;
            private String created_at;
            private String updated_at;
            private String user_rate;
            private String user_rate_count;
            private Object extra_mobile;
            private Object user_bio;
            private Object confirm_code;
            private String is_confirmed;
            private String is_accepted;
            private String user_img;
            private Object user_header;
            private Object role;
            private Object upload_id;
            private Object proff;
            private Object sub_proff;
            private Object price_id;
            private String user_credit;
            private String lang;
            private Object recover;
            private String my_followers;
            private String following;
            private String is_verified;
            private CityBean city;

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getRole_id() {
                return role_id;
            }

            public void setRole_id(String role_id) {
                this.role_id = role_id;
            }

            public String getCity_id() {
                return city_id;
            }

            public void setCity_id(String city_id) {
                this.city_id = city_id;
            }

            public String getUser_firstname() {
                return user_firstname;
            }

            public void setUser_firstname(String user_firstname) {
                this.user_firstname = user_firstname;
            }

            public String getUser_lastname() {
                return user_lastname;
            }

            public void setUser_lastname(String user_lastname) {
                this.user_lastname = user_lastname;
            }

            public String getUser_email() {
                return user_email;
            }

            public void setUser_email(String user_email) {
                this.user_email = user_email;
            }

            public String getUser_mobile() {
                return user_mobile;
            }

            public void setUser_mobile(String user_mobile) {
                this.user_mobile = user_mobile;
            }

            public String getIs_active() {
                return is_active;
            }

            public void setIs_active(String is_active) {
                this.is_active = is_active;
            }

            public String getUser_lat() {
                return user_lat;
            }

            public void setUser_lat(String user_lat) {
                this.user_lat = user_lat;
            }

            public String getUser_lng() {
                return user_lng;
            }

            public void setUser_lng(String user_lng) {
                this.user_lng = user_lng;
            }

            public Object getEmail_verified_at() {
                return email_verified_at;
            }

            public void setEmail_verified_at(Object email_verified_at) {
                this.email_verified_at = email_verified_at;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getUser_rate() {
                return user_rate;
            }

            public void setUser_rate(String user_rate) {
                this.user_rate = user_rate;
            }

            public String getUser_rate_count() {
                return user_rate_count;
            }

            public void setUser_rate_count(String user_rate_count) {
                this.user_rate_count = user_rate_count;
            }

            public Object getExtra_mobile() {
                return extra_mobile;
            }

            public void setExtra_mobile(Object extra_mobile) {
                this.extra_mobile = extra_mobile;
            }

            public Object getUser_bio() {
                return user_bio;
            }

            public void setUser_bio(Object user_bio) {
                this.user_bio = user_bio;
            }

            public Object getConfirm_code() {
                return confirm_code;
            }

            public void setConfirm_code(Object confirm_code) {
                this.confirm_code = confirm_code;
            }

            public String getIs_confirmed() {
                return is_confirmed;
            }

            public void setIs_confirmed(String is_confirmed) {
                this.is_confirmed = is_confirmed;
            }

            public String getIs_accepted() {
                return is_accepted;
            }

            public void setIs_accepted(String is_accepted) {
                this.is_accepted = is_accepted;
            }

            public String getUser_img() {
                return user_img;
            }

            public void setUser_img(String user_img) {
                this.user_img = user_img;
            }

            public Object getUser_header() {
                return user_header;
            }

            public void setUser_header(Object user_header) {
                this.user_header = user_header;
            }

            public Object getRole() {
                return role;
            }

            public void setRole(Object role) {
                this.role = role;
            }

            public Object getUpload_id() {
                return upload_id;
            }

            public void setUpload_id(Object upload_id) {
                this.upload_id = upload_id;
            }

            public Object getProff() {
                return proff;
            }

            public void setProff(Object proff) {
                this.proff = proff;
            }

            public Object getSub_proff() {
                return sub_proff;
            }

            public void setSub_proff(Object sub_proff) {
                this.sub_proff = sub_proff;
            }

            public Object getPrice_id() {
                return price_id;
            }

            public void setPrice_id(Object price_id) {
                this.price_id = price_id;
            }

            public String getUser_credit() {
                return user_credit;
            }

            public void setUser_credit(String user_credit) {
                this.user_credit = user_credit;
            }

            public String getLang() {
                return lang;
            }

            public void setLang(String lang) {
                this.lang = lang;
            }

            public Object getRecover() {
                return recover;
            }

            public void setRecover(Object recover) {
                this.recover = recover;
            }

            public String getMy_followers() {
                return my_followers;
            }

            public void setMy_followers(String my_followers) {
                this.my_followers = my_followers;
            }

            public String getFollowing() {
                return following;
            }

            public void setFollowing(String following) {
                this.following = following;
            }

            public String getIs_verified() {
                return is_verified;
            }

            public void setIs_verified(String is_verified) {
                this.is_verified = is_verified;
            }

            public CityBean getCity() {
                return city;
            }

            public void setCity(CityBean city) {
                this.city = city;
            }

            public static class CityBean {
                /**
                 * id : 1
                 * name : الرياض
                 */

                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
