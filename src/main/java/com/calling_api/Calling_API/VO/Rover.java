package com.calling_api.Calling_API.VO;

import java.sql.Date;

public class Rover {
        
        private int id;
        private String name;
        private Date landing_date;
        private Date launch_date;
        private String status;
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
        public Date getLanding_date() {
            return landing_date;
        }
        public void setLanding_date(Date landing_date) {
            this.landing_date = landing_date;
        }
        public Date getLaunch_date() {
            return launch_date;
        }
        public void setLaunch_date(Date launch_date) {
            this.launch_date = launch_date;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        @Override
        public String toString() {
            return "Rover [id=" + id + ", landing_date=" + landing_date + ", launch_date=" + launch_date + ", name="
                    + name + ", status=" + status + "]";
        }
}
