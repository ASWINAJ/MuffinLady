package com.example.android.muffinlady;


    public class Cakes {

        private int icon;
        private int price;
        private String desc;

        public int getIcon() {
            return icon;
        }

        public void setIcon(int icon) {
            this.icon = icon;
        }

        public Cakes(int i,int p,String d)
        {
            super();

            this.icon=i;
            this.price=p;
            this.desc=d;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }


