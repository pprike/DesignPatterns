package com.designpatterns.creational.builder;

public class Burger {

    public static class Builder {

        private String bread;

        private String meat;

        private String cheese;

        private String sauce;

        private boolean isGrilled;

        public Builder () {

        }

        public Burger build() {
            return new Burger(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public Builder isGrilled(boolean isGrilled) {
            this.isGrilled = isGrilled;
            return this;
        }
    }

    private String bread;

    private String meat;

    private String cheese;

    private String sauce;

    private boolean isGrilled;

    private Burger (Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.isGrilled = builder.isGrilled;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isGrilled() {
        return isGrilled;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("bread=").append(bread).append('\n');
        sb.append("meat=").append(meat).append('\n');
        sb.append("cheese=").append(cheese).append('\n');
        sb.append("sauce=").append(sauce).append('\n');
        sb.append("isGrilled=").append(isGrilled);
        return sb.toString();
    }
}