package 枚举;

public enum UserTypeEnum {
    AGENT("10" , "代理商"){
        @Override
        public boolean havePositionPermission() {
            return true;
        }

        @Override
        public boolean haveAllShopStationPermission() {
            return true;
        }
    },
    FRANCHISEE("20" , "加盟商") {
        @Override
        public boolean havePositionPermission() {
            return true;
        }

        @Override
        public boolean haveAllShopStationPermission() {
            return true;
        }
    },
    SERVICEPROVIDER("30" , "服务商") {
        @Override
        public boolean havePositionPermission() {
            return true;
        }

        @Override
        public boolean haveAllShopStationPermission() {
            return false;
        }
    },
    STAFF("40" , "员工") {
        @Override
        public boolean havePositionPermission() {
            return true;
        }

        @Override
        public boolean haveAllShopStationPermission() {
            return false;
        }
    },
    MERCHANT("50","商户") {
        @Override
        public boolean havePositionPermission() {
            return false;
        }

        @Override
        public boolean haveAllShopStationPermission() {
            return false;
        }
    },
    CHANNELBUSINESS("60" , "渠道商") {
        @Override
        public boolean havePositionPermission() {
            return false;
        }

        @Override
        public boolean haveAllShopStationPermission() {
            return false;
        }
    };

    UserTypeEnum(String code, String des){
        this.code = code;
        this.des = des;
    }


    private String code ;
    private String des;

    public String getCode() {
        return code;
    }

    public String getDes() {
        return des;
    }

    public abstract boolean havePositionPermission();

    public abstract boolean haveAllShopStationPermission();

}
