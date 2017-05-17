package com.farukcankaya.expandablefilter;

import android.content.res.ColorStateList;

/**
 * Created by farukcankaya on 15/05/2017.
 */

public class Config {
    private final int itemPadding;
    private final int itemDividerMargin;
    private final ColorStateList itemTextColor;
    private final int radius;
    private final int defaultTextColor;
    private final int activeTextColor;
    private final int defaultBackgroundColor;
    private final int activeBackgroundColor;

    private Config(ConfigBuilder configBuilder) {
        itemPadding = configBuilder.itemPadding;
        itemDividerMargin = configBuilder.itemDividerMargin;
        itemTextColor = configBuilder.itemTextColor;
        radius = configBuilder.radius;
        defaultTextColor = configBuilder.defaultTextColor;
        activeTextColor = configBuilder.activeTextColor;
        defaultBackgroundColor = configBuilder.defaultBackgroundColor;
        activeBackgroundColor = configBuilder.activeBackgroundColor;
    }

    public int getItemPadding() {
        return itemPadding;
    }

    public int getItemDividerMargin() {
        return itemDividerMargin;
    }

    public ColorStateList getItemTextColor() {
        return itemTextColor;
    }

    public int getRadius() {
        return radius;
    }

    public int getDefaultTextColor() {
        return defaultTextColor;
    }

    public int getActiveTextColor() {
        return activeTextColor;
    }

    public int getDefaultBackgroundColor() {
        return defaultBackgroundColor;
    }

    public int getActiveBackgroundColor() {
        return activeBackgroundColor;
    }

    public static class ConfigBuilder {
        private int itemPadding;
        private int itemDividerMargin;
        private ColorStateList itemTextColor;
        private int radius;
        private int defaultTextColor;
        private int activeTextColor;
        private int defaultBackgroundColor;
        private int activeBackgroundColor;

        /**
         * @param itemPadding in pixels
         * @return
         */
        public ConfigBuilder setItemPadding(int itemPadding) {
            this.itemPadding = itemPadding;
            return this;
        }

        /**
         * @param itemDividerMargin between two filter item in pixels
         * @return
         */
        public ConfigBuilder setItemDividerMargin(int itemDividerMargin) {
            this.itemDividerMargin = itemDividerMargin;
            return this;
        }

        /**
         * @param itemTextColor is {@link ColorStateList}.
         *                      You can specify different color for different state with this attribute.
         *                      Also see {@link #setDefaultTextColor(int)} and {@link #setActiveTextColor(int)}.
         *                      <p>
         *                      These attributes can be used with @param itemTextColor but they override the default and active state.
         * @return
         */
        public ConfigBuilder setItemTextColor(ColorStateList itemTextColor) {
            this.itemTextColor = itemTextColor;
            return this;
        }

        /**
         * @param radius in pixels
         * @return
         */
        public ConfigBuilder setRadius(int radius) {
            this.radius = radius;
            return this;
        }

        /**
         * @param defaultTextColor
         * @return
         */
        public ConfigBuilder setDefaultTextColor(int defaultTextColor) {
            this.defaultTextColor = defaultTextColor;
            return this;
        }

        /**
         * @param activeTextColor
         * @return
         */
        public ConfigBuilder setActiveTextColor(int activeTextColor) {
            this.activeTextColor = activeTextColor;
            return this;
        }

        /**
         * @param defaultBackgroundColor
         * @return
         */
        public ConfigBuilder setDefaultBackgroundColor(int defaultBackgroundColor) {
            this.defaultBackgroundColor = defaultBackgroundColor;
            return this;
        }

        public ConfigBuilder setActiveBackgroundColor(int activeBackgroundColor) {
            this.activeBackgroundColor = activeBackgroundColor;
            return this;
        }

        public Config build() {
            return new Config(this);
        }
    }

}